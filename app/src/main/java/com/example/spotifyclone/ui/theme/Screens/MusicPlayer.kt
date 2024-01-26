package com.example.spotifyclone.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun MusicPlayerPage(){
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ){

        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(20.dp),
                    painter = painterResource(
                        id = R.drawable.arrow
                    ),
                    contentDescription = "Arrow to minimise music player"
                )
                Column {
                    Text(
                        text = "PLAYING FROM SEARCH",
                        style = TextStyle(
                            color = Color.White,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Light
                        )
                    )
                    Text(
                        text = "\"stay\" in Songs",
                        style = TextStyle(
                            color = Color.White,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Light
                        )
                    )
                }
                Image(
                    modifier = Modifier
                        .size(iconSize),
                    painter = painterResource(id = R.drawable.properties),
                    contentDescription = "Properties"
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 30.dp,
                        end = 30.dp
                    )
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp),
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(id = R.drawable.poster),
                    contentDescription = "Current Playing song's poster",
                )

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "STAY (with Justin Bieber)",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = poppins,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )

                        )
                        Text(
                            text = "The Kid LAROI, Justin Bieber",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = poppins,
                                fontWeight = FontWeight.Light,
                                fontSize = 20.sp
                            )

                        )
                    }

                    Image(
                        modifier = Modifier
                            .size(iconSize),
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "heart icon"
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
fun MusicPlayerPagePreview(){
    MusicPlayerPage()
}