package com.example.androiddevtask.di

import com.example.androiddevtask.data.repositories.IdealCardRepositoriesImpl
import com.example.androiddevtask.domain.repositories.IdealCardRepositories
import com.example.androiddevtask.domain.usecase.IdealCardUseCase
import com.example.androiddevtask.domain.usecase.IdealCardUseCaseImpl
import com.example.androiddevtask.presentation.app.MainActivityViewModel
import com.example.androiddevtask.presentation.manager.NavigatorManager
import com.example.androiddevtask.presentation.manager.NavigatorManagerImpl
import com.example.androiddevtask.presentation.screens.main.MainScreenViewModel
import com.example.androiddevtask.presentation.screens.splash.SplashScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        SplashScreenViewModel(get())
    }


    viewModel {
        MainActivityViewModel(get())
    }

    viewModel {
        MainScreenViewModel(get())
    }


    factory<NavigatorManager> {
        NavigatorManagerImpl()
    }

    single<IdealCardRepositories> {
        IdealCardRepositoriesImpl(get())
    }

    single<IdealCardUseCase> {
        IdealCardUseCaseImpl(get())
    }
}