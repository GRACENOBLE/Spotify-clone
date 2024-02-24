package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclone.ui.theme.data.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordPage(navController:NavController){
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xff121212)
    ) {
        Column (
            modifier = Modifier
                .fillMaxHeight()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(40.dp)),
                value = "New Password",
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
                value = "Repeat New Password",
                onValueChange = {}
            )


            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Button(
                onClick = {
                    navController.navigate(route = Screen.AppRoute.route)
                },
                colors = ButtonDefaults.buttonColors(Color(0xff4CAF50)),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Confirm")
            }
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ForgotPasswordPagePreview(){
    ForgotPasswordPage(navController = rememberNavController())
}