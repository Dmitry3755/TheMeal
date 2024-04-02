package com.example.data.api

import com.example.data.entities.MealsListResponse
import retrofit2.Response
import retrofit2.http.GET

interface MealsApi {

    @GET("search.php?s")
    suspend fun getAllMeals(): Response<MealsListResponse>

}