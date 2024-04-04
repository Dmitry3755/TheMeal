package com.example.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.dao.CategoriesDao
import com.example.data.dao.MealsDao
import com.example.data.entities.CategoriesApiResponse
import com.example.data.entities.MealsApiResponse

@Database(
    entities = [
        CategoriesApiResponse::class,
        MealsApiResponse::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun categoriesDao(): CategoriesDao
    abstract fun mealsDao(): MealsDao
}