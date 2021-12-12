package com.example.data.api

import com.example.data.api.BankApi
import com.example.domain.entities.Conto
import com.example.domain.entities.Login
import com.example.domain.entities.Utente

/* ricevuto il login corretto allora risponderebbe */
class BankApiResponse(): BankApi {
    override suspend fun getConto(login: Login): Conto {
        return Conto(
            Utente("alealleg", "Alessandro", "Allegretti", "01/01/1990", "Bari", "XXXXXXXXXX"),
            "IT000000000000000",
            1000.50
        )
    }



}