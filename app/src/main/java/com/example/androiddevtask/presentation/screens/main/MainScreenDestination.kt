package com.example.androiddevtask.presentation.screens.main

import com.example.androiddevtask.presentation.navigation.destination.Destination

object MainScreenDestination : Destination {
    override fun route(): String = "main_screen_route"

    override fun routeWithArgs(): String = route()
}