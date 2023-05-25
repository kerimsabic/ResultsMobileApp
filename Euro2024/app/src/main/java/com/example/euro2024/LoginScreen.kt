package com.example.euro2024

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api


import androidx.compose.material3.Text
import androidx.compose.material3.TextField


import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.euro2024.ui.theme.Euro2024Theme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val focusManager= LocalFocusManager.current
    Box() {
        Image(
            painter = painterResource(id = R.drawable.dezko_background2),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Column() {
                Text(
                    text = "EURO2024",
                    fontSize = 35.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            TextField(
                value = name, label = {
                    Text(text = "Username")
                },
                onValueChange = {
                    name = it
                },
                modifier = Modifier.padding(top = 20.dp),
                keyboardActions = KeyboardActions(onNext = {focusManager.moveFocus(FocusDirection.Down)}),
                singleLine = true,


            )

            TextField(
                value = password, label = {
                    Text(text = "Password")
                },
                onValueChange = {
                    password = it
                },
                modifier = Modifier.padding(top = 20.dp),
                singleLine = true,
            )
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = { navController.navigate(Screen.PlayersScreen.route) }) {
                Text(text = "LOGIN", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Euro2024Theme {

    }
}