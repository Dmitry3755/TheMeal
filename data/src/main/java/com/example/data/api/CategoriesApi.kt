package com.example.data.api

import com.example.data.entities.CategoriesApiResponse
import com.example.data.entities.MealsApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface CategoriesApi {

    @GET("categories.php")
    suspend fun getAllCategories(): Response<CategoriesApiResponse>

}