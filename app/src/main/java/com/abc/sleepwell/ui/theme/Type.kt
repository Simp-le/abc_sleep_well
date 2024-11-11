package com.abc.sleepwell.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.abc.sleepwell.R

val Poiret = FontFamily(Font(R.font.poiret_one_regular))

val ZenMaruGothic = FontFamily(
    Font(R.font.zen_maru_gothic_regular),
    Font(R.font.zen_maru_gothic_light, weight = FontWeight.Light),
    Font(R.font.zen_maru_gothic_medium, weight = FontWeight.Medium),
    Font(R.font.zen_maru_gothic_bold, weight = FontWeight.Bold),
    Font(R.font.zen_maru_gothic_black, weight = FontWeight.Black)
)

val Typography = Typography(
    headlineLarge = TextStyle(fontFamily = Poiret, fontSize = 40.sp),
    bodyLarge = TextStyle(
        fontFamily = ZenMaruGothic,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
)