package com.example.androiddevtask.presentation.screens.splash

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androiddevtask.presentation.manager.NavigatorManager
import com.example.androiddevtask.presentation.screens.main.MainScreenDestination
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


private const val SPLASH_DELAY_TIME = 3_000L

class SplashScreenViewModel(
    private val navigatorManager: NavigatorManager
) : ViewModel() {
    init {
        try {
            viewModelScope.launch {
                delay(SPLASH_DELAY_TIME)
                navigatorManager.navigateTo(MainScreenDestination.route(), true)
            }
            // Ваш код инициализации
            Log.d("ViewModel", "SplashScreenViewModel created")
        } catch (e: Exception) {
            Log.e("ViewModel", "Error creating SplashScreenViewModel", e)
        }

    }
}