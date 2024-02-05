package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LibraryScreen(){

    Surface (
        modifier =Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 30.dp
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Your Library",
                    fontSize = headingSize,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.search1),
                        contentDescription = "",
                        modifier = Modifier
                            .size(47.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.plus),
                        contentDescription = "",
                        modifier = Modifier
                            .size(iconSize)
                    )
                }
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