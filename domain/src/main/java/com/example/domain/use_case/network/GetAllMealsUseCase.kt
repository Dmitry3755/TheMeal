package com.example.domain.use_case.network

import com.example.domain.repositories.network.MealRepositoryNet
import javax.inject.Inject

class GetAllMealsUseCase @Inject constructor(private val mealRepository: MealRepositoryNet) {

    suspend operator fun invoke() = mealRepository.getAllMeals()

}