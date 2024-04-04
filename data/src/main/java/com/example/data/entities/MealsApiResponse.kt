package com.example.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "meals")
data class MealsApiResponse(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("idMeal")
    val id: Int,
    @ColumnInfo(name = "name")
    @SerializedName("strMeal")
    val name: String,
    @ColumnInfo(name = "drink_alternate")
    @SerializedName("strDrinkAlternate")
    val drinkAlternate: Boolean?,
    @ColumnInfo(name = "name_category")
    @SerializedName("strCategory")
    val nameCategory: String,
    @ColumnInfo(name = "area")
    @SerializedName("strArea")
    val area: String,
    @ColumnInfo(name = "instructions")
    @SerializedName("strInstructions")
    val instructions: String,
    @ColumnInfo(name = "thumb")
    @SerializedName("strMealThumb")
    val thumb: String,
    @ColumnInfo(name = "tags")
    @SerializedName("strTags")
    val tags: String?,
    @ColumnInfo(name = "youtube_link")
    @SerializedName("strYoutube")
    val youTubeLink: String,
    @ColumnInfo(name = "ingredient1")
    @SerializedName("strIngredient1")
    val strIngredient1: String?,
    @ColumnInfo(name = "ingredient2")
    @SerializedName("strIngredient2")
    val strIngredient2: String?,
    @ColumnInfo(name = "ingredient3")
    @SerializedName("strIngredient3")
    val strIngredient3: String?,
    @ColumnInfo(name = "ingredient4")
    @SerializedName("strIngredient4")
    val strIngredient4: String?,
    @ColumnInfo(name = "ingredient5")
    @SerializedName("strIngredient5")
    val strIngredient5: String?,
    @ColumnInfo(name = "ingredient6")
    @SerializedName("strIngredient6")
    val strIngredient6: String?,
    @ColumnInfo(name = "ingredient7")
    @SerializedName("strIngredient7")
    val strIngredient7: String?,
    @ColumnInfo(name = "ingredient8")
    @SerializedName("strIngredient8")
    val strIngredient8: String?,
    @ColumnInfo(name = "ingredient9")
    @SerializedName("strIngredient9")
    val strIngredient9: String?,
    @ColumnInfo(name = "ingredient10")
    @SerializedName("strIngredient10")
    val strIngredient10: String?,
    @ColumnInfo(name = "ingredient11")
    @SerializedName("strIngredient11")
    val strIngredient11: String?,
    @ColumnInfo(name = "ingredient12")
    @SerializedName("strIngredient12")
    val strIngredient12: String?,
    @ColumnInfo(name = "ingredient13")
    @SerializedName("strIngredient13")
    val strIngredient13: String?,
    @ColumnInfo(name = "ingredient14")
    @SerializedName("strIngredient14")
    val strIngredient14: String?,
    @ColumnInfo(name = "ingredient15")
    @SerializedName("strIngredient15")
    val strIngredient15: String?,
    @ColumnInfo(name = "ingredient16")
    @SerializedName("strIngredient16")
    val strIngredient16: String?,
    @ColumnInfo(name = "ingredient17")
    @SerializedName("strIngredient17")
    val strIngredient17: String?,
    @ColumnInfo(name = "ingredient18")
    @SerializedName("strIngredient18")
    val strIngredient18: String?,
    @ColumnInfo(name = "ingredient19")
    @SerializedName("strIngredient19")
    val strIngredient19: String?,
    @ColumnInfo(name = "ingredient20")
    @SerializedName("strIngredient20")
    val strIngredient20: String?,
    @ColumnInfo(name = "measure1")
    @SerializedName("strMeasure1")
    val strMeasure1: String?,
    @ColumnInfo(name = "measure2")
    @SerializedName("strMeasure2")
    val strMeasure2: String?,
    @ColumnInfo(name = "measure3")
    @SerializedName("strMeasure3")
    val strMeasure3: String?,
    @ColumnInfo(name = "measure4")
    @SerializedName("strMeasure4")
    val strMeasure4: String?,
    @ColumnInfo(name = "measure5")
    @SerializedName("strMeasure5")
    val strMeasure5: String?,
    @ColumnInfo(name = "measure6")
    @SerializedName("strMeasure6")
    val strMeasure6: String?,
    @ColumnInfo(name = "measure7")
    @SerializedName("strMeasure7")
    val strMeasure7: String?,
    @ColumnInfo(name = "measure8")
    @SerializedName("strMeasure8")
    val strMeasure8: String?,
    @ColumnInfo(name = "measure9")
    @SerializedName("strMeasure9")
    val strMeasure9: String?,
    @ColumnInfo(name = "measure10")
    @SerializedName("strMeasure10")
    val strMeasure10: String?,
    @ColumnInfo(name = "measure11")
    @SerializedName("strMeasure11")
    val strMeasure11: String?,
    @ColumnInfo(name = "measure12")
    @SerializedName("strMeasure12")
    val strMeasure12: String?,
    @ColumnInfo(name = "measure13")
    @SerializedName("strMeasure13")
    val strMeasure13: String?,
    @ColumnInfo(name = "measure14")
    @SerializedName("strMeasure14")
    val strMeasure14: String?,
    @ColumnInfo(name = "measure15")
    @SerializedName("strMeasure15")
    val strMeasure15: String?,
    @ColumnInfo(name = "measure16")
    @SerializedName("strMeasure16")
    val strMeasure16: String?,
    @ColumnInfo(name = "measure17")
    @SerializedName("strMeasure17")
    val strMeasure17: String?,
    @ColumnInfo(name = "measure18")
    @SerializedName("strMeasure18")
    val strMeasure18: String?,
    @ColumnInfo(name = "measure19")
    @SerializedName("strMeasure19")
    val strMeasure19: String?,
    @ColumnInfo(name = "measure20")
    @SerializedName("strMeasure20")
    val strMeasure20: String?,
    @ColumnInfo(name = "source")
    @SerializedName("strSource")
    val source: String?,
    @ColumnInfo(name = "image_source")
    @SerializedName("strImageSource")
    val imageSource: String?,
    @ColumnInfo(name = "creative_commons_confirmed")
    @SerializedName("strCreativeCommonsConfirmed")
    val creativeCommonsConfirmed: String?,
    @ColumnInfo(name = "date_modified")
    @SerializedName("dateModified")
    val dateModified: String?,
)