package com.example.domain.entities

data class Meals(
    val id: Int,
    val name: String,
    val drinkAlternate: Boolean?,
    val nameCategory: String,
    val area: String,
    val instructions: String,
    val thumb: String,
    val tags: String?,
    val youTubeLink: String,
    val ingredientList: List<String?>,
    val measureList: List<String?>,
    val source: String?,
    val imageSource: String?,
    val creativeCommonsConfirmed: String?,
    val dateModified: String?,
)