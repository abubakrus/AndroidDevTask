package com.example.androiddevtask.domain.usecase

import com.example.androiddevtask.domain.models.CardDomain
import com.example.androiddevtask.domain.repositories.IdealCardRepositories

class IdealCardUseCaseImpl(
    private val repository: IdealCardRepositories
) : IdealCardUseCase {
    override suspend fun invoke(): List<CardDomain> {
        return repository.invoke()
    }
}

