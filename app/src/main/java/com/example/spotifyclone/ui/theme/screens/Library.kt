package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(){
    Scaffold {padding ->
        Surface (
            modifier =Modifier
                .fillMaxSize(),
            color = Color(0xff121212)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Library",
                    fontSize = headingSize,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )
            }
        }
    }

}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LibraryScreenPreview(){
    LibraryScreen()
}