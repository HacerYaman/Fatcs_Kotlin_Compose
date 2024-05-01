package com.baitent.fatcs.ui.models

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.baitent.fatcs.ui.data.UserDataUiEvents
import com.baitent.fatcs.ui.data.UserInputScreenState


class UserInputViewModel : ViewModel() {

    companion object{
        const val TAG = "UserInputViewModel"
    }

    var uiState = mutableStateOf(UserInputScreenState.UserInputScreenState())

    fun onEvent(event: UserDataUiEvents){
        when (event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value= uiState.value.copy(
                    nameEntered = event.name
                )
                Log.d(TAG, "UserDataUiEvents.UserNameEntered ->>")
                Log.d(TAG, "${uiState.value}")
            }
            is UserDataUiEvents.AnimalSelected -> {
                uiState.value= uiState.value.copy(
                    animalSelected = event.animalValue
                )
                Log.d(TAG, "UserDataUiEvents.AnimalSelected ->>")
                Log.d(TAG, "${uiState.value}")
            }
        }
    }

    fun isValidState(): Boolean {
        if(!uiState.value.animalSelected.isNullOrEmpty()&& !uiState.value.nameEntered.isNullOrEmpty()){
            return true
        }
        return false
    }

}

