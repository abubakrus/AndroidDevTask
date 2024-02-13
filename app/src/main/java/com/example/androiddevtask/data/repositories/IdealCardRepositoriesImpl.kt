package com.example.androiddevtask.data.repositories

import com.example.androiddevtask.data.cloud.mappers.toDomain
import com.example.androiddevtask.data.cloud.service.IdealCardService
import com.example.androiddevtask.data.cloud.service.QQ
import com.example.androiddevtask.domain.models.CardDomain
import com.example.androiddevtask.domain.repositories.IdealCardRepositories

class IdealCardRepositoriesImpl(
    private val service: IdealCardService
) : IdealCardRepositories {
    override suspend fun invoke(): List<CardDomain> {
        val cardCloud = service.getData(qq = QQ()).body()
        return cardCloud?.companies?.map { it.toDomain() } ?: emptyList()
    }
}