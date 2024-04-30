package com.baitent.fatcs.ui.screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baitent.fatcs.ui.AppConstants
import com.baitent.fatcs.ui.TextComponent
import com.baitent.fatcs.ui.TopBar
import com.baitent.fatcs.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(18.dp)) {

            TopBar(AppConstants().appBarText)
            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = AppConstants().learnText, textSize = 24.sp)
            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = AppConstants().detail, textSize = 18.sp)

            Spacer(modifier = Modifier.size(60.dp))



        }

    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}