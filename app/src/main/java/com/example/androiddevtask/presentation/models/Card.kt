package com.example.androiddevtask.presentation.models

import com.example.androiddevtask.presentation.models.common.CompanyX
import com.example.androiddevtask.presentation.models.common.LoyaltyLevel
import com.example.androiddevtask.presentation.models.common.MobileAppDashboard


data class Card(
    val company: CompanyX,
    val customerMarkParameters: LoyaltyLevel,
    val mobileAppDashboardData: MobileAppDashboard
)