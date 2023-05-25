package com.example.euro2024

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.euro2024.model.Resources
import com.example.euro2024.ui.theme.Euro2024Theme

@Composable
fun PlayersScreen(playersList:List<Resources>,navController: NavController) {
    LazyColumn(modifier = Modifier.background(Color.Black)){
        items(playersList){
            player-> PlayerCard(player = player, navController =navController )
        }
    }
}

@Composable
fun PlayerCard(player: Resources,navController: NavController) {
    Box(modifier=Modifier.clickable {
        navController.navigate(Screen.DetailPlayer.route)
    }) {
        Card(modifier = Modifier.border(1.dp, color = Color.Gray)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(Color.Blue)
            ) {
                Image(
                    painter = painterResource(id = player.image),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(
                            CircleShape
                        )
                        .size(100.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column() {
                    Text(
                        text = stringResource(id = player.name),
                        fontSize = 25.sp,
                        color = Color.White,
                        modifier = Modifier.padding(top = 10.dp, bottom = 5.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(id = player.club),
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = stringResource(id = player.age),
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                }
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun PlayerPreview() {
    Euro2024Theme {

    }
}