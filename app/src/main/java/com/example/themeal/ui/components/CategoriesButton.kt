package com.example.themeal.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CategoriesButton(
    textButton: String,
    onClick: () -> Unit,
) {

    var isPressed by remember { mutableStateOf(false) }

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isPressed) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.secondaryContainer,
            contentColor = if (isPressed) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSecondary,
        ),
        onClick = onClick,
        shape = MaterialTheme.shapes.extraSmall,
        modifier = Modifier
            .clickable(
                onClick = { isPressed = !isPressed }
            )
    ) {
        Text(
            text = textButton,
            style = MaterialTheme.typography.bodyMedium
        )
    }

}

@Preview
@Composable
fun AppButtonPreview() {
    CategoriesButton("Пицца", {})
}
