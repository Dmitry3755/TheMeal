package com.example.domain.repositories.local

import com.example.domain.entities.Categories
import com.example.domain.entities.Meals

interface MealsRepositoryDb {

    suspend fun getAllMeals(): List<Meals>

    suspend fun insertAllMeals(mealsList: List<Meals>)

}