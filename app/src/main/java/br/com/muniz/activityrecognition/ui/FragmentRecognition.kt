package br.com.muniz.activityrecognition.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.muniz.activityrecognition.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentRecognition : Fragment() {

    val recognitionViewModel : FragmentRecognitionViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_recognition, container, false)
    }
}