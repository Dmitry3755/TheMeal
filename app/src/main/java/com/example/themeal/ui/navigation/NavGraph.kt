package com.example.themeal.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.themeal.ui.screen.AccountScreen
import com.example.themeal.ui.screen.BasketScreen
import com.example.themeal.ui.screen.MenuScreen
import com.example.themeal.view_models.CategoriesViewModel
import com.example.themeal.view_models.MealViewModel

@Composable
fun NavGraph(
    navController: NavHostController,
    mealViewModel: MealViewModel,
    categoriesViewModel: CategoriesViewModel
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavigationElement.MenuScreen.route
    ) {
        composable(route = BottomNavigationElement.MenuScreen.route) {
            MenuScreen(mealViewModel, categoriesViewModel)
        }
        composable(route = BottomNavigationElement.AccountScreen.route) {
            AccountScreen()
        }
        composable(route = BottomNavigationElement.BasketSceen.route) {
            BasketScreen()
        }
    }
}