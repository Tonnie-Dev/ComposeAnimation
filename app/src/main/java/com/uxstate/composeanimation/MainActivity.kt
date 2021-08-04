package com.uxstate.composeanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
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
        targetValue = if (state) endColor else startColor)
    animSpec = getAnimSpec(animSpec)



    Column(){}


}

fun getAnimSpec(animSpec: String): AnimationSpec<Color> {

}



