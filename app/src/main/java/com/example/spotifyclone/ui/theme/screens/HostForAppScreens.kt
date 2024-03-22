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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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

    val currentScreen = remember {
        mutableStateOf<Screen>(Screen.HomeScreen)
    }

    val navController = rememberNavController()

    Scaffold (
        bottomBar = {
            if (currentScreen.value != Screen.MusicPlayerScreen){
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
        }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreen.route,
            modifier = Modifier
                .padding(padding)
        ) {

            composable(
                route = "HomeScreen"
            ) {
                HomeScreen(
                    onNavigateToMusicPlayerScreen = {
                        navController.navigate("MusicPlayerScreen/$it")
                    },
                    navController = navController
                )
                currentScreen.value = Screen.HomeScreen
            }

            composable(
                route = Screen.SearchScreen.route
            ) {
                SearchScreen(navController = navController)
                currentScreen.value = Screen.SearchScreen
            }

            composable(
                route = "ActualSearchScreenRoute"
            ) {
                ActualSearchScreen(navController = navController)
                currentScreen.value = Screen.MusicPlayerScreen
            }

            composable(
                route = Screen.Library.route
            ) {
                LibraryScreen()
                currentScreen.value = Screen.Library
            }

            composable(
                route = "MusicPlayerScreen/{my_param}",
                arguments = listOf(
                    navArgument("my_param"){
                        type = NavType.IntType
                    }
                )
            ){
                val param = it.arguments?.getInt("my_param") ?: return@composable
                MusicPlayerPage(param = param, navController = navController)
                currentScreen.value = Screen.MusicPlayerScreen
            }
            composable(
                route = Screen.PlaylistScreen.route
            ){
                PlayListPage(
                    onNavigateToMusicPlayerScreen = {
                        navController.navigate("MusicPlayerScreen/$it")
                    }
                )
                currentScreen.value = Screen.PlaylistScreen
            }

            composable(
                route = "Settings"
            ){
                SettingsPage()
                currentScreen.value = Screen.MusicPlayerScreen
            }
        }
    }
}