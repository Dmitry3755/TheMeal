package com.example.themeal.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.domain.utils.Result
import com.example.themeal.services.CheckStateInternet
import com.example.themeal.ui.components.AppView
import com.example.themeal.ui.components.CategoriesLabel
import com.example.themeal.ui.components.MealsLazyColumn
import com.example.themeal.view_models.CategoriesViewModel
import com.example.themeal.view_models.MealViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(mealViewModel: MealViewModel, categoriesViewModel: CategoriesViewModel) {

    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
    val launchedEffect = remember {
        mutableStateOf(false)
    }

    LaunchedEffect(launchedEffect) {
        launchedEffect.value = withContext(Dispatchers.IO) {
            if (CheckStateInternet(context)) {
                val mealsResult = mealViewModel.getAllMeals()
                val categoriesResult = categoriesViewModel.getAllCategories()
                if (mealsResult is Result.Success) {
                    mealViewModel.mealsList = mealsResult.data.meals.toMutableStateList()
                    mealViewModel.insertAllMealsInDb()
                } else {
                    mealViewModel.getAllMealsFromDb()
                    categoriesViewModel.getAllCategoriesFromDb()
                }
                if (categoriesResult is Result.Success) {
                    categoriesViewModel.categoriesList =
                        categoriesResult.data.categories.toMutableStateList()
                    categoriesViewModel.insertAllCategoriesInDb()
                } else {
                    mealViewModel.getAllMealsFromDb()
                    categoriesViewModel.getAllCategoriesFromDb()
                }
            } else {
                mealViewModel.getAllMealsFromDb()
                categoriesViewModel.getAllCategoriesFromDb()
            }
            return@withContext true
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.125f)
                .background(color = MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.BottomCenter
        ) {
            AppView()
        }

        Scaffold(modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection), topBar = {
            MediumTopAppBar(
                title = {
                    CategoriesLabel(
                        categoriesViewModel.categoriesList, configuration, categoriesViewModel
                    )
                },
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color.Transparent,
                    scrolledContainerColor = MaterialTheme.colorScheme.primaryContainer,
                    navigationIconContentColor = Color.Transparent,
                    actionIconContentColor = Color.Transparent
                )
            )
        }) {
            MealsLazyColumn(
                padding = it,
                categoriesViewModel = categoriesViewModel,
                categoriesList = categoriesViewModel.categoriesList,
                mealViewModel = mealViewModel,
                configuration = configuration
            )
        }
    }
}

@Preview
@Composable
fun MenuScreenPreview() {
    MenuScreen(hiltViewModel(), hiltViewModel())
}