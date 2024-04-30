package com.baitent.fatcs.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.baitent.fatcs.ui.data.UserDataUiEvents
import com.baitent.fatcs.ui.data.UserInputScreenState


class UserInputViewModel : ViewModel() {

    var uiState = mutableStateOf(UserInputScreenState.UserInputScreenState())

    fun onEvent(event: UserDataUiEvents){
        when (event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value= uiState.value.copy(
                    nameEntered = event.name
                )
            }
            is UserDataUiEvents.AnimalSelected -> {
                uiState.value= uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }


}

