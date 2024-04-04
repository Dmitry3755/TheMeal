package com.example.themeal.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.domain.entities.Categories
import com.example.themeal.services.advancedShadow
import com.example.themeal.view_models.CategoriesViewModel

@Composable
fun CategoriesLabel(
    categoriesList: List<Categories>,
    configuration: Configuration,
    categoriesViewModel: CategoriesViewModel
) {

    val selectedCategory = remember {
        mutableStateOf(categoriesViewModel.selectedCategoryScroll)
    }
    val lazyListState = rememberLazyListState()

    LaunchedEffect(selectedCategory.value.value.index.value) {
        lazyListState.animateScrollToItem(index = selectedCategory.value.value.index.value)
    }

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy((configuration.screenWidthDp.dp * 2) / 100),
        contentPadding = PaddingValues(end = (configuration.screenWidthDp.dp * 3) / 100),
        modifier = Modifier.fillMaxWidth(1f),
        verticalAlignment = Alignment.CenterVertically,
        state = lazyListState
    ) {
        items(
            count = categoriesList.size
        ) { index ->
            Box(
                modifier = Modifier
                    .advancedShadow(
                        offsetY = 6.dp,
                        shadowBlurRadius = 5.dp,
                        alpha = 0.1f
                    )
                    .width((configuration.screenWidthDp.dp * 24) / 100)
                    .height((configuration.screenHeightDp.dp * 5) / 100)
                    .background(
                        color = if (selectedCategory.value.value.name.value == categoriesList[index].name) {
                            MaterialTheme.colorScheme.secondaryContainer
                        } else {
                            MaterialTheme.colorScheme.primaryContainer
                        },
                        shape = MaterialTheme.shapes.extraSmall
                    )
                    .clickable(
                        enabled = selectedCategory.value.value.name.value != categoriesList[index].name,
                        onClick = {
                            categoriesViewModel.selectedCategoryButton.value = index
                        },
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = categoriesList[index].name,
                    style = if (selectedCategory.value.value.name.value == categoriesList[index].name) {
                        MaterialTheme.typography.displayMedium
                    } else {
                        MaterialTheme.typography.bodyMedium
                    },
                    color = if (selectedCategory.value.value.name.value == categoriesList[index].name) {
                        MaterialTheme.colorScheme.onSecondary
                    } else {
                        MaterialTheme.colorScheme.onPrimary
                    },
                )
            }
        }
    }
}