package com.example.euro2024

import android.media.AsyncPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.euro2024.model.Resources


@Composable
fun DetailedPlayer(navController: NavController,player: Resources) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id =player.image),
            contentDescription = null,
            modifier = Modifier
                .clip(
                    CircleShape
                )
                .align(Alignment.CenterHorizontally)
                .size(350.dp)

        )
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(id = player.name),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

        )
        Text(
            text = stringResource(id = player.age),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

        )
        Text(
            text = stringResource(id = player.club),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp

        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { navController.navigate(Screen.PlayersScreen.route) }, modifier = Modifier.padding(end = 10.dp)) {
                Text(text = "Back")
            }
        }
    }
}