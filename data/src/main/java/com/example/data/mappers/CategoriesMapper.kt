package com.example.data.mappers

import com.example.data.entities.CategoriesApiResponse
import com.example.domain.entities.Categories

fun CategoriesApiResponse.toCategories(): Categories {
    return Categories(
        id = this.id,
        name = this.name,
        thumb = this.thumb,
        description = this.description
    )
}

fun Categories.toCategoriesApiResponse(): CategoriesApiResponse {
    return CategoriesApiResponse(
        id = this.id,
        name = this.name,
        thumb = this.thumb,
        description = this.description
    )
}