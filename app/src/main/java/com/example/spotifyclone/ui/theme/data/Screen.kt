package com.example.spotifyclone.ui.theme.data

sealed class Screen (val route: String) {
    object LoginPage : Screen("LoginPage")
    object HomeScreen : Screen("HomeScreen")
    object SearchScreen : Screen("SearchScreen")
    object Library : Screen("library")
    object AccountCreationScreen : Screen("AccountCreationScreen")
    object PhoneNumberScreen : Screen("PhoneNumberScreen")
    object AuthenticationRoute : Screen("Auth")
    object AppRoute : Screen("App")
    object HostPageRoute : Screen("Host")
    object AccountLoginScreen : Screen("AccountLoginScreen")
    object ForgotPasswordScreen : Screen("ForgotPasswordScreen")


}