package com.example.androiddevtask.presentation.navigation.destination

interface Destination {
    fun route(): String

    fun routeWithArgs(): String
}