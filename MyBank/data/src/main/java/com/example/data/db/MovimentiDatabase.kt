package com.example.data.db

import com.example.domain.entities.Movimento

class MovimentiDatabase() {
    companion object {
        @JvmStatic
        fun toMovimentiList(): List<Movimento> {
            val movimenti: List<Movimento> = listOf(
            Movimento("Supermecato", "10/09/2021", 35.55, false),
            Movimento("Prelievo", "15/09/2021", 50.00, false),
            Movimento("Bonus", "19/09/2021", 100.00, true),
            Movimento("Gita", "02/10/2021", 95.80, false),
            Movimento("Supermecato", "08/10/2021", 55.70, false),
            Movimento("Regalo", "10/10/2021", 110.50, true)
            )

            return movimenti
        }
    }
}