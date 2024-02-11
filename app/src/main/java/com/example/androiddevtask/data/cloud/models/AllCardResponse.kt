package com.example.androiddevtask.data.cloud.models


import android.os.Parcelable
import com.example.androiddevtask.data.cloud.common.CardCloud
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AllCardResponse(
    @SerializedName("companies")
    val companies: List<CardCloud>,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("offset")
    val offset: Int
) : Parcelable