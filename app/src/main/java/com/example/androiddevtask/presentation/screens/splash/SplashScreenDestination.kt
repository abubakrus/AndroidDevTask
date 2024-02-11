package com.example.androiddevtask.presentation.screens.splash

import com.example.androiddevtask.presentation.navigation.destination.Destination

object SplashScreenDestination : Destination {
    override fun route(): String = "splash_screen_route"

    override fun routeWithArgs(): String = route()
}