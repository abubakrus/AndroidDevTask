package com.example.androiddevtask.domain.common


data class LoyaltyLevelDomain(
    val cashToMark: Int,
    val markToCash: Int,
    val name: String,
    val number: Int,
    val requiredSum: Int
)