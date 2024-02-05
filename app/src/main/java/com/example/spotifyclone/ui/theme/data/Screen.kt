package com.example.spotifyclone.ui.theme.data

sealed class Screen (val route: String) {
    object LoginPage : Screen("LoginPage")
    object HomeScreen : Screen("HomeScreen")
    object SearchScreen : Screen("SearchScreen")
    object Library : Screen("library")


}