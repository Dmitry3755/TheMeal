package com.example.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "categories")
data class CategoriesApiResponse(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("idCategory")
    val id: Int,
    @ColumnInfo(name = "name")
    @SerializedName("strCategory")
    val name: String,
    @ColumnInfo(name = "thumb")
    @SerializedName("strCategoryThumb")
    val thumb: String,
    @ColumnInfo(name = "description")
    @SerializedName("strCategoryDescription")
    val description: String
)