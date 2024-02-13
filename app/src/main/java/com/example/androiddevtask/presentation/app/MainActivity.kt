package com.example.androiddevtask.presentation.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.androiddevtask.presentation.screens.main.MainScreenViewModel
import com.example.androiddevtask.presentation.screens.splash.SplashScreenViewModel
import com.example.androiddevtask.presentation.theme.AndroidDevTaskTheme
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDevTaskTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    val mainActivityViewModel: MainActivityViewModel by viewModel()
                    val mainScreenViewModel: MainScreenViewModel by viewModel()
                    val splashScreenViewModel: SplashScreenViewModel by viewModel()

                    AndroidDevTaskComposeApp(
                        modifier = Modifier.statusBarsPadding(),
                        destinationFlow = mainActivityViewModel.destinationFlow,
                        mainScreenViewModel = mainScreenViewModel,
                        splashScreenViewModel = splashScreenViewModel
                    )
                }
            }
        }
    }
}


