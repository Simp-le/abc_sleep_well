package com.abc.sleepwell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.Spring.DampingRatioLowBouncy
import androidx.compose.animation.core.Spring.DampingRatioNoBouncy
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.abc.sleepwell.data.DayDataProvider
import com.abc.sleepwell.data.DayListDataProvider
import com.abc.sleepwell.data.DaysRepository
import com.abc.sleepwell.model.Day
import com.abc.sleepwell.ui.theme.SleepWellTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { SleepWellApp() }
    }
}

@PreviewScreenSizes
@Composable
fun SleepWellApp() {
    SleepWellTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            SleepWellLayout(
                DaysRepository.days, modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            )
        }
    }
}

@OptIn(ExperimentalAnimationApi::class, ExperimentalFoundationApi::class)
@Composable
fun SleepWellLayout(
    @PreviewParameter(DayListDataProvider::class) days: List<Day>, modifier: Modifier = Modifier
) {
    val initialAnimationState = LocalInspectionMode.current // false
    val visibleState = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }
    AnimatedVisibility(
        visibleState = visibleState,
        modifier = modifier,
        enter = fadeIn(animationSpec = spring(dampingRatio = DampingRatioNoBouncy)),
        exit = fadeOut()
    ) {
        LazyColumn(
            contentPadding = PaddingValues(dimensionResource(R.dimen.medium_padding)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.medium_padding)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemsIndexed(days) { index, day ->
                DayItem(
                    day,
                    modifier = Modifier
                        .animateEnterExit(
                            enter = fadeIn(
                                animationSpec = tween(
                                    durationMillis = 1000, delayMillis = 100
                                )
                            )
                        )
                )
            }
        }
    }
}

@Composable
fun DayItem(
    @PreviewParameter(DayDataProvider::class) day: Day, modifier: Modifier = Modifier
) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier
            .widthIn(max = 1000.dp)
            .clip(MaterialTheme.shapes.medium)
            .clickable { isExpanded = isExpanded.not() }) {
        Column(
            Modifier
                .padding(dimensionResource(R.dimen.medium_padding))
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                ),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.medium_padding))
        ) {
            Text(
                text = "${stringResource(R.string.day)}: ${day.number}",
                style = MaterialTheme.typography.bodyLarge,
            )
            Text(
                text = stringResource(day.action),
                style = MaterialTheme.typography.headlineLarge,
            )
            Image(
                painter = painterResource(day.image),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(275.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            if (isExpanded) Text(
                text = stringResource(day.description), style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}