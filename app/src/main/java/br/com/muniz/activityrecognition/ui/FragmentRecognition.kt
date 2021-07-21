package br.com.muniz.activityrecognition.ui

import android.annotation.SuppressLint
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
import android.widget.TextView
import androidx.fragment.app.viewModels
import br.com.muniz.activityrecognition.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class FragmentRecognition : Fragment(), SensorEventListener {

    private var sensor: Sensor? = null
    private var sensorManager: SensorManager? = null

    private val recognitionViewModel: FragmentRecognitionViewModel by viewModels()

    override fun onStart() {
        super.onStart()
        registerSensors()
    }

    override fun onStop() {
        super.onStop()
        unregisterSensor()
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recognitionViewModel.finalMovement.observe(viewLifecycleOwner, {
            it?.let {
               val a = requireView().findViewById(R.id.tv_activity) as TextView
                a.text = "${it.movement} / ${it.intensity}"
            }
        })
        return inflater.inflate(R.layout.fragment_recognition, container, false)
    }

    override fun onSensorChanged(p0: SensorEvent?) {
        recognitionViewModel.getActivity(p0)
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