package com.example.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.entities.MealsApiResponse

@Dao
interface MealsDao {

    @Query("SELECT * FROM meals ORDER BY id ASC")
    suspend fun getAllMeals(): List<MealsApiResponse>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllMeals(mealsList: List<MealsApiResponse>)
}