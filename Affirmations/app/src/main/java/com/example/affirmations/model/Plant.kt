package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Plant(
    @StringRes val stringResourceId: Int,
     val imageResourceId: String
)