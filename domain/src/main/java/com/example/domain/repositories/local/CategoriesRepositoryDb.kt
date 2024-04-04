package com.example.domain.repositories.local

import com.example.domain.entities.Categories

interface CategoriesRepositoryDb {

    suspend fun getAllCategories(): List<Categories>

    suspend fun insertAllCategories(categoriesList: List<Categories>)

}