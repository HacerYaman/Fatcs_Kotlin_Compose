package com.baitent.fatcs.ui.data

sealed class UserDataUiEvents { //for update ui
    data class UserNameEntered(val name: String) : UserDataUiEvents()
    data class AnimalSelected(val animalValue: String) : UserDataUiEvents()
}