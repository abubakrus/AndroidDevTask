package com.example.androiddevtask

import android.app.Application
import com.example.androiddevtask.di.BASE_URL
import com.example.androiddevtask.di.appModule
import com.example.androiddevtask.di.retrofitModule
import com.parse.Parse
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class AndroidDevTaskApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.enableLocalDatastore(this)
        Parse.initialize(
            Parse.Configuration.Builder(this).server(BASE_URL).build()
        )
        startKoin {
            androidLogger()
            androidContext(this@AndroidDevTaskApp)
            modules(appModule, retrofitModule)
        }
    }
}

