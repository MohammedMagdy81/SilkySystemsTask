package com.example.silkysystemstask.models

import androidx.annotation.DrawableRes

data class ItemHomeModel(
    val title: String,
    val price: Double,
    @DrawableRes val image: Int
)
