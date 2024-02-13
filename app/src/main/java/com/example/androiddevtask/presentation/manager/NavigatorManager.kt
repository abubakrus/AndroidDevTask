package com.example.androiddevtask.presentation.manager

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull

interface NavigatorManager {
    fun destinationFlow(): Flow<Pair<String, Boolean>>

    fun navigateTo(destination: String, isClearBackStack: Boolean = false)
}


class NavigatorManagerImpl : NavigatorManager {

    private val destinationFlow = MutableStateFlow(String() to false)
    override fun destinationFlow(): Flow<Pair<String, Boolean>> {
        return destinationFlow.asStateFlow().filterNotNull()
    }

    override fun navigateTo(destination: String, isClearBackStack: Boolean) {
        destinationFlow.tryEmit(Pair(destination, isClearBackStack))
    }
}