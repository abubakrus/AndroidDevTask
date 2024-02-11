package com.example.androiddevtask.data.cloud.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CustomerMarkParametersData(
    @SerializedName("loyaltyLevel")
    val loyaltyLevelData: LoyaltyLevelData,
    @SerializedName("mark")
    val mark: Int
):Parcelable