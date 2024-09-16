package com.example.datossinmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.datossinmvvm.ui.theme.DatosSinMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            DatosSinMVVMTheme {
                // Utiliza Scaffold para el diseño de la aplicación
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Llamas a tu ScreenUser aquí
                    ScreenUser(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

