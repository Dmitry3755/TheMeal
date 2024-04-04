package com.example.data.repositories.local

import com.example.data.dao.CategoriesDao
import com.example.data.mappers.toCategories
import com.example.data.mappers.toCategoriesApiResponse
import com.example.domain.entities.Categories
import com.example.domain.repositories.local.CategoriesRepositoryDb
import javax.inject.Inject

class CategoriesRepositoryDbImpl @Inject constructor(private val categoriesDao: CategoriesDao) :
    CategoriesRepositoryDb {

    override suspend fun getAllCategories(): List<Categories> {
        return categoriesDao.getAllCategories().map { it.toCategories() }
    }

    override suspend fun insertAllCategories(categoriesList: List<Categories>) {
        categoriesDao.insertAllCategories(categoriesList.map { it.toCategoriesApiResponse() })
    }

}