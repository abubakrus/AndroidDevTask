package com.example.androiddevtask.presentation.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.androiddevtask.R
import com.example.androiddevtask.presentation.componets.TabBar
import com.example.androiddevtask.presentation.screens.model.CardModel


@Composable
fun MainScreen(
    uiState: MainScreenUiState,
    onClickToDetail: () -> Unit,
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
                modifier = modifier.padding(innerPaddings),
                onClickToDetail = onClickToDetail
            )

            is MainScreenUiState.Error -> Unit
        }
    }

}

@Composable
fun MainScreenLoadedContent(
    uiState: MainScreenUiState.Loaded,
    onClickToDetail: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = uiState.card) { card ->
            CardModel(
                companyName = card.mobileAppDashboardData.companyName,
                logo = card.mobileAppDashboardData.logo,
                highlightTextColor = card.mobileAppDashboardData.highlightTextColor,
                mainColor = card.mobileAppDashboardData.mainColor,
                textColor = card.mobileAppDashboardData.textColor,
                accentColor = card.mobileAppDashboardData.accentColor,
                cardBackgroundColor = card.mobileAppDashboardData.cardBackgroundColor,
                backgroundColor = card.mobileAppDashboardData.backgroundColor,
                name = card.customerMarkParameters.name,
                requiredSum = card.customerMarkParameters.requiredSum,
                markToCash = card.customerMarkParameters.cashToMark,
                companyId = card.company.companyId,
                onClickToDetail = { onClickToDetail }
            )
        }
    }
}