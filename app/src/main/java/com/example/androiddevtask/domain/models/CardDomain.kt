package com.example.androiddevtask.domain.models

import com.example.androiddevtask.domain.common.CompanyXDomain
import com.example.androiddevtask.domain.common.CustomerMarkParametersDomain
import com.example.androiddevtask.domain.common.MobileAppDashboardDomain


data class CardDomain(
    val company: CompanyXDomain,
    val customerMarkParametersData: CustomerMarkParametersDomain,
    val mobileAppDashboardData: MobileAppDashboardDomain
)