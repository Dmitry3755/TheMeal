package com.example.domain.repositories.network

import com.example.domain.entities.Meals
import com.example.domain.entities.MealsList
import com.example.domain.utils.Result

interface MealRepositoryNet {

    suspend fun getAllMeals(): Result<MealsList>

}