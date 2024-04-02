package com.example.data.mappers

import com.example.data.entities.CategoriesApiResponse
import com.example.data.entities.MealsApiResponse
import com.example.domain.entities.Categories
import com.example.domain.entities.Meals

fun MealsApiResponse.toMeals(): Meals {
    return Meals(
        id = this.id,
        name = this.name,
        drinkAlternate = this.drinkAlternate,
        nameCategory = this.nameCategory,
        area = this.area,
        instructions = this.instructions,
        thumb = this.thumb,
        tags = this.tags,
        youTubeLink = this.youTubeLink,
        ingredientList = listOf(
            strIngredient1,
            strIngredient2,
            strIngredient3,
            strIngredient4,
            strIngredient5,
            strIngredient6,
            strIngredient7,
            strIngredient8,
            strIngredient9,
            strIngredient10,
            strIngredient11,
            strIngredient12,
            strIngredient13,
            strIngredient14,
            strIngredient15,
            strIngredient16,
            strIngredient17,
            strIngredient18,
            strIngredient19,
            strIngredient20
        ),
        measureList = listOf(
            strMeasure1,
            strMeasure2,
            strMeasure3,
            strMeasure4,
            strMeasure5,
            strMeasure6,
            strMeasure7,
            strMeasure8,
            strMeasure9,
            strMeasure10,
            strMeasure11,
            strMeasure12,
            strMeasure13,
            strMeasure14,
            strMeasure15,
            strMeasure16,
            strMeasure17,
            strMeasure18,
            strMeasure19,
            strMeasure20
        ),
        source = this.source,
        imageSource = this.imageSource,
        creativeCommonsConfirmed = this.creativeCommonsConfirmed,
        dateModified = this.dateModified
    )
}