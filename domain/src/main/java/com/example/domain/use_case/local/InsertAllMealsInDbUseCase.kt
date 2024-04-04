package com.example.domain.use_case.local

import com.example.domain.entities.Meals
import com.example.domain.repositories.local.MealsRepositoryDb
import javax.inject.Inject

class InsertAllMealsInDbUseCase @Inject constructor(private val mealsRepositoryDb: MealsRepositoryDb) {

    suspend operator fun invoke(mealsList: List<Meals>) =
        mealsRepositoryDb.insertAllMeals(mealsList)
}