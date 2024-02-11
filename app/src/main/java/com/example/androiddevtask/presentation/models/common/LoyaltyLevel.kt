package com.example.androiddevtask.presentation.models.common


data class LoyaltyLevel(
    val cashToMark: Int,
    val markToCash: Int,
    val name: String,
    val number: Int,
    val requiredSum: Int
)