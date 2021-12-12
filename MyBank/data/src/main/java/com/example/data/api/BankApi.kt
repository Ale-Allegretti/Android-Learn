package com.example.data.api

import com.example.domain.entities.Conto
import com.example.domain.entities.Login

interface BankApi {
    suspend fun getConto(login: Login): Conto
}