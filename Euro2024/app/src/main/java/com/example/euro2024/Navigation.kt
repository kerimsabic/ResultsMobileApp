package com.example.euro2024

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.euro2024.model.Datasource
import com.example.euro2024.model.Resources

@Composable
fun Navigation() {
    val navController= rememberNavController()

    val playersList=remember {Datasource().loadResources()}

    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){
        composable(route =Screen.LoginScreen.route ){
            LoginScreen(navController = navController)
        }
        composable(route =Screen.PlayersScreen.route ){
            PlayersScreen(playersList = Datasource().loadResources(),navController)
        }

        playersList.forEach { resources ->
            composable(route = Screen.DetailPlayer.route) {
                DetailedPlayer(navController = navController, player = resources)
            }
        }

    }
}