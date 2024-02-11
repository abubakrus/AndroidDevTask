package com.example.androiddevtask.presentation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.androiddevtask.presentation.screens.main.MainScreen
import com.example.androiddevtask.presentation.screens.main.MainScreenDestination
import com.example.androiddevtask.presentation.screens.main.MainScreenViewModel
import com.example.androiddevtask.presentation.screens.splash.SplashScreenDestination
import com.example.androiddevtask.presentation.screens.splash.SplashScreenViewModel


const val APP_NAV_GRAPH_ROUTE = "app_nav_graph_route"


@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {

    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = SplashScreenDestination.route()
    ) {
        composable(SplashScreenDestination.route()) {
            val viewModel: SplashScreenViewModel = viewModel()
            viewModel
        }
        composable(MainScreenDestination.route()) {
            val viewModel: MainScreenViewModel = viewModel()
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            MainScreen(
                uiState = uiState
            )
        }
    }
}