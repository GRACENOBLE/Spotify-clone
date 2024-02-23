package com.example.spotifyclone.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.LibraryMusic
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.spotifyclone.ui.theme.data.BottomNavigationElement
import com.example.spotifyclone.ui.theme.data.Screen

val items = listOf(
    BottomNavigationElement(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = Screen.HomeScreen.route
    ),
    BottomNavigationElement(
        title = "Search",
        icon = Icons.Rounded.Search,
        route = Screen.SearchScreen.route
    ),
    BottomNavigationElement(
        title = "Library",
        icon = Icons.Rounded.LibraryMusic,
        route = Screen.Library.route
    )
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostPage(){

    val navController = rememberNavController()

    Scaffold (
        bottomBar = {
            NavigationBar (
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.onBackground),
                Color(0xff121212)
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                        onClick = {
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.title,
                                tint = Color.Gray
                            )
                        },

                        label = {
                            Text(
                                text = item.title,
                                color = Color.White
                            )
                        }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreen.route,
            modifier = Modifier
                .padding(padding)
        ) {

            composable(
                route = Screen.HomeScreen.route
            ) {
                HomeScreen(navController = navController)
            }

            composable(
                route = Screen.SearchScreen.route
            ) {
                SearchScreen()
            }

            composable(
                route = Screen.Library.route
            ) {
                LibraryScreen()
            }
        }
    }
}