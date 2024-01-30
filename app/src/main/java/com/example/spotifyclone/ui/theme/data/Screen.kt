package com.example.spotifyclone.ui.theme.data

sealed class Screen (val route: String) {
    object HomeScreen : Screen("HomeScreen")
    object SearchScreen : Screen("SearchScreen")
    object Library : Screen("library")


}