package it.aleallegretti.domain.repositories

import com.example.domain.entities.Conto
import com.example.domain.entities.Login
import com.example.domain.entities.Movimento
import com.example.domain.entities.Utente


interface EstrattoContoRepository {

    /* ad ogni login è associato ad un IBAN che restituisce un Conto */
    suspend fun getConto(login: Login): Result<Conto>
            
    suspend fun getMovimenti(iban: String): List<Movimento> // FLOW ?

    suspend fun getInfoUtente(conto: Conto): Result<Utente>
}