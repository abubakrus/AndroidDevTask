package com.example.androiddevtask.presentation.screens.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


class MainScreenViewModel (
) : ViewModel() {

    private val _uiStateFlow = MutableStateFlow<MainScreenUiState>(MainScreenUiState.Initial)
    val uiState: StateFlow<MainScreenUiState> = _uiStateFlow.asStateFlow()
}