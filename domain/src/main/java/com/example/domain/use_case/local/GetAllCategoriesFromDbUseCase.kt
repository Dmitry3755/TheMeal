package com.example.domain.use_case.local

import com.example.domain.repositories.local.CategoriesRepositoryDb
import com.example.domain.repositories.network.CategoryRepositoryNet
import javax.inject.Inject

class GetAllCategoriesFromDbUseCase @Inject constructor(private val categoriesRepositoryDb: CategoriesRepositoryDb) {

    suspend operator fun invoke() = categoriesRepositoryDb.getAllCategories()

}