package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.spotifyclone.ui.theme.data.ReusableTextButton
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.poppins

@Composable
fun LoginPage(){
    val buttonPadding = 15.dp
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Surface (
            Modifier.fillMaxSize(),
            color = Color(0xff121212)
        ) {
            Column (//page column
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.spotify_logo),
                    contentDescription = "Spotify Logo",
                    modifier = Modifier
                        .size(100.dp)
                )

                Column (//column of text
                    modifier =Modifier
                        .padding(
                            top = 10.dp,
                            bottom = 30.dp
                        )
                ) {
                    Text(
                        text = "Millions of songs",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = headingSize,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = "Free on Spotify.",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = headingSize,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
                Column {//column of buttons
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = buttonPadding,
                                end = buttonPadding
                            )
                            .height(54.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xff4CAF50))
                    ) {
                        Text(
                            text = "Sign up free",
                            style =TextStyle(
                                color = Color.Black,
                                fontSize = 20.sp,
                                fontFamily = poppins,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                    ReusableTextButton(
                        onClick = { /*TODO*/ },
                        painterSource = painterResource(id = R.drawable.phone),
                        contentDescription = "phone",
                        buttonText = "Continue with phone number"
                    )

                    ReusableTextButton(
                        onClick = { /*TODO*/ },
                        painterSource = painterResource(id = R.drawable.google),
                        contentDescription = "google icon",
                        buttonText = "Continue with Google"
                    )

                    ReusableTextButton(
                        onClick = { /*TODO*/ },
                        painterSource = painterResource(id = R.drawable.facebook),
                        contentDescription = "facebook",
                        buttonText = "Continue with Facebook"
                    )
                }

                Text(
                    text = "log in",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(
                            bottom = 70.dp,
                            top = 10.dp
                        ),
                    fontFamily = poppins,
                    fontWeight = FontWeight.Bold
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
fun LoginPagePreview(){
    LoginPage()
}