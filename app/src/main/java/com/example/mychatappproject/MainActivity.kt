package com.example.mychatappproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mychatappproject.ui.theme.MyChatAppProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        setContentView(R.layout.activity_main)

        //Variable Declarations

        val textInput = findViewById<EditText>(R.id.txtGreetingIt)
        val resultText = findViewById<TextView>(R.id.txtGreetingIt)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Check button with if statements and different responses
        checkButton.setOnClickListener {
            val text = textInput.text.toString().uppercase()

            if (text == "Good morning"){
                resultText.text = "Good morning my good friend, how are you?"
            }
            else if (text == "Hello"){
                resultText.text = "Hi"
            }
            else if (text == "How are you?"){
                resultText.text = "I am good and you master?"
            }
            else if (text == "I am good"){
                resultText.text = "Wonderful Master!"
            }
            else if (text == "")





        }


        }
    }
}
