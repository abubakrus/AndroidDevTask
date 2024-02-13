package com.example.androiddevtask.domain.repositories

import com.example.androiddevtask.data.cloud.models.AllCardResponse
import com.example.androiddevtask.domain.models.CardDomain

interface IdealCardRepositories {
    suspend fun invoke(): List<CardDomain>

}