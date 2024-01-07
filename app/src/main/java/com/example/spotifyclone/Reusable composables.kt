package com.example.spotifyclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                top= 5.dp
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
                    .size(32.dp)
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
