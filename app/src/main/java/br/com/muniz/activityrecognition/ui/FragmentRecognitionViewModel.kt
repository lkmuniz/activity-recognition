package br.com.muniz.activityrecognition.ui

import android.hardware.SensorEvent
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.muniz.activityrecognition.data.FinalActivity
import br.com.muniz.activityrecognition.model.VerifyMovement
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FragmentRecognitionViewModel @Inject constructor(private val verifyMovement : VerifyMovement) :
    ViewModel() {

    private var _finalMovement = MutableLiveData<FinalActivity?>()
    val finalMovement: LiveData<FinalActivity?> get() = _finalMovement

    fun getActivity(sensorEvent: SensorEvent?){
        sensorEvent?.let {
            viewModelScope.launch {
                verifyMovement.getMovement(it).collect {
                    it?.let {
                        _finalMovement.postValue(it)
                    }
                }
            }
        }
    }
}