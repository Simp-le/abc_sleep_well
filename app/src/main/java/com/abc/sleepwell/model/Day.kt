package com.abc.sleepwell.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    val number: Int,
    @StringRes val action: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
