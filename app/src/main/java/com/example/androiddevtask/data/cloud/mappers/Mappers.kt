package com.example.androiddevtask.data.cloud.mappers

import com.example.androiddevtask.data.cloud.common.CardCloud
import com.example.androiddevtask.data.cloud.common.CompanyXData
import com.example.androiddevtask.data.cloud.common.CustomerMarkParametersData
import com.example.androiddevtask.data.cloud.common.LoyaltyLevelData
import com.example.androiddevtask.data.cloud.common.MobileAppDashboardData
import com.example.androiddevtask.domain.common.CompanyXDomain
import com.example.androiddevtask.domain.common.CustomerMarkParametersDomain
import com.example.androiddevtask.domain.common.LoyaltyLevelDomain
import com.example.androiddevtask.domain.common.MobileAppDashboardDomain
import com.example.androiddevtask.domain.models.CardDomain


fun MobileAppDashboardData.toDomain(): MobileAppDashboardDomain = this.run {
    MobileAppDashboardDomain(
        accentColor = accentColor,
        backgroundColor = backgroundColor,
        cardBackgroundColor = cardBackgroundColor,
        companyName = companyName,
        highlightTextColor = highlightTextColor,
        logo = logo,
        mainColor = mainColor,
        textColor = textColor
    )
}

fun LoyaltyLevelData.toDomain(): LoyaltyLevelDomain = this.run {
    LoyaltyLevelDomain(
        cashToMark = cashToMark,
        markToCash = markToCash,
        name = name,
        number = number,
        requiredSum = requiredSum
    )
}

fun CustomerMarkParametersData.toDomain(): CustomerMarkParametersDomain = this.run {
    CustomerMarkParametersDomain(
        loyaltyLevelDomain = loyaltyLevelData.toDomain(),
        mark = mark
    )
}

fun CompanyXData.toDomain(): CompanyXDomain = this.run { CompanyXDomain(companyId = companyId) }

fun CardCloud.toDomain(): CardDomain = this.run {
    CardDomain(
        companyDomain = companyData.toDomain(),
        customerMarkParametersDomain = customerMarkParametersData.loyaltyLevelData.toDomain(),
        mobileAppDashboardDomain = mobileAppDashboardData.toDomain()
    )
}