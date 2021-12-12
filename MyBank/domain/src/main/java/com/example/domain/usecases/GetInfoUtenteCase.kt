package it.aleallegretti.domain.usecases

import com.example.domain.entities.Conto
import it.aleallegretti.domain.repositories.EstrattoContoRepository

class GetInfoUtenteCase (private val estrattoContoRepository: EstrattoContoRepository) {
    suspend operator fun invoke(conto: Conto) = estrattoContoRepository.getInfoUtente(conto)
}