package com.example.androiddevtask.presentation.mappers

import com.example.androiddevtask.domain.common.CompanyXDomain
import com.example.androiddevtask.domain.common.CustomerMarkParametersDomain
import com.example.androiddevtask.domain.common.LoyaltyLevelDomain
import com.example.androiddevtask.domain.common.MobileAppDashboardDomain
import com.example.androiddevtask.domain.models.CardDomain
import com.example.androiddevtask.presentation.models.Card
import com.example.androiddevtask.presentation.models.common.CompanyX
import com.example.androiddevtask.presentation.models.common.CustomerMarkParameters
import com.example.androiddevtask.presentation.models.common.LoyaltyLevel
import com.example.androiddevtask.presentation.models.common.MobileAppDashboard

fun MobileAppDashboardDomain.toPresentation(): MobileAppDashboard = this.run {
    MobileAppDashboard(
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

fun LoyaltyLevelDomain.toPresentation(): LoyaltyLevel = this.run {
    LoyaltyLevel(
        cashToMark = cashToMark,
        markToCash = markToCash,
        name = name,
        number = number,
        requiredSum = requiredSum
    )
}

fun CustomerMarkParametersDomain.toPresentation(): CustomerMarkParameters = this.run {
    CustomerMarkParameters(
        loyaltyLevel = loyaltyLevelDomain.toPresentation(),
        mark = mark
    )
}

fun CompanyXDomain.toPresentation(): CompanyX = this.run { CompanyX(companyId = companyId) }

fun CardDomain.toPresentation(): Card = this.run {
    Card(
        company = companyDomain.toPresentation(),
        customerMarkParameters = customerMarkParametersDomain.toPresentation(),
        mobileAppDashboardData = mobileAppDashboardDomain.toPresentation()
    )
}