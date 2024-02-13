package com.example.androiddevtask.data.cloud.service

import com.example.androiddevtask.data.cloud.models.AllCardResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST


interface IdealCardService {
    @POST("getAllCompanies")
    suspend fun getData(
        @Header("TOKEN") token: String = "123",
        @Body bodyData: BodyData
    ): Response<AllCardResponse>
}

