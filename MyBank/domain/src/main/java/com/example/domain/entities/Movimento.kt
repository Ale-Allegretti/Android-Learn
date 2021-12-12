package com.example.domain.entities


data class Movimento (
    val descrizione: String,
    val data: String,
    val importo: Double,
    val tipo: Boolean
    /* tipo -> true se accredito, false se addebito */
    )