package br.com.muniz.activityrecognition.ui

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.muniz.activityrecognition.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class FragmentRecognition : Fragment(), SensorEventListener {

    private var sensor: Sensor? = null
    private var sensorManager: SensorManager? = null

    val recognitionViewModel: FragmentRecognitionViewModel by viewModels()

    override fun onStart() {
        super.onStart()
        registerSensors()
    }

    override fun onStop() {
        super.onStop()
        unregisterSensor()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_recognition, container, false)
    }

    override fun onSensorChanged(p0: SensorEvent?) {
        Timber.d("mylog ${p0?.values?.get(0)}/${p0?.values?.get(1)}/${p0?.values?.get(2)}")
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }

    private fun registerSensors() {
        if (sensorManager == null)
            sensorManager =
                (requireContext().getSystemService(Context.SENSOR_SERVICE) as SensorManager?)!!

        if (sensor == null)
            sensor = sensorManager?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        sensorManager?.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
    }

    private fun unregisterSensor() {
        sensorManager?.unregisterListener(this, sensor)
    }


}