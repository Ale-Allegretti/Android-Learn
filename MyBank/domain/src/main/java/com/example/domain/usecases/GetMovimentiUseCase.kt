package it.aleallegretti.domain.usecases

import it.aleallegretti.domain.repositories.EstrattoContoRepository

class GetMovimentiUseCase (private val estrattoContoRepository: EstrattoContoRepository) {
    suspend operator fun invoke(iban: String) = estrattoContoRepository.getMovimenti(iban)
}