package com.example.androiddevtask.presentation.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.androiddevtask.presentation.navigation.nav_graph.AppNavGraph
import com.example.androiddevtask.presentation.screens.main.MainScreenViewModel
import com.example.androiddevtask.presentation.screens.splash.SplashScreenViewModel
import com.example.androiddevtask.presentation.theme.LightGrey
import kotlinx.coroutines.flow.Flow


@Composable
fun AndroidDevTaskComposeApp(
    destinationFlow: Flow<Pair<String, Boolean>>,
    modifier: Modifier = Modifier,
    mainScreenViewModel: MainScreenViewModel,
    splashScreenViewModel: SplashScreenViewModel
) {

    val navHostController = rememberNavController()

    val (destination, isClearBackStack) = destinationFlow.collectAsState(initial = "" to false).value

    if (destination.isNotEmpty()) {
        navHostController.navigate(destination) {
            if (isClearBackStack) popUpTo(0)
        }
    }
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(color = LightGrey)
    ) { paddings ->
        AppNavGraph(
            navHostController = navHostController,
            modifier = modifier.padding(paddings),
            mainScreenViewModel = mainScreenViewModel,
            splashScreenViewModel = splashScreenViewModel
        )
    }
}