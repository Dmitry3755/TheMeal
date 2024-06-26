package com.example.themeal.view_models

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.example.domain.entities.Meals
import com.example.domain.entities.MealsList
import com.example.domain.use_case.local.GetAllMealsFromDbUseCase
import com.example.domain.use_case.local.InsertAllMealsInDbUseCase
import com.example.domain.use_case.network.GetAllMealsUseCase
import com.example.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealViewModel @Inject constructor(
    private val getAllMealsUseCase: GetAllMealsUseCase,
    private val getAllMealsFromDbUseCase: GetAllMealsFromDbUseCase,
    private val insertAllMealsInDbUseCase: InsertAllMealsInDbUseCase,
) : ViewModel() {

    var mealsList = listOf<Meals>()

    suspend fun getAllMeals(): Result<MealsList> = getAllMealsUseCase.invoke()

    suspend fun insertAllMealsInDb() = insertAllMealsInDbUseCase.invoke(mealsList)

    suspend fun getAllMealsFromDb() {
        mealsList = getAllMealsFromDbUseCase.invoke().toMutableStateList()
    }

    fun getAllIngredient(index: Int) : String {
        var str = ""
        for (ingredient in mealsList[index].ingredientList) {
            if (ingredient != "")
                str += "$ingredient,"
        }
        return str
    }
}