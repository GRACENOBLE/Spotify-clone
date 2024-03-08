package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.example.spotifyclone.ui.theme.data.ReusableMusicTab
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun PlayListPage(){
    Surface(
        color = Color(0xff121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(
                        top = 20.dp,
                        bottom = 20.dp
                    )
                    .size(250.dp),
                painter = painterResource(id = R.drawable.music),
                contentDescription = "Current playing song"
            )

            Text(
                text = "Tune in to Top Tracks from Imagine Dragons, Alan Walker and many more",
                style = TextStyle(
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Light
                )
            )

            Row (
                modifier = Modifier
                    .padding(top = 10.dp)
            ){
                Image(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.spotify),
                    contentDescription = "Spotify logo"
                )
                Text(
                    text = "   Spotify",
                    style = TextStyle(
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 20.sp
                    )
                )

            }
            Text(
                modifier = Modifier
                    .padding(top = 10.dp),
                text = "191,165 likes . 3h 45min",
                style = TextStyle(
                    fontFamily = poppins,
                    fontWeight = FontWeight.Light,
                    color = Color.White,
                    fontSize = 20.sp
                )
            )

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Row {
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "Heart icon"
                    )

                    Spacer(
                        modifier = Modifier
                            .width(25.dp)
                    )

                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.properties),
                        contentDescription = "Properties"
                    )
                }
                Image(
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .size(60.dp),
                    painter = painterResource(id = R.drawable.play_button),
                    contentDescription = "Play button"
                )
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.believer),
                    title = "Alone",
                    author = " Alan Walker"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.let_melove_you),
                    title = "Let me love you",
                    author = " Justin Bieber ft DJ Snake"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.ignite),
                    title = "Ignite",
                    author = " Alan Walker"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.taki_taki),
                    title = "Taki Taki",
                    author = " DJ Snake feat Selena Gomez"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.believer_poster),
                    title = "Believer",
                    author = " Imagine Dragons"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.believer),
                    title = "Alone",
                    author = " Alan Walker"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.let_melove_you),
                    title = "Let me love you",
                    author = " Justin Bieber ft DJ Snake"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.ignite),
                    title = "Ignite",
                    author = " Alan Walker"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.taki_taki),
                    title = "Taki Taki",
                    author = " DJ Snake feat Selena Gomez"
                )
                ReusableMusicTab(
                    poster = painterResource(id = R.drawable.believer_poster),
                    title = "Believer",
                    author = " Imagine Dragons"
                )
            }

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PlaylistPagePreview(){
    PlayListPage()
}