package com.example.androiddevtask.data.cloud.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoyaltyLevelData(
    @SerializedName("cashToMark")
    val cashToMark: Int,
    @SerializedName("markToCash")
    val markToCash: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("requiredSum")
    val requiredSum: Int
) : Parcelable