package com.example.androiddevtask.data.cloud.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CardCloud(
    @SerializedName("company")
    val companyData: CompanyXData,
    @SerializedName("customerMarkParameters")
    val customerMarkParametersData: CustomerMarkParametersData,
    @SerializedName("mobileAppDashboard")
    val mobileAppDashboardData: MobileAppDashboardData
) : Parcelable