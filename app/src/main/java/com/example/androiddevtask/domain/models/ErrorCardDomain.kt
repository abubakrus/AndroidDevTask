package com.example.androiddevtask.domain.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ErrorCardDomain(
    @SerializedName("message")
    val message: String,
    @SerializedName("type")
    val type: String
) : Parcelable