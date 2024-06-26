package com.baitent.fatcs.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(userName: String?, seledtedAnimal: String?) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = Routes.WELCOME_SCREEN, modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
        )

    }
}


@Preview
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("userName", "seledtedAnimal")
}