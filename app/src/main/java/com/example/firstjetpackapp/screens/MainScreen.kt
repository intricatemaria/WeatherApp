package com.example.firstjetpackapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstjetpackapp.R


@Preview (showBackground = true)
@Composable
fun MainScreen() {
    Image(painter = painterResource(id = R.drawable.weather_bg),
        contentDescription = "im1",
        modifier = Modifier.fillMaxWidth()
            .alpha(0.5f),
        contentScale = ContentScale.FillBounds
    )
}