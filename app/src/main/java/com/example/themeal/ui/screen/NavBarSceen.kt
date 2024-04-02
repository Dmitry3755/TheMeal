package com.example.themeal.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.themeal.ui.components.BottomBarNavigation
import com.example.themeal.ui.navigation.NavGraph
import com.example.themeal.view_models.MealViewModel

@Composable
fun NavBarScreen(mealViewModel : MealViewModel) {
    val bottomNavigationNavController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBarNavigation(bottomNavigationNavController) },
        content = { padding ->
            Box(
                modifier = Modifier.padding(padding)
            ) {
                NavGraph(bottomNavigationNavController, mealViewModel)
            }
        }
    )
}

@Preview
@Composable
fun NavBarPreview() {
    NavBarScreen(hiltViewModel())
}