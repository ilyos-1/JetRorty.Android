package com.developersancho.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.isImeVisible
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.LocalWindowInsets

@Composable
fun DefaultSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(4.dp)
)

@Composable
fun ExtraSmallSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(6.dp)
)

@Composable
fun SmallSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(12.dp)
)

@Composable
fun MediumSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(18.dp)
)

@Composable
fun LargeSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(24.dp)
)

@Composable
fun ExtraLargeSpacer() = Spacer(
    modifier = Modifier
        .fillMaxWidth()
        .height(30.dp)
)

/**
 * Spacer that has a height of a software keyboard
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun KeyboardSpacer(
    modifier: Modifier = Modifier,
    confirmHeight: (Dp) -> Dp = { it },
) {
    val imeVisible = WindowInsets.isImeVisible
    val imeHeight = with(LocalDensity.current) { WindowInsets.ime.getBottom(LocalDensity.current).toDp() }
    val height by animateDpAsState(if (imeVisible) confirmHeight(imeHeight) else 0.dp)
    Spacer(modifier.height(height))
}