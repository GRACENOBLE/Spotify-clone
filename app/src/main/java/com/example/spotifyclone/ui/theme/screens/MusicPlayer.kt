package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun MusicPlayerPage(param: Int){



    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ){

        Column (
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(20.dp)
                        .clickable {  },
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
                        .size(iconSize)
                        .clickable {  },
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
                    painter = painterResource(id = param),
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
                            .size(iconSize)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "heart icon"
                    )
                }

                Slider(
                    value = 0f, // Adjust based on current position
                    valueRange = 0f..1f, // Adjust based on audio duration
                    onValueChange = { }, // Implement playback seeking
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 20.dp
                        )

                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            bottom = 20.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment =Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier
                            .size(iconSize)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.shuffle),
                        contentDescription = "" )
                    Image(
                        modifier = Modifier
                            .size(iconSize)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.previous_play),
                        contentDescription = "" )
                    Image(
                        modifier = Modifier
                            .size(76.dp)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.pause),
                        contentDescription = "" )
                    Image(
                        modifier = Modifier
                            .size(iconSize)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.next_play),
                        contentDescription = "" )
                    Image(
                        modifier = Modifier
                            .size(iconSize)
                            .clickable {  },
                        painter = painterResource(id = R.drawable.loop),
                        contentDescription = "" )

                }

                Row(
                    modifier =Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.cast),
                        contentDescription = "")
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.share),
                        contentDescription = "")
                }

                Surface (
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .fillMaxWidth()
                        .height(410.dp),
                    color = Color(0xffAD8C7B)
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    top = 10.dp,
                                    start = 10.dp,
                                    end = 10.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Lyrics",
                                color = Color.White,
                                style = TextStyle(
                                    fontFamily = poppins,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 20.sp
                                )
                            )

                            Image(
                                modifier = Modifier
                                    .size(iconSize)
                                    .clickable {  },
                                painter = painterResource(id = R.drawable.full_screen),
                                contentDescription = ""
                            )
                        }
                    }

                }

            }
        }
    }
}
//
//@Preview(
////    showSystemUi = true,
//    showBackground = true
//)
//@Composable
//fun MusicPlayerPagePreview(){
//    MusicPlayerPage()
//}