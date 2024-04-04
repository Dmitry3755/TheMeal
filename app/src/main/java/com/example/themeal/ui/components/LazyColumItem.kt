package com.example.themeal.ui.components

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.themeal.view_models.MealViewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun LazyColumnItem(index: Int, mealViewModel: MealViewModel, configuration: Configuration) {

    Row(
        Modifier
            .fillMaxSize(1f)
            .padding(top = (configuration.screenHeightDp.dp * 3) / 100),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .weight(0.4f)
                .padding(horizontal = 10.dp)
        ) {
            NetworkImage(
                url = mealViewModel.mealsList[index].thumb
            )
        }
        Column(
            Modifier
                .weight(0.6f)
                .padding(horizontal = 10.dp)
        ) {
            Text(
                text = mealViewModel.mealsList[index].name,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onTertiary
            )
            Text(
                text = mealViewModel.getAllIngredient(index),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            Box(
                Modifier.fillMaxWidth(1f),
                contentAlignment = Alignment.BottomEnd
            ) {
                BuyButton { }
            }
        }
    }
}