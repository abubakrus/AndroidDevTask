package com.example.androiddevtask.domain.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class CustomerMarkParametersDomain(
    val loyaltyLevelData: LoyaltyLevelDomain,
    val mark: Int
)