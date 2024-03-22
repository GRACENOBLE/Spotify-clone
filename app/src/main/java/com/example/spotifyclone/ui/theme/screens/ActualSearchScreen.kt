package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.ReusableMusicTab
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActualSearchScreen(navController: NavController){
    var text by remember{ mutableStateOf("") }

    Surface (
        color = Color(0xff121212),
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            Surface(
                color = Color(0xff272725),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    Image(
                        modifier = Modifier
                            .clickable {
                                navController.popBackStack()
                            }
                            .padding(
                                start = 10.dp,
                                end = 10.dp,
                                )
                            .size(iconSize)                            ,
                        painter = painterResource(id = R.drawable.whitebackarrow),
                        contentDescription = ""
                    )
                    OutlinedTextField(
                        label = {Text("What do you want to listen to?")},
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = text,
                        onValueChange = {text = it},


                    )

                }
            }
            Text(
                modifier = Modifier
                    .padding(
                        top = 20.dp,
                        bottom = 15.dp,
                        start = 10.dp
                    ),
                text = "Recent searches",
                style = TextStyle(
                    fontFamily = poppins,
                    color = Color.White,
                    fontSize = 20.sp
                )
            )
            LazyColumn (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp)
            ) {
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.believer),
                        title = "Alone",
                        author = " Alan Walker"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.let_melove_you),
                        title = "Let me love you",
                        author = " Justin Bieber ft DJ Snake"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.ignite),
                        title = "Ignite",
                        author = " Alan Walker"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.taki_taki),
                        title = "Taki Taki",
                        author = " DJ Snake feat Selena Gomez"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.believer_poster),
                        title = "Believer",
                        author = " Imagine Dragons"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.believer),
                        title = "Alone",
                        author = " Alan Walker"
                    )
                }

                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.let_melove_you),
                        title = "Let me love you",
                        author = " Justin Bieber ft DJ Snake"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.ignite),
                        title = "Ignite",
                        author = " Alan Walker"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.taki_taki),
                        title = "Taki Taki",
                        author = " DJ Snake feat Selena Gomez"
                    )
                }
                item {
                    ReusableMusicTab(
                        onClick = {},
                        poster = painterResource(id = R.drawable.believer_poster),
                        title = "Believer",
                        author = " Imagine Dragons"
                    )
                }

            }
        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun ActualSearchScreenPreview(){
//    ActualSearchScreen()
//}