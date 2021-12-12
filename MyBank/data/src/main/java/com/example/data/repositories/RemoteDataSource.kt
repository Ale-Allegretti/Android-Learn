package com.example.data.repositories

import com.example.domain.entities.Conto
import com.example.domain.entities.Login

interface RemoteDataSource {
    suspend fun getConto(login: Login): Result<Conto>
}