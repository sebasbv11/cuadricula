package com.jsbv99.cuadricula.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @param:StringRes val name: Int,
    val availableCourses: Int,
    @param:DrawableRes val imageRes: Int
)
