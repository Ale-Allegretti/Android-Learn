package com.example.data.mappers

import com.example.data.entities.SchermataConto
import com.example.domain.entities.Conto
import com.example.domain.entities.Movimento

class EntitiesMapper {
    fun toSchermata(conto: Conto, movimenti: List<Movimento>): SchermataConto {
        return SchermataConto(
            totale = conto.totale,
            iban = conto.iban,
            movimenti = movimenti
        )
    }
}