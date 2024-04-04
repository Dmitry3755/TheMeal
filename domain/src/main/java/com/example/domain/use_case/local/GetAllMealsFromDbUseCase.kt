package com.example.domain.use_case.local

import com.example.domain.repositories.local.CategoriesRepositoryDb
import com.example.domain.repositories.local.MealsRepositoryDb
import com.example.domain.repositories.network.CategoryRepositoryNet
import javax.inject.Inject

class GetAllMealsFromDbUseCase @Inject constructor(private val mealsRepositoryDb: MealsRepositoryDb) {

    suspend operator fun invoke() = mealsRepositoryDb.getAllMeals()
}