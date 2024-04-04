package com.example.themeal.services

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class SelectedCategory(
    var index: MutableState<Int> = mutableStateOf(0),
    var name: MutableState<String> = mutableStateOf(""),
)