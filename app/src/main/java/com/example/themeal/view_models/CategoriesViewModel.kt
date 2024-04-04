package com.example.themeal.view_models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.domain.entities.Categories
import com.example.domain.entities.CategoriesList
import com.example.domain.use_case.local.GetAllCategoriesFromDbUseCase
import com.example.domain.use_case.local.InsertAllCategoriesInDbUseCase
import com.example.domain.use_case.network.GetAllCategoriesUseCase
import com.example.domain.utils.Result
import com.example.themeal.services.SelectedCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val getAllCategoriesUseCase: GetAllCategoriesUseCase,
    private val getAllCategoriesFromDbUseCase: GetAllCategoriesFromDbUseCase,
    private val insertAllCategoriesInDbUseCase: InsertAllCategoriesInDbUseCase
) : ViewModel() {

    var categoriesList = listOf<Categories>()
    var selectedCategoryButton = mutableStateOf(0)
    var selectedCategoryScroll: MutableState<SelectedCategory> = mutableStateOf(SelectedCategory())

    suspend fun getAllCategories(): Result<CategoriesList> = getAllCategoriesUseCase.invoke()

    suspend fun insertAllCategoriesInDb() = insertAllCategoriesInDbUseCase.invoke(categoriesList)

    suspend fun getAllCategoriesFromDb() {
        categoriesList = getAllCategoriesFromDbUseCase.invoke()
    }

}