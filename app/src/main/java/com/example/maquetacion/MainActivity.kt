package com.example.maquetacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductoPreview() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {

        Image(
            painter = painterResource(R.drawable.compu),
            contentDescription = "Imagen del producto",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Computadora basica ",
            fontSize = 22.sp
        )


        Text(
            text = "$199.99",
            fontSize = 28.sp,
            color = Color(0xFF00C853)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Esta computadora cuenta con lo necesario para tu cumplimiento curricular universitarios, 16GB de RAM, 1Tb de almacenamiento una Intel i5 de 10ma generacion y una tarjeta de video Radion, optimo para cualquier tarea a nivel universitaria."
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color(0xFF7E57C2)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Editar", color = Color.White)
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Eliminar", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, nd intuitive Kotlin APIS.",        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "In this tutorial, you build a simple Ul component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the Ul's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )
    }
}