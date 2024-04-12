 package com.example.learnbuttonimage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnbuttonimage.ui.theme.LearnButtonImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnButtonImageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnImage()
                }
            }
        }
    }
}

//@Composable
//fun LearnButton(){
//    val context= LocalContext.current.applicationContext
//    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//        Button(onClick = {
//            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()},
//            shape = RoundedCornerShape(size = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
//        ) {
//            Text(text = "Login")
//        }
//    }
//}
 @Composable
 fun LearnImage(){
    Image(painter = painterResource(id = R.drawable.daco_4732196), contentDescription = "Jetpack Compose Logo")
 }