@file:OptIn(ExperimentalAnimationApi::class)

package com.qamar.composablewidgets

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.qamar.composablewidgets.ui.imagepicker.ImagePicker
import com.qamar.composablewidgets.ui.theme.ComposableWidgetsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableWidgetsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.gray)
                ) {
                  Column {
                      ImagePicker(){
                          startActivity(Intent(this@MainActivity, CarosselActivity::class.java))
                      }

                  }
                }
            }
        }
    }
}

