package com.example.androiddevtask.di

import com.example.androiddevtask.presentation.manager.NavigatorManager
import com.example.androiddevtask.presentation.manager.NavigatorManagerImpl
import com.example.androiddevtask.presentation.manager.toast.ShowToastUseCase
import com.example.androiddevtask.presentation.manager.toast.ToastManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
interface ManagerModule {
    @Binds
    @Singleton
    fun bindNavigatorManager(
        implementation: NavigatorManagerImpl
    ): NavigatorManager

    @Binds
    @Singleton
    fun bindToastManager(
        implementation: ToastManager
    ): ShowToastUseCase
}