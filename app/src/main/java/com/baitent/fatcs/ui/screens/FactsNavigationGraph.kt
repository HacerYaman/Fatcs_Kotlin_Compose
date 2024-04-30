package com.baitent.fatcs.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FactsNavigationGraph(){
    val navController= rememberNavController()  // remember the last state of navigation host
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {    //entry point

        composable(Routes.USER_INPUT_SCREEN) {   //launching rout
            UserInputScreen(navController)
        }

        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen()
        }
    }
}