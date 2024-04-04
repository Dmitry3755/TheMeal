package com.example.data.api

import com.example.data.entities.CategoriesApiResponse
import com.example.data.entities.CategoriesListResponse
import com.example.data.entities.MealsApiResponse
import com.example.domain.entities.CategoriesList
import retrofit2.Response
import retrofit2.http.GET

interface CategoriesApi {

    @GET("categories.php")
    suspend fun getAllCategories(): Response<CategoriesListResponse>

}