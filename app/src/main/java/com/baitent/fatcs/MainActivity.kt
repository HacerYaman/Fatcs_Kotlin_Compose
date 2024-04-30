package com.baitent.fatcs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.baitent.fatcs.ui.screens.FactsNavigationGraph
import com.baitent.fatcs.ui.screens.Routes
import com.baitent.fatcs.ui.screens.UserInputScreen
import com.baitent.fatcs.ui.screens.WelcomeScreen
import com.baitent.fatcs.ui.theme.FatcsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FatcsTheme {
                FatcsApp()  //main composalbe

            }
        }
    }

    @Composable
    fun FatcsApp() {     //MAIN COMPOSABLE FOR APP. ENTRY POINT
        FactsNavigationGraph()  //navigation graph

    }
}




