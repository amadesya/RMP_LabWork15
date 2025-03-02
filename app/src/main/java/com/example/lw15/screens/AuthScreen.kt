package com.example.app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lw15.R

@Composable
fun AuthScreen(onNavigateToRegister: () -> Unit, onNavigateToProfile: () -> Unit) {
    var login by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6E3A6))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Экран Авторизации", fontSize = 24.sp, color = Color.Blue)
        Spacer(modifier = Modifier
            .height(16.dp))

        TextField(
            value = login,
            onValueChange = { login = it },
            placeholder = { Text("Введите логин") }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text("Введите пароль") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onNavigateToProfile() }) {
            Text("Войти")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { onNavigateToRegister() }) {
            Text("Зарегистрироваться")
        }

        Image(
            painter = painterResource(id = R.drawable.auth_image),
            contentDescription = "Картинка авторизации",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Crop
        )

    }
}
