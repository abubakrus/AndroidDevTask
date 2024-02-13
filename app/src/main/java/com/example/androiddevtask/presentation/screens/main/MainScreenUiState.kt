package com.example.androiddevtask.presentation.screens.main

import com.example.androiddevtask.presentation.models.Card

sealed class MainScreenUiState {

    data object Initial : MainScreenUiState()

    data object Loading : MainScreenUiState()

    data class Loaded(val card: List<Card>) : MainScreenUiState()

    data class Error(val errorMessage: String) : MainScreenUiState()
}