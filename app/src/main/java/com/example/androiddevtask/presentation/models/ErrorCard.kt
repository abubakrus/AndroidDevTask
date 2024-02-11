package com.example.androiddevtask.presentation.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ErrorCard(
    @SerializedName("message")
    val message: String,
    @SerializedName("type")
    val type: String
) : Parcelable