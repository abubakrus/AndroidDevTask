package com.example.androiddevtask

import android.app.Application
import com.example.androiddevtask.di.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class AndroidDevTaskApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AndroidDevTaskApp)
            modules(appModule)
        }
    }
}

