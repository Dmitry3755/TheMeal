package com.example.themeal.view_models

import androidx.lifecycle.ViewModel
import com.example.domain.entities.Meals
import com.example.domain.entities.MealsList
import com.example.domain.use_case.network.GetAllMealsUseCase
import com.example.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealViewModel @Inject constructor(
    private val getAllMealsUseCase: GetAllMealsUseCase
) : ViewModel() {

    lateinit var mealsList: MutableList<Meals>

    suspend fun getAllMeals(): Result<MealsList> {
        return getAllMealsUseCase.invoke()
    }

}