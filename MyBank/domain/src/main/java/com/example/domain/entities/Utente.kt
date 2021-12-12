package com.example.domain.entities


data class Utente(
    val username: String,
    val nome: String,
    val cognome: String,
    val dataNascita: String,
    val luogoNascita: String,
    val CF: String
)
