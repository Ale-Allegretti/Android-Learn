package it.aleallegretti.domain.usecases

import com.example.domain.entities.Login
import it.aleallegretti.domain.repositories.EstrattoContoRepository

class GetContoUseCase (private val estrattoContoRepository: EstrattoContoRepository) {
    suspend operator fun invoke(login: Login) = estrattoContoRepository.getConto(login)
}