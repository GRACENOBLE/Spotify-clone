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
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.ReusableSurface
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun SearchScreen(navController: NavController){
    Surface (
        modifier =Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ){

        Column (
            modifier = Modifier
                .fillMaxSize()
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

            Surface(
                color = Color.White,
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                        end = 10.dp
                    )
                    .fillMaxWidth()
                    .clickable { navController.navigate("ActualSearchScreenRoute") }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        modifier = Modifier
                            .size(50.dp),
                        painter = painterResource(
                            id = R.drawable.search
                        ),
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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ReusableSurface(
                    genre = "Pop",
                    color = Color(0xff8C67AC),
                    navController
                )
                ReusableSurface(
                    genre = "Bollywood",
                    color = Color(0xff8B1932),
                    navController
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

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Podcasts",
                            color = Color(0xffE13300),
                            navController
                        )
                        ReusableSurface(
                            genre = "New\n" +
                                    "Releases",
                            color = Color(0xffE8125C),
                            navController
                        )

                    }
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Charts",
                            color = Color(0xff8C67AC),
                            navController
                        )
                        ReusableSurface(
                            genre = "Concerts",
                            color = Color(0xff1E3264),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Made for\n" + "you",
                            color = Color(0xff1E3264),
                            navController
                        )
                        ReusableSurface(
                            genre = "At Home",
                            color = Color(0xff477D95),
                            navController
                        )

                    }
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Afro",
                            color = Color(0xffE13300),
                            navController
                        )
                        ReusableSurface(
                            genre = "Love",
                            color = Color(0xffE8125C),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Hip-Hop",
                            color = Color(0xff8C67AC),
                            navController
                        )
                        ReusableSurface(
                            genre = "Comedy",
                            color = Color(0xff1E3264),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Educational",
                            color = Color(0xff1E3264),
                            navController
                        )
                        ReusableSurface(
                            genre = "Documentary",
                            color = Color(0xff477D95),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Pop-Culture",
                            color = Color(0xff8C67AC),
                            navController
                        )
                        ReusableSurface(
                            genre = "Party",
                            color = Color(0xff477D95),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Mood",
                            color = Color(0xff1E3264),
                            navController
                        )
                        ReusableSurface(
                            genre = "Discover",
                            color = Color(0xff477D95),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Trending",
                            color = Color(0xffE13300),
                            navController
                        )
                        ReusableSurface(
                            genre = "Workout",
                            color = Color(0xffE8125C),
                            navController
                        )

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        ReusableSurface(
                            genre = "Radio",
                            color = Color(0xff1E3264),
                            navController
                        )
                        ReusableSurface(
                            genre = "R&B",
                            color = Color(0xff477D95),
                            navController
                        )

                    }
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
    SearchScreen(navController = rememberNavController())
}