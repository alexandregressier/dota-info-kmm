package dev.gressier.dotainfo.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val lightColorScheme = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
)

private val darkColorScheme = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
)

@Composable
fun DotaInfoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colors = if (darkTheme) darkColorScheme else lightColorScheme

    MaterialTheme(colors, typography, shapes, content)
}