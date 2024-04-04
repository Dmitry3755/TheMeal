package com.example.data.repositories.network

import android.util.Log
import com.example.data.api.MealsApi
import com.example.data.mappers.toMealsList
import com.example.domain.entities.MealsList
import com.example.domain.repositories.network.MealRepositoryNet
import com.example.domain.utils.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class MealRepositoryNetImpl @Inject constructor(private val mealsApi: MealsApi) :
    MealRepositoryNet {
    override suspend fun getAllMeals(): Result<MealsList> {
        return withContext(Dispatchers.IO) {
            try {
                val response = mealsApi.getAllMeals()
                if (response.isSuccessful) {
                    Result.Success(response.body()!!.toMealsList())
                } else {
                    Result.Error(Exception(response.message()))
                }
            } catch (exception: Exception) {
                Result.Error(exception)
            }
        }
    }
}