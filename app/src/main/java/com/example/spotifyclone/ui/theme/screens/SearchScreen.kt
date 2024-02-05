package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.ReusableSurface
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun SearchScreen(){
    Surface (
        modifier =Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ){

        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Search",
                style = TextStyle(
                    fontSize = headingSize,
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        top = 30.dp
                    )
            )

            Surface (
                color = Color.White,
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        end = 10.dp
                    )
                    .fillMaxWidth()
                    .clickable {  }
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .size(50.dp),
                        painter = painterResource(
                            id = R.drawable.search),
                        contentDescription = ""
                    )
                    Text(
                        text = "What do you want to listen to?",
                        style = TextStyle(
                            fontFamily = poppins,
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                    )
                }
            }

            Text(
                text = "Your top genres",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Light
                ),
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        top = 30.dp
                    )
            )

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                ReusableSurface(
                    genre = "Pop",
                    color = Color(0xff8C67AC)
                )
                ReusableSurface(
                    genre = "Bollywood",
                    color = Color(0xff8B1932)
                )

            }

            Text(
                text = "Browse all",
                style = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Light
                ),
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        top = 30.dp
                    )
            )

            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ReusableSurface(
                        genre = "Podcasts",
                        color = Color(0xffE13300)
                    )
                    ReusableSurface(
                        genre = "New\n" +
                                "Releases",
                        color = Color(0xffE8125C)
                    )

                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ReusableSurface(
                        genre = "Charts",
                        color = Color(0xff8C67AC)
                    )
                    ReusableSurface(
                        genre = "Concerts",
                        color = Color(0xff1E3264)
                    )

                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ReusableSurface(
                        genre = "Made for\n" + "you",
                        color = Color(0xff1E3264)
                    )
                    ReusableSurface(
                        genre = "At Home",
                        color = Color(0xff477D95)
                    )

                }
            }


        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun SearchScreenPreview(){
    SearchScreen()
}