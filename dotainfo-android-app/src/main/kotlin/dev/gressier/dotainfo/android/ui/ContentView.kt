package dev.gressier.dotainfo.android.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.gressier.dotainfo.shared.Meta

@Composable
fun ContentView() {
    val greeting = "Hello, ${Meta.platform}!"

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(greeting)
    }
}

@Preview
@Composable
fun ContentView_Preview() {
    ContentView()
}