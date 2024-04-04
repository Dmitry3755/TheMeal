package com.example.domain.use_case.local

import com.example.domain.entities.Categories
import com.example.domain.repositories.local.CategoriesRepositoryDb
import javax.inject.Inject

class InsertAllCategoriesInDbUseCase @Inject constructor(private val categoriesRepositoryDb: CategoriesRepositoryDb) {

    suspend operator fun invoke(categoriesList: List<Categories>) =
        categoriesRepositoryDb.insertAllCategories(categoriesList)

}