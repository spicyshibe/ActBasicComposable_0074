package com.example.pertemuan3

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusRestorer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp




@Composable
fun tugasLogin(modifier: Modifier = Modifier) {
    val backgroundImg = painterResource(id = R.drawable.bg)
    val mylogo = painterResource(id = R.drawable.logomymine)
    val fotobulat = painterResource(id = R.drawable.fotobulat)

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = backgroundImg,
            contentDescription = "foto_bg",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(height = 4.dp))
            Text(
                text = "Ceritanya halaman login",
                fontSize = 14.sp,
                color = Color.White
            )
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = mylogo,
                contentDescription = "logo",
                modifier = Modifier.size(90.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(height = 4.dp))

            Text(
                text = "Nama",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan
            )
            Spacer(modifier = Modifier.height(height = 4.dp))
            Text(
                text = "Rafie Rasydan Wahyudi",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan
            )
            Spacer(modifier = Modifier.height(height = 4.dp))
            Text(
                text = "20240140074",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan
            )

        }
        Box(
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) { }

    }
}