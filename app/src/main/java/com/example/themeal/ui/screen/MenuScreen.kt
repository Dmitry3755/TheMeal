package com.example.themeal.ui.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.domain.utils.Result
import com.example.themeal.ui.components.LazyColumnItem
import com.example.themeal.view_models.MealViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun MenuScreen(mealViewModel: MealViewModel) {

    var state by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(state) {
        withContext(Dispatchers.IO) {
            val result = mealViewModel.getAllMeals()
            if (result is Result.Success) {
                mealViewModel.mealsList = result.data.meals.toMutableList()
            }
            state = true
        }
    }

    LazyColumn() {
        item {
            //   LazyColumnItem()
        }
    }

}

@Preview
@Composable
fun MenuScreenPreview() {

}