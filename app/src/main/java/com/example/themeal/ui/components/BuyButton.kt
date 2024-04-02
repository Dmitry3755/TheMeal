package com.example.themeal.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BuyButton(
    onClick: () -> Unit,
) {
    OutlinedButton(
        border = BorderStroke(
            1.dp,
            MaterialTheme.colorScheme.onSecondary
        ),
        onClick = onClick
    ) {
        Text(
            text = "от 345 р", style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSecondary
        )
    }
}

@Preview
@Composable
fun BuyButtonPreview() {
    BuyButton({})
}