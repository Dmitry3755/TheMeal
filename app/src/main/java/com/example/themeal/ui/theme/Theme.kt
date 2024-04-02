package com.example.themeal.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    onPrimary = textButton,
    primaryContainer = buttonBackground,
    onSecondary = textScoped,
    secondaryContainer = buttonScopedBackground,
    background = background,
    onBackground = tabBarBackground,
    onTertiary = mainTextColor,
    onSurface = descriptionText,
    outline = icon
)

@Composable
fun TheMealTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}