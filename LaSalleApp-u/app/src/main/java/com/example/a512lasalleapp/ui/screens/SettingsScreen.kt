package com.example.a512lasalleapp.ui.screens
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.components.Widget
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Nightlight
import com.example.a512lasalleapp.ui.utils.Password

@Composable
fun SettingsScreen(innerPadding : PaddingValues, navController: NavController){
    ScreenTemplate(innerPadding = innerPadding, header = {
        Row(
            modifier = Modifier.fillMaxSize().padding(20.dp)
        ){
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.portrait_photo)
                    .data(R.drawable.portrait_photo)
                    .build(),
                contentDescription = "Canelo",
                modifier = Modifier.size(100.dp).clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop
            )
            Column (
                modifier = Modifier.padding(start = 15.dp)
            ){
                Text(text = "Uriel Mendoza Rodríguez",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = MaterialTheme.typography.titleLarge.fontWeight,
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 5.dp))

                Text(text = "Fecha de nacimiento: 01 Julio 2004",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                    color = Color.White)

                Text(text = "umr76644@lasallebajio.edu.mx",
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    fontWeight = MaterialTheme.typography.bodySmall.fontWeight,
                    color = Color.White)
            }
        }

    }, body = {
        Row (
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly
        ){
            Widget(Password, "Cambiar contraseña", onClick = {navController.navigate("change-password")})
            Widget(Nightlight, "Cambiar tema", onClick = {navController.navigate("change-theme")})
        }

    })
}

@Preview
@Composable
fun SettingsScreenPreview(){
    _512LaSalleAppTheme{
        SettingsScreen(innerPadding = PaddingValues(), navController = NavController(LocalContext.current))

    }

}