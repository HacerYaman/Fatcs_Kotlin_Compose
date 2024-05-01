package com.baitent.fatcs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.baitent.fatcs.ui.screens.FactsNavigationGraph
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




