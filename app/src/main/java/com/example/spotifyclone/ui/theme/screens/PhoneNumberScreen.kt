package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclone.R
import com.example.spotifyclone.ui.theme.data.Screen
import com.example.spotifyclone.ui.theme.data.headingSize
import com.example.spotifyclone.ui.theme.data.iconSize
import com.example.spotifyclone.ui.theme.data.poppins

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneNumberScreen(navController: NavController){
    Surface(
        color = Color(0xff121212)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 10.dp,
                    end = 10.dp
                ),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Enter Phone Number",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = poppins
                )
            )

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.White),
                ) {
                    Text(

                        text = "+256 ",
                        style = TextStyle(
                            fontSize = headingSize,
                            color = Color.White
                        )
                    )
                    Image(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .size(iconSize),
                        painter = painterResource(id = R.drawable.arrow),
                        contentDescription = ""
                    )

                }


                TextField(
                    value = "Phone number",
                    onValueChange = {}
                )
            }

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Button(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally),
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

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PhoneNumberScreenPreview(){
    PhoneNumberScreen(navController = rememberNavController())
}

