package com.example.themeal.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun NetworkImage(
    url: String,
) {
        AsyncImage(
            model = url,
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.Inside,
            filterQuality = FilterQuality.Low
        )
}