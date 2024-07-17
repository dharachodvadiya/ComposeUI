package com.indie.apps.composeui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.indie.apps.basicanimation.BasicAnimationMainActivity
import com.indie.apps.basiclayout.BasicLayoutMainActivity
import com.indie.apps.composeui.ui.theme.ComposeUITheme
import com.indie.apps.jetsurvey.JetSurveyMainActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUITheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Box(
                        modifier = Modifier.padding(innerPadding).fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column{
                            SimpleButton("Basic Layout"){
                                val intent = Intent(this@MainActivity, BasicLayoutMainActivity::class.java)
                                startActivity(intent)
                            }

                            SimpleButton("Basic Animation"){
                                val intent = Intent(this@MainActivity, BasicAnimationMainActivity::class.java)
                                startActivity(intent)
                            }

                            SimpleButton("Jet Survey"){
                                val intent = Intent(this@MainActivity, JetSurveyMainActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    }



                }
            }
        }
    }
}

@Composable
internal fun SimpleButton(text: String, onClick : () -> Unit)
{
    Button(
        onClick = { onClick() },
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = text)
    }
}
