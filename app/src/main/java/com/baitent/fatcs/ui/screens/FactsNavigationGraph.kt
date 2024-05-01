package com.baitent.fatcs.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.baitent.fatcs.ui.models.UserInputViewModel

@Composable
fun FactsNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()) {
    val navController = rememberNavController()  // remember the last state of navigation host
    NavHost(
        navController = navController,
        startDestination = Routes.USER_INPUT_SCREEN
    ) {    //entry point

        composable(Routes.USER_INPUT_SCREEN) {   //launching rout
            UserInputScreen(userInputViewModel, showWelcomeScreem={
                navController.navigate(Routes.WELCOME_SCREEN+"/${it.first}/${it.second}")
            })
        }

        composable(
            "${Routes.WELCOME_SCREEN}/{${Routes.USER_NAME}}/{${Routes.SELECTED_ANIMAL}}",
            arguments = listOf(
                navArgument(name = Routes.USER_NAME) { type = NavType.StringType },
                navArgument(name = Routes.SELECTED_ANIMAL) { type = NavType.StringType })
        )

        {
            val userName= it.arguments?.getString(Routes.USER_NAME)
            val seledtedAnimal= it.arguments?.getString(Routes.SELECTED_ANIMAL)
            WelcomeScreen(userName,seledtedAnimal)
        }
    }
}