package com.example.data.entities

import com.example.domain.entities.Movimento

data class SchermataConto(
    val totale: Double,
    val iban: String,
    val movimenti: List<Movimento>
)
