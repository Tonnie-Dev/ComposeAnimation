package com.uxstate.composeanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.uxstate.composeanimation.ui.theme.ComposeAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}


@Composable
fun AnimationLayout() {

    var state by remember { mutableStateOf(false) }
    var animSpec by remember { mutableStateOf("snap") }


    val startColor = Color.Blue
    val endColor = Color.Green

    val backgroundColor by animateColorAsState(
        targetValue = if (state) endColor else startColor
    )
    animSpec = getAnimSpec(animSpec)



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor), verticalArrangement =
        Arrangement.Center
    ) {



    }


}


@Composable
fun AnimationButton(state: Boolean, onValueChanged:(Boolean, String)-> Unit){



}

fun getAnimSpec(spec: String): AnimationSpec<Color> {


    return when(spec){



       animationSpec.SPRING.value -> {



        }
    }
}



/*https://medium.com/frndapp/a-quick-guide-to-the-animate-asstate-api-in-jetpack-compose-animation-ab1ba3b6379f*/