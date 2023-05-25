package com.example.euro2024.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Resources(
    @StringRes val name:Int,
    @StringRes val club:Int,
    @StringRes val age:Int,
    @DrawableRes val image:Int,

)
