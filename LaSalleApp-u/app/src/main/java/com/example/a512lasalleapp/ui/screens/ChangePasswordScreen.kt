package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ChangePasswordScreen(innerPadding : PaddingValues){
    Text(text = "Cambiar Contraseña", modifier = Modifier.fillMaxSize().padding(innerPadding))
}

@Preview
@Composable
fun ChangePasswordScreenPreview(){
    _512LaSalleAppTheme{
        ChangeThemeScreen(innerPadding = PaddingValues())

    }

}