package com.baitent.fatcs.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.baitent.fatcs.ui.models.UserInputViewModel

@Composable
fun FactsNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()){
    val navController= rememberNavController()  // remember the last state of navigation host
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {    //entry point

        composable(Routes.USER_INPUT_SCREEN) {   //launching rout
            UserInputScreen(userInputViewModel)
        }

        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }
    }
}