package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountLoginScreen(){
    Surface(
        modifier =Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(iconSize),
                    painter = painterResource(id = R.drawable.spotify),
                    contentDescription = ""
                )

                Text(
                    text = " Spotify",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = poppins,
                        fontSize = headingSize,
                        fontWeight = FontWeight.Bold

                    )
                )
            }

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Text(
                text = "SIGN IN",
                style = TextStyle(
                    color = Color.White,
                    fontFamily = poppins,
                    fontWeight = FontWeight.Medium
                )
            )




            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(40.dp)),
                value = "Username",
                onValueChange = {}
            )

                Spacer(
                    modifier = Modifier
                        .height(25.dp)
                )
                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(40.dp)),
                    value = "Password",
                    onValueChange = {}
                )

                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                )

                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff4CAF50)),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "SIGN IN")
                }

                Spacer(
                    modifier = Modifier
                        .height(50.dp)
                )

                Text(
                    modifier = Modifier
                        .clickable { },
                    text = "Forgot Password?",
                    style = TextStyle(
                        color = Color.Gray
                    )
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun AccountLoginScreenPreview(){
    AccountLoginScreen()
}