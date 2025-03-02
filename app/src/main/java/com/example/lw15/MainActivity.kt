package com.example.lw15

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.app.screens.*

class MainActivity : ComponentActivity() {

    enum class Screen {
        AUTH, REGISTER, PROFILE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var current by remember { mutableStateOf(Screen.AUTH) }

            when (current) {
                Screen.AUTH -> AuthScreen(
                    onNavigateToRegister = { current = Screen.REGISTER },
                    onNavigateToProfile = { current = Screen.PROFILE }
                )

                Screen.REGISTER -> RegisterScreen(
                    onNavigateToAuth = { current = Screen.AUTH }
                )

                Screen.PROFILE -> ProfileScreen(
                    onNavigateBack = { current = Screen.AUTH }
                )
            }
        }
    }
}
