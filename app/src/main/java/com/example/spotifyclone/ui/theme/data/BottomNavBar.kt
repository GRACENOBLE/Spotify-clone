package com.example.spotifyclone.ui.theme.data

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LibraryMusic
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

val items = listOf(
    BottomNavigationElement (
        title = "Home",
        icon = Icons.Rounded.Home,
        onClick = {}
    ),
    BottomNavigationElement (
        title = "Search",
        icon = Icons.Rounded.Search,
        onClick = {}
    ),
    BottomNavigationElement (
        title = "Library",
        icon = Icons.Rounded.LibraryMusic,
        onClick = {}
    ),

)

@Preview
@Composable
fun BottomNavigationBar(){
    NavigationBar (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.onBackground),
        Color(0xff121212),

    ){
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == 0,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = Color.Gray
                    )
                },

                label ={
                    Text(
                        text = item.title,
                        color = Color.White
                    )
                }
            )
        }
    }
}