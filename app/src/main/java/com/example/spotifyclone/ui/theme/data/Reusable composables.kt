package com.example.spotifyclone.ui.theme.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotifyclone.R

val poppins = FontFamily(
    Font(R.font.poppins_black, FontWeight.Black),
    Font(R.font.poppins_bold, FontWeight.Bold),
    Font(R.font.poppins_extrabold, FontWeight.ExtraBold),
    Font(R.font.poppins_extralight, FontWeight.ExtraLight),
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_thin, FontWeight.Thin),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
    Font(R.font.poppins_semibolditalic, FontWeight.SemiBold)
)

val iconSize = 32.dp
val headingSize = 30.sp
val posterSize = 170.dp

@Composable
fun ReusableTextButton(
    onClick: ()-> Unit,
    painterSource: Painter,
    contentDescription: String,
    modifier: Modifier = Modifier,
    buttonText: String
){

    val buttonPadding = 15.dp
    TextButton(
        onClick = onClick,
        modifier = modifier
            .padding(
                start = buttonPadding,
                end = buttonPadding,
                top = 5.dp
            )
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(40.dp),
                color = Color.White
            )
            .fillMaxWidth()
            .height(54.dp)

    ) {
        Row (
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterSource,
                contentDescription = contentDescription,
                modifier = modifier
                    .size(iconSize)
            )
            Row (
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = buttonText,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontFamily = poppins,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
fun ReusableMusic(
    painterSource: Painter,
    contentDescription: String,
    label: String
){
    val reusableWidth = 170.dp
    Column (
        modifier = Modifier
            .width(reusableWidth)
            .padding(end = 10.dp)
    ) {
        Image(
            painter = painterSource,
            contentDescription = contentDescription,
            modifier = Modifier
                .size(posterSize)
        )
        Text(
            modifier = Modifier
                .width(reusableWidth),
            text = label,
            style = TextStyle(
                color = Color.White,
                fontFamily = poppins,
                fontWeight = FontWeight.Normal
            )

        )
    }
}

@Composable
fun ReusableSurface(
    genre: String,
    color: Color
){
    Surface (
        modifier = Modifier
            .height(130.dp)
            .width(180.dp),
        shape = RoundedCornerShape(10.dp),
        color = color,
    ) {
        Text(
            modifier = Modifier
                .padding(
                    start = 10.dp,
                    top = 10.dp),
            text = genre,
            style = TextStyle(
                fontFamily = poppins,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            )
        )
    }
}

@Composable
fun ReusableMusicTab(
    poster: Painter,
    title: String,
    author: String
){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row {
            Image(
                modifier = Modifier
                    .size(60.dp),
                painter = poster,
                contentDescription = "Variable music poster"
            )
            Column (
                modifier = Modifier
                    .padding(start = 10.dp)
            ) {
                Text(
                    text = title,
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = poppins,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Row {
                    Surface (
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(3.dp))
                    ){
                        Text(text = " LYRICS ")
                    }
                    Text(
                        text = author,
                        style = TextStyle(
                            color = Color.White,
                            fontFamily = poppins,
                            fontWeight = FontWeight.Light
                        )
                    )
                }
            }
        }
        Image(
            modifier = Modifier
                .size(30.dp),
            painter = painterResource(id = R.drawable.properties),
            contentDescription = "Properties"
        )
    }
}

val startColor = Color(0xff484C4D)
val endColor = Color(0xff121212)
fun reusableGradient(
    start: Color,
    finish: Color
): Brush {
    return Brush.verticalGradient(
        colors = listOf(start,finish)
    )
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ReusableComposable(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xff121212)
    ) {
        ReusableMusic(
            painterSource = painterResource(id = R.drawable.ed_sheeran),
            contentDescription = "Ed Sheran",
            label = "Ed Sheeran, Katy Perry, Pit-bull and more"
        )
    }
}

