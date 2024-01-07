package com.example.smartcamera.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CameraScreen() {
    var text by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Rozpoznawanie Obiektów i Tekstu") })
        },
        content = {
            Column {
                Button(onClick = {
                    // TODO: Rozpocznij proces robienia zdjęcia
                }) {
                    Text("Zrób Zdjęcie")
                }

                Text(text) // Wyświetla wyniki rozpoznawania
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CameraScreen()
}