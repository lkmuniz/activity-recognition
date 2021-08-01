package br.com.muniz.activityrecognition.model

import android.hardware.SensorEvent
import android.util.Log
import br.com.muniz.activityrecognition.Util.LYING_RANGE
import br.com.muniz.activityrecognition.Util.SIT_RANGE
import br.com.muniz.activityrecognition.Util.WALK_RANGE
import br.com.muniz.activityrecognition.data.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.math.pow
import kotlin.math.sqrt

@Singleton
class VerifyMovement @Inject constructor() {
    private companion object {
        const val TIME_RANGE = 2500
        const val POS_X = 0
        const val POS_Y = 1
        const val POS_Z = 2
    }

    private var initialTime: Long = 0

    private lateinit var sensorData: Array<Double?>
    private val xArray = mutableListOf<Float>()
    private val yArray = mutableListOf<Float>()
    private val zArray = mutableListOf<Float>()

    init {
        initialTime = System.currentTimeMillis()
    }

    fun getMovement(sensorEvent: SensorEvent): Flow<FinalActivity?> = flow {
        if (checkTimeRange()) {
            setupSensorData()
            val finalActivity = getActivity()
            clearData()
            emit(finalActivity)
        } else {
            saveData(sensorEvent)
            emit(null)
        }
    }

    private fun checkTimeRange(): Boolean {
        var timeRange = System.currentTimeMillis() - initialTime

        if (timeRange >= TIME_RANGE) {
            initialTime = System.currentTimeMillis()
            return true
        }
        return false
    }

    private suspend fun setupSensorData() {
        withContext(Dispatchers.IO) {
            val xAverage = xArray.average()
            val yAverage = yArray.average()
            val zAverage = zArray.average()

            val xVariance = calculateVariance(xArray, xAverage.toFloat())
            val yVariance = calculateVariance(yArray, yAverage.toFloat())
            val zVariance = calculateVariance(zArray, zAverage.toFloat())

            val rms = calculateRMS(xAverage, yAverage, zAverage)

            sensorData = arrayOf(xVariance, xAverage, yVariance, yAverage, zVariance, zAverage, rms)
        }
    }

    private suspend fun getActivity(): FinalActivity? = withContext(Dispatchers.IO) {
        try {
            val movement = WekaDataActivity.classify(sensorData).toInt()
            val intensity = when (movement) {
                in WALK_RANGE -> WekaDataIntensityWalk.classify(sensorData).toInt()
                in SIT_RANGE -> WekaDataIntensitySit.classify(sensorData).toInt()
                in LYING_RANGE -> WekaDataIntensityLying.classify(sensorData).toInt()
                else -> -1
            }
            FinalActivity(movement, intensity)
        } catch (e: Throwable) {
            Timber.d(e)
            null
        }
    }

    private fun calculateVariance(list: MutableList<Float>, average: Float): Double {
        var totalSum = 0.0f
        list.forEach {
            totalSum += (it - average).pow(2)
        }
        return (totalSum / list.size).toDouble()
    }

    // sqrt(x^2 + y+2 + z^2)
    private fun calculateRMS(xAverage: Double, yAverage: Double, zAverage: Double): Double {
        val sum = xAverage.pow(2) + yAverage.pow(2) + zAverage.pow(2)
        return sqrt(sum)
    }

    private fun saveData(sensorEvent: SensorEvent) {
        xArray.add(sensorEvent.values[POS_X])
        yArray.add(sensorEvent.values[POS_Y] * -1)
        zArray.add(sensorEvent.values[POS_Z])
    }

    private fun clearData() {
        xArray.clear()
        yArray.clear()
        zArray.clear()

        for (i in sensorData.indices) {
            sensorData[i] = 0.0
        }
    }

}