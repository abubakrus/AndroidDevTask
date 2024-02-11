package com.example.androiddevtask.data.cloud.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MobileAppDashboardData(
    @SerializedName("accentColor")
    val accentColor: String,
    @SerializedName("backgroundColor")
    val backgroundColor: String,
    @SerializedName("cardBackgroundColor")
    val cardBackgroundColor: String,
    @SerializedName("companyName")
    val companyName: String,
    @SerializedName("highlightTextColor")
    val highlightTextColor: String,
    @SerializedName("logo")
    val logo: String,
    @SerializedName("mainColor")
    val mainColor: String,
    @SerializedName("textColor")
    val textColor: String
) : Parcelable