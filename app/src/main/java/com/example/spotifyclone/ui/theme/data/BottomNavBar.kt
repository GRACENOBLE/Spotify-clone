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

val items = listOf(
    BottomNavigationElement (
        title = "Home",
        icon = Icons.Rounded.Home
    ),
    BottomNavigationElement (
        title = "Search",
        icon = Icons.Rounded.Search
    ),
    BottomNavigationElement (
        title = "Library",
        icon = Icons.Rounded.LibraryMusic
    ),

)

@Composable
fun BottomNavigationBar(){
    NavigationBar (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.inverseOnSurface)
    ){
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == 0,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                },

                label ={
                    Text(
                        text = item.title,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                }
            )
        }
    }
}