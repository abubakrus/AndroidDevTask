package com.example.androiddevtask.domain.models

import com.example.androiddevtask.domain.common.CompanyXDomain
import com.example.androiddevtask.domain.common.LoyaltyLevelDomain
import com.example.androiddevtask.domain.common.MobileAppDashboardDomain


data class CardDomain(
    val companyDomain:CompanyXDomain,
    val customerMarkParametersDomain: LoyaltyLevelDomain,
    val mobileAppDashboardDomain: MobileAppDashboardDomain
)