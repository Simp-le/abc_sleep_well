package com.abc.sleepwell.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.abc.sleepwell.R
import com.abc.sleepwell.model.Day

object DaysRepository {
    val days = listOf(
        Day(
            number = 1,
            action = R.string.day_1_title,
            description = R.string.day_1_description,
            image = R.drawable.day_1
        ),
        Day(
            number = 2,
            action = R.string.day_2_title,
            description = R.string.day_2_description,
            image = R.drawable.day_2
        ),
        Day(
            number = 3,
            action = R.string.day_3_title,
            description = R.string.day_3_description,
            image = R.drawable.day_3
        ),
        Day(
            number = 4,
            action = R.string.day_4_title,
            description = R.string.day_4_description,
            image = R.drawable.day_4
        ),
        Day(
            number = 5,
            action = R.string.day_5_title,
            description = R.string.day_5_description,
            image = R.drawable.day_5
        ),
        Day(
            number = 6,
            action = R.string.day_6_title,
            description = R.string.day_6_description,
            image = R.drawable.day_6
        ),
        Day(
            number = 7,
            action = R.string.day_7_title,
            description = R.string.day_7_description,
            image = R.drawable.day_7
        ),
        Day(
            number = 8,
            action = R.string.day_8_title,
            description = R.string.day_8_description,
            image = R.drawable.day_8
        ),
        Day(
            number = 9,
            action = R.string.day_9_title,
            description = R.string.day_9_description,
            image = R.drawable.day_9
        ),
        Day(
            number = 10,
            action = R.string.day_10_title,
            description = R.string.day_10_description,
            image = R.drawable.day_10
        ),
        Day(
            number = 11,
            action = R.string.day_11_title,
            description = R.string.day_11_description,
            image = R.drawable.day_11
        ),
        Day(
            number = 12,
            action = R.string.day_12_title,
            description = R.string.day_12_description,
            image = R.drawable.day_12
        ),
        Day(
            number = 13,
            action = R.string.day_13_title,
            description = R.string.day_13_description,
            image = R.drawable.day_13
        ),
        Day(
            number = 14,
            action = R.string.day_14_title,
            description = R.string.day_14_description,
            image = R.drawable.day_14
        ),
        Day(
            number = 15,
            action = R.string.day_15_title,
            description = R.string.day_15_description,
            image = R.drawable.day_15
        ),
        Day(
            number = 16,
            action = R.string.day_16_title,
            description = R.string.day_16_description,
            image = R.drawable.day_16
        ),
        Day(
            number = 17,
            action = R.string.day_17_title,
            description = R.string.day_17_description,
            image = R.drawable.day_17
        ),
        Day(
            number = 18,
            action = R.string.day_18_title,
            description = R.string.day_18_description,
            image = R.drawable.day_18
        ),
        Day(
            number = 19,
            action = R.string.day_19_title,
            description = R.string.day_19_description,
            image = R.drawable.day_19
        ),
        Day(
            number = 20,
            action = R.string.day_20_title,
            description = R.string.day_20_description,
            image = R.drawable.day_20
        ),
        Day(
            number = 21,
            action = R.string.day_21_title,
            description = R.string.day_21_description,
            image = R.drawable.day_21
        ),
        Day(
            number = 22,
            action = R.string.day_22_title,
            description = R.string.day_22_description,
            image = R.drawable.day_22
        ),
        Day(
            number = 23,
            action = R.string.day_23_title,
            description = R.string.day_23_description,
            image = R.drawable.day_23
        ),
        Day(
            number = 24,
            action = R.string.day_24_title,
            description = R.string.day_24_description,
            image = R.drawable.day_24
        ),
        Day(
            number = 25,
            action = R.string.day_25_title,
            description = R.string.day_25_description,
            image = R.drawable.day_25
        ),
        Day(
            number = 26,
            action = R.string.day_26_title,
            description = R.string.day_26_description,
            image = R.drawable.day_26
        ),
        Day(
            number = 27,
            action = R.string.day_27_title,
            description = R.string.day_27_description,
            image = R.drawable.day_27
        ),
        Day(
            number = 28,
            action = R.string.day_28_title,
            description = R.string.day_28_description,
            image = R.drawable.day_28
        ),
        Day(
            number = 29,
            action = R.string.day_29_title,
            description = R.string.day_29_description,
            image = R.drawable.day_29
        ),
        Day(
            number = 30,
            action = R.string.day_30_title,
            description = R.string.day_30_description,
            image = R.drawable.day_30
        )
    )

}

class DayDataProvider() : PreviewParameterProvider<Day> {
    override val values = sequenceOf(
        Day(
            number = 1,
            action = R.string.day_1_title,
            description = R.string.day_1_description,
            image = R.drawable.day_1
        )
    )
}

class DayListDataProvider() : PreviewParameterProvider<List<Day>> {
    override val values = sequenceOf(DaysRepository.days)
}
