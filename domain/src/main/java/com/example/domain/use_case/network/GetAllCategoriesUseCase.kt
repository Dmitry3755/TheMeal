package com.example.domain.use_case.network

import com.example.domain.repositories.network.CategoryRepositoryNet
import javax.inject.Inject

class GetAllCategoriesUseCase @Inject constructor(private val categoryRepositoryNet: CategoryRepositoryNet) {

    suspend operator fun invoke() = categoryRepositoryNet.getAllCategories()

}