package com.example.androiddevtask.data.cloud.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CompanyXData(
    @SerializedName("companyId")
    val companyId: String
) : Parcelable