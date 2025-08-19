package com.example.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import com.example.musicappui.R

@Composable
fun Browse(){
    val category = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
    LazyVerticalGrid(GridCells.Fixed(2)){
        items(category.size){cat->
            BrowserItem(cat=category[cat], drawable = R.drawable.ic_browse)
        }
    }
}