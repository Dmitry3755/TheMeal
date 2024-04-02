package com.example.data.entities

import com.google.gson.annotations.SerializedName

data class CategoriesApiResponse(
    @SerializedName("idCategory")
    val id : Int,
    @SerializedName("strCategory")
    val name : String,
    @SerializedName("strCategoryThumb")
    val thumb : String,
    @SerializedName("strCategoryDescription")
    val description : String
)