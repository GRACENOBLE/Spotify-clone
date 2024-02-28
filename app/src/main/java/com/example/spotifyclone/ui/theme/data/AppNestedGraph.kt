package com.example.spotifyclone.ui.theme.data

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotifyclone.ui.theme.screens.HostPage
import com.example.spotifyclone.ui.theme.screens.MusicPlayerPage

fun NavGraphBuilder.appNestedGraph(navController: NavController){
    navigation(startDestination = Screen.HostPageRoute.route , route = Screen.AppRoute.route){
        composable(route = Screen.HostPageRoute.route){
            HostPage()
        }

        composable(route = Screen.MusicPlayerScreen.route){
            MusicPlayerPage()
        }
    }
}