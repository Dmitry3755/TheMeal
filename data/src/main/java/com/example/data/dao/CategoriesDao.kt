package com.example.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.entities.CategoriesApiResponse
import com.example.data.entities.MealsApiResponse

@Dao
interface CategoriesDao {

    @Query("SELECT * FROM categories ORDER BY id ASC")
    suspend fun getAllCategories(): List<CategoriesApiResponse>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllCategories(categoriesList: List<CategoriesApiResponse>)

}