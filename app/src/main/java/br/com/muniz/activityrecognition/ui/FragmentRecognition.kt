package br.com.muniz.activityrecognition.ui

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import br.com.muniz.activityrecognition.R
import br.com.muniz.activityrecognition.Util
import br.com.muniz.activityrecognition.data.WekaDataIntensityLying
import br.com.muniz.activityrecognition.data.WekaDataIntensitySit
import br.com.muniz.activityrecognition.data.WekaDataIntensityWalk
import br.com.muniz.activityrecognition.databinding.FragmentRecognitionBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class FragmentRecognition : Fragment(), SensorEventListener {

    private var sensor: Sensor? = null
    private var sensorManager: SensorManager? = null
    private lateinit var binding: FragmentRecognitionBinding

    private val recognitionViewModel: FragmentRecognitionViewModel by viewModels()

    override fun onStart() {
        super.onStart()
        registerSensors()
    }

    override fun onStop() {
        super.onStop()
        unregisterSensor()
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recognition, container, false)

        recognitionViewModel.finalMovement.observe(viewLifecycleOwner, {
            it?.let {
                var color: Int
                var image: Int
                var finalActivity = ""
                when (it.movement) {
                    in Util.WALK_RANGE -> {
                        image = R.drawable.ic_walk
                        finalActivity = getString(R.string.walk)
                    }
                    in Util.SIT_RANGE -> {
                        image = R.drawable.ic_sit
                        finalActivity = getString(R.string.sit)
                    }
                    in Util.LYING_RANGE -> {
                        image = R.drawable.ic_lyingdown
                        finalActivity = getString(R.string.lying)
                    }
                    else -> {
                        image = R.drawable.ic_walk
                        finalActivity = ""
                    }
                }

                finalActivity += " "

                when (it.intensity) {
                    0 -> {
                        color = R.color.soft
                        finalActivity += getString(R.string.soft)
                    }
                    1 -> {
                        color = R.color.medium
                        finalActivity += getString(R.string.moderate)
                    }
                    2 -> {
                        color = R.color.high
                        finalActivity += getString(R.string.high)
                    }
                    else -> {
                        color = R.color.soft
                        finalActivity = ""
                    }
                }

                val drawable = ContextCompat.getDrawable(
                    requireContext(),
                    image
                )
                drawable?.setTint(ContextCompat.getColor(requireContext(), color))
                binding.tvActivity.text = finalActivity
                binding.tvActivity.setTextColor(ContextCompat.getColor(requireContext(), color))
                binding.imgFinalActivity.setImageDrawable(drawable)
                binding.imgFinalActivity.visibility = View.VISIBLE
            }
        })
        return binding.root
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