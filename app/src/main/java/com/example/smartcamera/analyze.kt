package com.example.smartcamera

import android.graphics.Bitmap
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions

fun analyzeImage(bitmap: Bitmap) {
    // Rozpoznawanie obiektów
    val imageLabeler = ImageLabeling.getClient(ImageLabelerOptions.DEFAULT_OPTIONS)
    val image = InputImage.fromBitmap(bitmap, 0)
    imageLabeler.process(image)
        .addOnSuccessListener { labels ->
            // Obsługa wyników rozpoznawania obiektów
        }
        .addOnFailureListener { e ->
            // Obsługa błędów
        }

    // Rozpoznawanie tekstu
    val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
    recognizer.process(image)
        .addOnSuccessListener { visionText ->
            // Obsługa wyników rozpoznawania tekstu
        }
        .addOnFailureListener { e ->
            // Obsługa błędów
        }
}