package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.ReusableTextButton
import com.example.spotifyclone.ui.theme.data.Screen
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountCreationPage(navController: NavController){
    Surface(
        color = Color(0xff121212)
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = 10.dp,
                    end = 10.dp
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Sign up to start listening",
                style = TextStyle(
                    fontSize = headingSize,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White
                )
            )

            Column {
                Text(
                    text = "Email address",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                )
                TextField(
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = "name@Domain.com",
                    onValueChange = {}
                )
            }

            Text(
                modifier = Modifier
                    .clickable {
                           navController.navigate(route = Screen.PhoneNumberScreen.route)
                    },
                text = "Use phone number instead.",
                style = TextStyle(
                    color = Color(0xff4CAF50),
                    textDecoration = TextDecoration.Underline,
                    fontSize = 20.sp,
                    fontFamily = poppins
                )
            )

            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = {
                          navController.navigate(route = Screen.AppRoute.route)
                          },
                colors = ButtonDefaults.buttonColors(Color(0xff4CAF50))
            ) {
                Text(
                    text = "Next",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            Row (
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally),
            ) {
                Text(

                    text = "---------------",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.ExtraLight
                    )
                )
                Text(

                    text = " or ",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(

                    text = "---------------",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.ExtraLight
                    )
                )
            }

            Column {
                ReusableTextButton(
                    onClick = {
                        navController.navigate(route = Screen.HomeScreen.route)
                    },
                    painterSource = painterResource(id = R.drawable.google),
                    contentDescription = "null",
                    buttonText = "Signup with Google"
                )
                ReusableTextButton(
                    onClick = {
                        navController.navigate(route = Screen.HomeScreen.route)
                    },
                    painterSource = painterResource(id = R.drawable.facebook),
                    contentDescription = "null",
                    buttonText = "Signup with Facebook"
                )
                ReusableTextButton(
                    onClick = {
                        navController.navigate(route = Screen.HomeScreen.route)
                    },
                    painterSource = painterResource(id = R.drawable.apple),
                    contentDescription = "null",
                    buttonText = "Signup with Apple"
                )
            }
            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally),
                text = "---------------------------------",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = poppins,
                    fontWeight = FontWeight.ExtraLight
                )
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Text(
                    modifier = Modifier
                        //.align(alignment = Alignment.CenterHorizontally)
                            ,
                    text = "Already have an account?",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Light
                    )
                )
                Text(
                    modifier = Modifier
                        .clickable {
                               navController.navigate(route = Screen.LoginPage.route)
                        },
                    text = "Log in here.",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }

        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun AccountCreationPagePreview(){
    AccountCreationPage(navController = rememberNavController())
}