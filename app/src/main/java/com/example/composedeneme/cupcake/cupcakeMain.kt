package com.example.composedeneme.cupcake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composedeneme.ui.theme.ComposedenemeTheme


/**
 * Activity for cupcake order flow.
 */
class MainActivity9 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedenemeTheme() {
                CupcakeApp()
            }
        }
    }
}