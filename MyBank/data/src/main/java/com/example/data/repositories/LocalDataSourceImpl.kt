package com.example.data.repositories

import com.example.data.db.MovimentiDatabase
import com.example.data.mappers.EntitiesMapper
import com.example.domain.entities.Conto
import com.example.domain.entities.Movimento
import com.example.domain.entities.Utente
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext


class LocalDataSourceImpl (
    private val dispatcher: CoroutineDispatcher,
    private val mapper: EntitiesMapper
): LocalDataSource {
    /*
    * Le due fun a seguire dovrebbe dare un risultato in seguito ad un login corretto
    * cioè in presenza di un Conto loggato
    * */
    override suspend fun movimenti(iban: String): List<Movimento> {
        // backend che tramite un metodo restituisce i movimenti
        // anche qui servirebbe i dovuto controlli in caso non ci sia risposta dal server...
        return MovimentiDatabase.toMovimentiList()
    }

    override suspend fun infoUtente(conto: Conto): Result<Utente> = withContext(dispatcher) {
        try {
            val response = conto.utente
            if(response.CF.isNotEmpty()) {
                return@withContext Result.success(response)
            } else {
                return@withContext Result.failure(Exception("Utente non disponibile"))
            }
        } catch (e: Exception) {
            return@withContext Result.failure(Exception("Errore di connessione"))
        }
    }
}

