package com.example.androiddevtask.presentation.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.androiddevtask.R
import com.example.androiddevtask.presentation.componets.TabBar
import com.example.androiddevtask.presentation.theme.Black
import com.example.androiddevtask.presentation.theme.LightGrey


@Composable
fun MainScreen(
    uiState: MainScreenUiState,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            TabBar(title = stringResource(id = R.string.card_management))
        }
    ) { innerPaddings ->
        when (uiState) {
            is MainScreenUiState.Initial -> Unit
            is MainScreenUiState.Loading -> Unit
            is MainScreenUiState.Loaded -> MainScreenLoadedContent(
                uiState = uiState,
                modifier = modifier.padding(innerPaddings)
            )

            is MainScreenUiState.Error -> Unit
        }
    }

}

@Composable
fun MainScreenLoadedContent(
    uiState: MainScreenUiState.Loaded,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(LightGrey),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "MainScreen", style = MaterialTheme.typography.bodyLarge, color = Black
        )
    }
}