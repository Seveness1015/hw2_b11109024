package com.example.hw2_b11109024

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext

@Composable
fun DetailScreen(spot: Spot, onClose: () -> Unit) {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(
            onClick = onClose,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(20.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back),
                contentDescription = "Back",
                tint = Color.Black
            )
        }
        Image(
            painter = painterResource(id = spot.imageResId),
            contentDescription = spot.name,
            modifier = Modifier
                .size(300.dp)
                .padding(25.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = spot.name,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(18.dp),
            color = Color(0xFF2D5B60)
        )
        Text(
            text = "詳細地址: ${spot.address}",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = spot.details,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(16.dp)
        )
        Button(
            onClick = {
                val uri = Uri.parse(spot.mapUrl)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                context.startActivity(intent)
            },
            modifier = Modifier.padding(22.dp)
        ) {
            Text(text = "Search on Google Maps")
        }
    }
}
