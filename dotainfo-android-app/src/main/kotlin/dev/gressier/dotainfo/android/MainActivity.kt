package dev.gressier.dotainfo.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.gressier.dotainfo.android.ui.ContentView
import dev.gressier.dotainfo.android.ui.theme.DotaInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DotaInfoTheme {
                ContentView()
            }
        }
    }
}