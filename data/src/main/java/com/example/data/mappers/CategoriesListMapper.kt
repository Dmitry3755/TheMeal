package com.example.data.mappers

import com.example.data.entities.CategoriesListResponse
import com.example.data.entities.MealsListResponse
import com.example.domain.entities.CategoriesList
import com.example.domain.entities.Meals
import com.example.domain.entities.MealsList

fun CategoriesListResponse.toCategoriesList(): CategoriesList {
    return CategoriesList(
        categories = this.categories.map { it.toCategories() }
    )
}