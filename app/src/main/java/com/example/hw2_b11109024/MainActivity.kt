package com.example.hw2_b11109024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hw2_b11109024.ui.theme.Hw2_b11109024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hw2_b11109024Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE0E0E0)
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val spots = Spot.spotDetails.values.toList()
    val isDetailScreenVisible = remember { mutableStateOf(false) }
    val selectedSpot = remember { mutableStateOf(spots[0]) }

    if (isDetailScreenVisible.value) {
        DetailScreen(spot = selectedSpot.value) {
            isDetailScreenVisible.value = false
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sightseeing spots",
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 45.sp,
                modifier = Modifier
                    .padding(35.dp)
                    .background(color = Color(0xFFE0E0E0))
            )
            Spacer(modifier = Modifier.height(20.dp))
            SpotList(spots = spots) { spot ->
                selectedSpot.value = spot
                isDetailScreenVisible.value = true
            }
        }
    }
}

@Composable
fun SpotList(spots: List<Spot>, onItemClick: (Spot) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(spots) { spot ->
            Text(
                text = spot.name,
                fontSize = 30.sp,
                style = MaterialTheme.typography.bodyLarge,

                modifier = Modifier
                    .clickable { onItemClick(spot) }
                    .padding(start = 25.dp, top = 20.dp, end = 25.dp, bottom = 20.dp)
                    .background(color = Color(0xFFdfa660))
            )
        }
    }
}
