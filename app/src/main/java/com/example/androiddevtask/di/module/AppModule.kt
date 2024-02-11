package com.example.androiddevtask.di.module

import android.util.Log
import com.example.androiddevtask.presentation.app.MainActivityViewModel
import com.example.androiddevtask.presentation.manager.NavigatorManager
import com.example.androiddevtask.presentation.manager.NavigatorManagerImpl
import com.example.androiddevtask.presentation.screens.splash.SplashScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {

        Log.d("Koin", "Before creating SplashScreenViewModel")
        val viewModel = SplashScreenViewModel(get())
        Log.d("Koin", "After creating SplashScreenViewModel")
        viewModel
        }


    viewModel { MainActivityViewModel(get()) }


    single<NavigatorManager> { NavigatorManagerImpl() }


}