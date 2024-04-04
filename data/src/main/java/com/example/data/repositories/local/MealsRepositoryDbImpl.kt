package com.example.data.repositories.local

import com.example.data.dao.CategoriesDao
import com.example.data.dao.MealsDao
import com.example.data.mappers.toCategories
import com.example.data.mappers.toCategoriesApiResponse
import com.example.data.mappers.toMeals
import com.example.data.mappers.toMealsApiResponse
import com.example.domain.entities.Categories
import com.example.domain.entities.Meals
import com.example.domain.repositories.local.CategoriesRepositoryDb
import com.example.domain.repositories.local.MealsRepositoryDb
import javax.inject.Inject

class MealsRepositoryDbImpl @Inject constructor(private val mealsDao: MealsDao) :
    MealsRepositoryDb {

    override suspend fun getAllMeals(): List<Meals> {
        return mealsDao.getAllMeals().map { it.toMeals() }
    }

    override suspend fun insertAllMeals(mealsList: List<Meals>) {
        mealsDao.insertAllMeals(mealsList.map { it.toMealsApiResponse() })
    }

}