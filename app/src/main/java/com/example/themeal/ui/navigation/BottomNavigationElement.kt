package com.example.themeal.ui.navigation

import com.example.themeal.R

sealed class BottomNavigationElement(var route: String, var icon: Int, var title: String) {
    object MenuScreen :
        BottomNavigationElement("menu_ screen", R.drawable.ic_menu, "Меню")

    object AccountScreen :
        BottomNavigationElement("account_screen", R.drawable.ic_union, "Профиль")

    object BasketSceen :
        BottomNavigationElement("basket_screen", R.drawable.ic_basket, "Корзина")

}