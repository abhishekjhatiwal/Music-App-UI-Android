package com.example.musicappui.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle, contentDescription = "Account",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Column{
                    Text("Abhishek Verma")
                    Text("georgemdallas@my-own-personal-domain.com")
                }
                IconButton(onClick = { /* Handle account options click */ }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null)
                }
            }
            Row(modifier = Modifier.padding(top = 8.dp)){
                Icon(
                    painter = painterResource(id = R.drawable.ic_musci_player),
                    contentDescription = "My Music",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text("My Music")
            }
            Divider(/*modifier = Modifier.padding(vertical = 8.dp)*/)
        }
    }
}