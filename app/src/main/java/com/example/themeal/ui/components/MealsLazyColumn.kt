package com.example.themeal.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.domain.entities.Categories
import com.example.themeal.view_models.CategoriesViewModel
import com.example.themeal.view_models.MealViewModel

@Composable
fun MealsLazyColumn(
    padding: PaddingValues,
    categoriesViewModel: CategoriesViewModel,
    categoriesList: List<Categories>,
    mealViewModel: MealViewModel,
    configuration: Configuration
) {

    val selectedCategoryButton =
        remember { mutableStateOf(categoriesViewModel.selectedCategoryButton) }
    val lazyListState = rememberLazyListState()

    LaunchedEffect(selectedCategoryButton.value.value) {
        lazyListState.animateScrollToItem(index = selectedCategoryButton.value.value)
    }

    LazyColumn(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.background),
        state = lazyListState
    ) {
        items(categoriesList.size) { index ->
            val lastVisibleItemPosition =
                lazyListState.layoutInfo.visibleItemsInfo.firstOrNull()?.index ?: 0
            mealViewModel.mealsList.forEachIndexed { id, meal ->
                if (meal.nameCategory == categoriesViewModel.categoriesList[index].name) {
                    categoriesViewModel.selectedCategoryScroll.value.name.value =
                        categoriesViewModel.categoriesList[lastVisibleItemPosition].name
                    categoriesViewModel.selectedCategoryScroll.value.index.value =
                        lastVisibleItemPosition
                    LazyColumnItem(id, mealViewModel, configuration)
                }
            }
        }
    }
}