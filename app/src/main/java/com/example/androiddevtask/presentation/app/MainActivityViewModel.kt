package com.example.androiddevtask.presentation.app

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.androiddevtask.presentation.manager.NavigatorManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


class MainActivityViewModel(
    private val navigatorManager: NavigatorManager
) : ViewModel() {
    init {
    Log.d("ViewModel", "MainActivityViewModel created")
}
    val destinationFlow = navigatorManager.destinationFlow()
}