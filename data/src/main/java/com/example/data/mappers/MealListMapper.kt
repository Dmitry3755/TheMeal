package com.example.data.mappers

import com.example.data.entities.MealsListResponse
import com.example.domain.entities.Meals
import com.example.domain.entities.MealsList

fun MealsListResponse.toMealsList(): MealsList {
    return MealsList(
        meals = this.meals.map { it.toMeals() }
    )
}