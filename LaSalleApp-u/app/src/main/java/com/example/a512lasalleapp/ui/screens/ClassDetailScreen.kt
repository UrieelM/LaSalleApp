package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a512lasalleapp.ui.components.ClassWidget
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ClassDetailScreen(innerPadding : PaddingValues){
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column (
            modifier = Modifier.padding(30.dp)
        ){
            Text(text = "Nombre de la materia",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = MaterialTheme.typography.titleLarge.fontWeight,
                color = Color.White,
                modifier = Modifier.padding(bottom = 5.dp))
        }

    }, body = {
        LazyColumn (
            modifier = Modifier.height(320.dp).padding(10.dp)
        ){
            item(){
                ClassWidget(text = "1er Parcial", grade = "8.7", onClick = {})
                ClassWidget(text = "2do Parcial", grade = "8.7", onClick = {})
                ClassWidget(text = "3er Parcial", grade = "8.7", onClick = {})
            }
        }

    })
}

@Preview
@Composable
fun ClassDetailScreenPreview(){
    _512LaSalleAppTheme{
        ClassDetailScreen(
            innerPadding = PaddingValues())
    }
}