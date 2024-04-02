package com.example.data.repositories.network

import com.example.data.api.CategoriesApi
import com.example.data.mappers.toCategories
import com.example.domain.entities.Categories
import com.example.domain.repositories.network.CategoryRepositoryNet
import com.example.domain.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CategoryRepositoryNetImpl @Inject constructor(private val categoriesApi: CategoriesApi) :
    CategoryRepositoryNet {

    override suspend fun getAllCategories(): Result<Categories> {
        return withContext(Dispatchers.IO) {
            try {
                val response = categoriesApi.getAllCategories()
                if (response.isSuccessful) {
                    Result.Success(response.body()!!.toCategories())
                } else {
                    Result.Error(Exception(response.message()))
                }
            } catch (exception: Exception) {
                Result.Error(exception)
            }
        }
    }

}