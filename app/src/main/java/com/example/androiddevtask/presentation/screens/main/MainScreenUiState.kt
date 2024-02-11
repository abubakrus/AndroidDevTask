package com.example.androiddevtask.presentation.screens.main

sealed class MainScreenUiState {

    data object Initial : MainScreenUiState()

    data object Loading : MainScreenUiState()

    data object Loaded : MainScreenUiState()

    data class Error(val errorMessage: String) : MainScreenUiState()
}