package com.example.themeal.ui.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import com.example.themeal.R

@Composable
fun NetworkImage(
    url: String,
) {
    AsyncImage(
        modifier = Modifier
            .clip(CircleShape),
        model = url,
        contentDescription = null,
        placeholder = painterResource(id = R.drawable.ic_error),
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.Inside,
        filterQuality = FilterQuality.None
    )
}