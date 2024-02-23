package com.example.spotifyclone.ui.theme.data

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.spotifyclone.ui.theme.screens.AccountCreationPage
import com.example.spotifyclone.ui.theme.screens.LoginPage
import com.example.spotifyclone.ui.theme.screens.PhoneNumberScreen

fun NavGraphBuilder.authNestedGraph(navController: NavController){
    navigation(startDestination = Screen.LoginPage.route , route = Screen.AuthenticationRoute.route){
        composable(route = Screen.LoginPage.route){
            LoginPage(navController = navController)
        }
        composable(route = Screen.AccountCreationScreen.route){
            AccountCreationPage(navController = navController)
        }
        composable(route = Screen.PhoneNumberScreen.route){
            PhoneNumberScreen(navController = navController)
        }
    }
}