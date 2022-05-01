package dev.gressier.dotainfo.android.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@SuppressLint("ConflictingOnColor")
private val lightColorScheme = lightColors(
    primary = Blue600,
    primaryVariant = Blue400,
    onPrimary = Black1,
    secondary = Color.White,
    secondaryVariant = Teal300,
    onSecondary = Color.Black,
    error = RedErrorDark,
    onError = RedErrorLight,
    background = Grey1,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Black1,
)

private val darkColorScheme = darkColors(
    primary = Blue300,
    primaryVariant = Blue700,
    onPrimary = Color.White,
    secondary = Color.Black,
    secondaryVariant = Teal300,
    onSecondary = Color.White,
    error = RedErrorLight,
    onError = RedErrorDark,
    background = Color.Black,
    onBackground = Color.White,
    surface = Black1,
    onSurface = Color.White,
)

@Composable
fun DotaInfoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) darkColorScheme else lightColorScheme

    MaterialTheme(colors, typography, shapes, content)
}