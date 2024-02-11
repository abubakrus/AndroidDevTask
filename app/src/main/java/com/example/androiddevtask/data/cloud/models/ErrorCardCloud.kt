package com.example.androiddevtask.data.cloud.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ErrorCardCloud(
    @SerializedName("message")
    val message: String,
    @SerializedName("type")
    val type: String
) : Parcelable