package com.example.auth_firebase

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth_firebase.page.HomePage
import com.example.auth_firebase.page.LoginPage
import com.example.auth_firebase.page.SignUpPage

@Composable
fun MyNavigation(authViewModel: AuthViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login"){
            LoginPage(navController,authViewModel)
        }
        composable("signup"){
            SignUpPage(navController,authViewModel)
        }
        composable("homepage"){
            HomePage(navController,authViewModel)
        }
    }
}