package com.example.data.repositories

import com.example.data.api.BankApi
import com.example.data.mappers.EntitiesMapper
import com.example.domain.entities.Conto
import com.example.domain.entities.Login
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteDataSourceImpl(
    private val service: BankApi,
    private val mapper: EntitiesMapper
): RemoteDataSource {
    override suspend fun getConto(login: Login): Result<Conto> = withContext(Dispatchers.IO) {
        try {
            val response = service.getConto(login)
            if(response.iban.isNotEmpty()) {
                return@withContext Result.success(response)
            } else {
                return@withContext Result.failure(Exception("Credenziali errate"))
            }
        } catch (e: Exception) {
            return@withContext Result.failure(Exception("Errore di connessione"))
        }
    }
}