package com.example.data.repositories

import com.example.domain.entities.Conto
import com.example.domain.entities.Movimento
import com.example.domain.entities.Utente

interface LocalDataSource {
    suspend fun movimenti(iban: String): List<Movimento>
    suspend fun infoUtente(conto: Conto): Result<Utente>
}