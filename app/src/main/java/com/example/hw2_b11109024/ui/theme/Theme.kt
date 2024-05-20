package com.example.hw2_b11109024.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun Hw2_b11109024Theme(content: @Composable () -> Unit) {
    val colorScheme = lightColorScheme(
        primary = Color(0xFF6200EE),
        secondary = Color(0xFF03DAC6),
        background = Color(0xFFF2F2F2),
        surface = Color(0xFFFFFFFF),
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
    )

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography, // 使用 AppTypography
        shapes = AppShapes, // 使用 AppShapes
        content = content
    )
}