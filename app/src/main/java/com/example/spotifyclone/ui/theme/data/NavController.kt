package com.example.spotifyclone.ui.theme.data

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spotifyclone.ui.theme.Screens.HomeScreen
import com.example.spotifyclone.ui.theme.Screens.SearchScreen

//@Composable
//fun SetupNavGraph(
//    navController: NavHostController
//){
//    NavHost(
//        navController = navController,
//        startDestination = Screen.HomeScreen.route
//    ){
//        composable(
//            route = Screen.HomeScreen.route
//        ){
//           HomeScreen(navController = navController)
//        }
//        composable(
//            route = Screen.SearchScreen.route
//        ){
//            SearchScreen()
//        }
//        composable(
//            route = Screen.HomeScreen.route
//        ){
//           HomeScreen(navController = navController)
//        }
//    }
//}