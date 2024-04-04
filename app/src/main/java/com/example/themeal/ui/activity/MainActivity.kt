package com.example.themeal.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.themeal.ui.navigation.NavGraph
import com.example.themeal.ui.screen.NavBarScreen
import com.example.themeal.ui.theme.TheMealTheme
import com.example.themeal.view_models.CategoriesViewModel
import com.example.themeal.view_models.MealViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mealViewModel: MealViewModel by viewModels()
    private val categoriesViewModel: CategoriesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheMealTheme {
                NavBarScreen(mealViewModel, categoriesViewModel)
            }
        }
    }


    @Preview(showBackground = true, device = "id:pixel_2", name = "Pixel 2")
    @Preview(showBackground = true, device = "id:Nexus 9", name = "Nexus 9")
    @Preview(showBackground = true, device = "id:desktop_small", name = "Small Desktop")
    @Composable
    fun GreetingPreview() {
        TheMealTheme {
            NavBarScreen(hiltViewModel(), hiltViewModel())
        }
    }
}