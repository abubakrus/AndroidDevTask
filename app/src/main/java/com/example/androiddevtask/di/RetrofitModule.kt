package com.example.androiddevtask.di

import com.example.androiddevtask.data.cloud.service.IdealCardService
import com.example.androiddevtask.data.repositories.IdealCardRepositoriesImpl
import com.example.androiddevtask.domain.repositories.IdealCardRepositories
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


const val BASE_URL = "http://devapp.bonusmoney.pro/mobileapp/"

val retrofitModule = module {
    single {
        val httpInterceptor = HttpLoggingInterceptor()
        httpInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        Retrofit.Builder()
            .client(OkHttpClient.Builder().addInterceptor(httpInterceptor).build())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(IdealCardService::class.java)
    }
    single<IdealCardRepositories> {
        IdealCardRepositoriesImpl(get())
    }
}
