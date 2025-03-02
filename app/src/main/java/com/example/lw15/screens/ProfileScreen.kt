package com.example.app.screens

//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lw15.R


@Composable
fun ProfileScreen(onNavigateBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA8E4A0))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Профиль пользователя", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "Аватар профиля",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Text("Логин: user123")
        Text("Имя: Виктор")
        Text("Возраст: 25")
        Text("Адрес: Набережная мойки 1 квартира 8")
        Text("О себе: Цль визита - Конференция по новым компьютерным технологиям и защите компьютерных программ!")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onNavigateBack() }) {
            Text("Назад")
        }
    }
}
