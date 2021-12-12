package com.example.data.repositories

import com.example.domain.entities.Conto
import com.example.domain.entities.Login
import com.example.domain.entities.Movimento
import com.example.domain.entities.Utente
import it.aleallegretti.domain.repositories.EstrattoContoRepository

class EstrattoContoRepositoryImpl (
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
    ) : EstrattoContoRepository {

    override suspend fun getConto(login: Login): Result<Conto> {
        return remoteDataSource.getConto(login)
    }

    override suspend fun getMovimenti(iban: String): List<Movimento> {
        return localDataSource.movimenti(iban)
    }

    override suspend fun getInfoUtente(conto: Conto): Result<Utente> {
        return localDataSource.infoUtente(conto)
    }
}