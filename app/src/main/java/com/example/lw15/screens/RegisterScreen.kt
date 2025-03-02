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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lw15.R

@Composable
fun RegisterScreen(onNavigateToAuth: () -> Unit) {
    var login by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFE0B2))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Экран Регистрации", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(value = login, onValueChange = { login = it }, placeholder = { Text("Логин") })
        TextField(value = phone, onValueChange = { phone = it }, placeholder = { Text("Телефон") })
        TextField(value = email, onValueChange = { email = it }, placeholder = { Text("Email") })
        TextField(value = password, onValueChange = { password = it }, placeholder = { Text("Пароль") })
        TextField(value = confirmPassword, onValueChange = { confirmPassword = it }, placeholder = { Text("Подтверждение пароля") })
        TextField(value = age, onValueChange = { age = it }, placeholder = { Text("Возраст") })
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onNavigateToAuth() }) {
            Text("ОК")
        }

        Image(
            painter = painterResource(id = R.drawable.register_image),
            contentDescription = "Картинка регистрации",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )
    }
}
