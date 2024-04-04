package com.example.domain.repositories.network

import com.example.domain.entities.Categories
import com.example.domain.entities.CategoriesList
import com.example.domain.entities.MealsList
import com.example.domain.utils.Result

interface CategoryRepositoryNet {

    suspend fun getAllCategories(): Result<CategoriesList>

}