package com.example.androiddevtask.domain.usecase

import com.example.androiddevtask.domain.models.CardDomain

interface IdealCardUseCase {
    suspend operator fun invoke(): List<CardDomain>

}