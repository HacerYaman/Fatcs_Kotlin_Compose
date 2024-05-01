package com.baitent.fatcs.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baitent.fatcs.R
import com.baitent.fatcs.ui.AnimalCard
import com.baitent.fatcs.ui.AppConstants
import com.baitent.fatcs.ui.TextComponent
import com.baitent.fatcs.ui.TextFieldComponent
import com.baitent.fatcs.ui.TopBar
import com.baitent.fatcs.ui.models.UserInputViewModel
import com.baitent.fatcs.ui.data.UserDataUiEvents

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {

            TopBar(AppConstants().appBarText)
            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = AppConstants().learnText, textSize = 24.sp)
            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = AppConstants().detail, textSize = 18.sp)

            Spacer(modifier = Modifier.size(60.dp))
            TextComponent(textValue = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.size(5.dp))
            TextFieldComponent(onTextChanged = {
                userInputViewModel.onEvent(UserDataUiEvents.UserNameEntered(it))
            })
            Spacer(modifier = Modifier.size(10.dp))
            TextComponent(textValue = "What do you like?", textSize = 18.sp)


            Row(modifier = Modifier.fillMaxWidth()) {
                AnimalCard(image = R.drawable.cat, selectAnimal = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )
                }, isSelected = userInputViewModel.uiState.value
                    .animalSelected=="Cat")
                AnimalCard(image = R.drawable.dog, selectAnimal = {
                    userInputViewModel.onEvent(
                        UserDataUiEvents.AnimalSelected(it)
                    )
                }, isSelected = userInputViewModel.uiState.value
                    .animalSelected=="Dog")
            }

        }

    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}