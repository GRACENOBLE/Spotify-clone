package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.ReusableMusic
import com.example.spotifyclone.ui.theme.data.endColor
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

val sheran = R.drawable.ed_sheeran
val justin = R.drawable.justin_bieber

val TrendingImages = arrayOf(
    R.drawable.believer_poster,
    R.drawable.harley_poster,
    R.drawable.cheap_thrills
)

val TopPickImages = arrayOf(
    R.drawable.maroon_5,
    R.drawable.katy_perry,
    R.drawable.cheap_thrills
)

val TrendingLabels = arrayOf(
    "Believer\n"+"Song . Imagine Dragons",
    "Harley’s in Hawaii\n"+"Song . Kary Perry",
    "Cheap Trills\n"+"Song . Imagine Dragons"
)
val TopPickLabels = arrayOf(
    "Girls like you\n"+"Song . Maroon 5",
    "Harley’s in Hawaii\n"+"Song . Kary Perry",
    "Cheap Trills\n"+"Song . Imagine Dragons"
)
@Composable
fun HomeScreen(
    onNavigateToMusicPlayerScreen: (Int) -> Unit,
    navController: NavController
){
    Surface (
        color = endColor,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Surface(
            color = Color(0xff121212),
            modifier = Modifier
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 30.dp
                    )
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Made for you",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = headingSize
                            ),
                            modifier = Modifier
                                .padding(start = 10.dp)
                        )
                        Spacer(
                            modifier = Modifier
                                .width(25.dp)
                        )
                        Row(
                            modifier = Modifier
                                .padding(
                                    end = 20.dp
                                )
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.bell),
                                contentDescription = "bell",
                                modifier = Modifier
                                    .size(iconSize)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.history),
                                contentDescription = "history",
                                modifier = Modifier
                                    .size(iconSize)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.settings),
                                contentDescription = "settings",
                                modifier = Modifier
                                    .size(iconSize)
                                    .clickable {
                                        navController.navigate("Settings")
                                    }
                            )
                        }
                    }
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        ReusableMusic(
                            onClick = {
                                onNavigateToMusicPlayerScreen(sheran)
                            },
                            painterSource = painterResource(id = sheran),
                            contentDescription = "Ed Sheeran",
                            label = "Ed Sheeran, Katy Perry, Pit-bull and more"

                        )
                        ReusableMusic(
                            onClick = {
                                onNavigateToMusicPlayerScreen(justin)
                            },
                            painterSource = painterResource(id = justin),
                            contentDescription = "Justin",
                            label = "Catch the Latest Playlist made just for you...",

                        )
                    }
                }

                item {
                    Row {
                        Text(
                            text = "Trending now",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = headingSize
                            ),
                            modifier = Modifier
                                .padding(
                                    start = 10.dp,
                                    top = 25.dp
                                )
                        )

                    }
                }
                item {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {
                        items(3) {
                            val currentImage = TrendingImages[it]
                            val currentLabel = TrendingLabels[it]
                            ReusableMusic(
                                onClick = {
                                    onNavigateToMusicPlayerScreen(currentImage)
                                },
                                painterSource = painterResource(id = currentImage),
                                contentDescription = "",
                                label = currentLabel
                            )
                        }
                    }
                }
                item {
                    Row {
                        Text(
                            text = "Top picks for you",
                            style = TextStyle(
                                color = Color.White,
                                fontFamily = poppins,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = headingSize
                            ),
                            modifier = Modifier
                                .padding(
                                    start = 10.dp,
                                    top = 25.dp
                                )
                        )

                    }
                }

                item {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {
                        items(3) {
                            val currentImage = TopPickImages[it]
                            val currentLabel = TopPickLabels[it]
                            ReusableMusic(
                                onClick = {
                                    onNavigateToMusicPlayerScreen(currentImage)
                                },
                                painterSource = painterResource(id = currentImage),
                                contentDescription = "",
                                label = currentLabel
                            )
                        }
                    }
                }

            }
        }
    }
}

//@Preview(
//    //showSystemUi = true,
//    showBackground = true
//)
//@Composable
//fun HomeScreenPreview(){
//    HomeScreen(navController = rememberNavController())
//}