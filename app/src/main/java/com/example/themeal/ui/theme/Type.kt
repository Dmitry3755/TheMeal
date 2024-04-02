package com.example.themeal.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.themeal.R

private val Roboto = FontFamily(
    Font(R.font.roboto_thin),
)

private val SfUiDisplay = FontFamily(
    Font(R.font.sf_ui_display_light)
)

private val Inter = FontFamily(
    Font(R.font.inter_thin),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(

    bodyLarge = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 18.75.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = SfUiDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 15.51.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Center
    )
)