package com.example.themeal.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.themeal.ui.navigation.BottomNavigationElement

@Composable
fun BottomBarNavigation(navController: NavController) {

    val navigationItems = listOf(
        BottomNavigationElement.MenuScreen,
        BottomNavigationElement.AccountScreen,
        BottomNavigationElement.BasketSceen
    )

    BottomNavigation(
        backgroundColor = MaterialTheme.colorScheme.onBackground,
        contentColor = MaterialTheme.colorScheme.outline,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        navigationItems.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title, style = MaterialTheme.typography.labelMedium,
                        color = if (currentRoute == item.route) {
                            MaterialTheme.colorScheme.onSecondary
                        } else {
                            MaterialTheme.colorScheme.outline
                        }
                    )
                },
                selectedContentColor = MaterialTheme.colorScheme.onSecondary,
                unselectedContentColor = MaterialTheme.colorScheme.outline,
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {

                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }

}

@Preview
@Composable
fun BottomBarNavigationPreview() {
    val navController = rememberNavController()
    BottomBarNavigation(navController)
}