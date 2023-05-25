package com.example.euro2024

sealed class Screen(val route:String){
    object LoginScreen:Screen("login_screen")
    object PlayersScreen:Screen("players_screen")
    object DetailPlayer:Screen("detail_player")
}
