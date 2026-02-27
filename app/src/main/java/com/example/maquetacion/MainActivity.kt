package com.example.maquetacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PerfilPreview()
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

        Text(text = "Computadora básica", fontSize = 22.sp)

        Text(
            text = "$199.99",
            fontSize = 28.sp,
            color = Color(0xFF00C853)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Esta computadora cuenta con lo necesario para tu cumplimiento curricular universitario, 16GB de RAM, 1Tb de almacenamiento, Intel i5 de 10ma generación y tarjeta de video Radeon."
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

        Image(
            painter = painterResource(R.drawable.tutorial),
            contentDescription = "Jetpack Compose",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Column(modifier = Modifier.padding(16.dp)) {

            Text(text = "Jetpack Compose tutorial", fontSize = 22.sp)

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Jetpack Compose es un toolkit moderno para construir interfaces Android.",
                textAlign = TextAlign.Justify
            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PerfilPreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.juanperez),
            contentDescription = "Foto de perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Juan Pérez", fontSize = 22.sp)

        Text(
            text = "Desarrollador Android apasionado por la tecnología y el diseño.",
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("150", fontSize = 18.sp)
                Text("Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("2.3K", fontSize = 18.sp)
                Text("Seguidores")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("980", fontSize = 18.sp)
                Text("Likes")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color(0xFF7E57C2)),
                contentAlignment = Alignment.Center
            ) {
                Text("Seguir", color = Color.White)
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text("Mensaje")
            }
        }


        Spacer(modifier = Modifier.height(24.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {

            Text(text = "Intereses", fontSize = 20.sp)

            Spacer(modifier = Modifier.height(12.dp))

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ChipSimple("Ciclismo")
                    ChipSimple("Programación")
                    ChipSimple("UI/UX")
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    ChipSimple("Música")
                    ChipSimple("Viajes")
                    ChipSimple("Gaming")
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Proyectos Recientes", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.contactanos_ima),
            contentDescription = "Descripción",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),

            )

    }
}
@Composable
fun ChipSimple(text: String) {

    Box(
        modifier = Modifier
            .background(Color(0xFFE0E0E0), shape = RoundedCornerShape(20.dp))
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(text = text)
    }
}