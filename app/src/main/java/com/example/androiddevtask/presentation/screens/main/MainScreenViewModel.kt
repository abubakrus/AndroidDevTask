package com.example.androiddevtask.presentation.screens.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androiddevtask.domain.usecase.IdealCardUseCase
import com.example.androiddevtask.presentation.mappers.toPresentation
import com.example.androiddevtask.presentation.models.Card
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class MainScreenViewModel(
    private val idealCardUseCase: IdealCardUseCase
) : ViewModel() {

    private val _uiStateFlow = MutableStateFlow<MainScreenUiState>(MainScreenUiState.Initial)
    val uiState: StateFlow<MainScreenUiState> = _uiStateFlow.asStateFlow()

    private val handler = CoroutineExceptionHandler { _, throwable ->
        _uiStateFlow.tryEmit(MainScreenUiState.Error(throwable.localizedMessage ?: ""))
    }

    init {
        try {
            viewModelScope.launch {
                _uiStateFlow.tryEmit(MainScreenUiState.Loading)
                val contentState = MainScreenUiState.Loaded(
                    card = fetchLimitData()
                )
                _uiStateFlow.tryEmit(contentState)
            }
        } catch (e: Exception) {
            Log.e("MainScreenViewModel", "Error in viewModelScope.launch", e)
            _uiStateFlow.tryEmit(MainScreenUiState.Error(e.localizedMessage ?: ""))
        }
    }

    private suspend fun fetchLimitData(): List<Card> {
        val cardLimit = idealCardUseCase.invoke()
        return cardLimit.map { it.toPresentation() } ?: emptyList()

    }
}