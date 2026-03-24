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
        setContentView(R.layout.activity_main)

        //Variable Declarations

        val textInput = findViewById<EditText>(R.id.txtGreetingIt)
        val resultText = findViewById<TextView>(R.id.txtRespond)
        val checkButton = findViewById<Button>(R.id.btnCheck)
        val resetButton = findViewById<Button>(R.id.btnReset)

        //Check button with if statements and different responses
        checkButton.setOnClickListener {
            val text = textInput.text.toString().uppercase()

            if (text == "Good morning"){
                resultText.text = "Good morning my good friend, how are you"
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

            else if (text == "Good Afternoon"){
                resultText.text = "Good Afternoon Master, have you eaten lunch yet?"
            }

            else if (text == "I have eaten lunch"){
                resultText.text = "That is good to hear Master."
            }

            else if (text == "I am hungry"){
                resultText.text = "I recommend you make egg and bacon rolls with a salad on the side"
            }

            else if (text == "It is around midday now"){
                resultText.text = "You should be getting ready for your afternoon workout"
            }

            else if (text == "I am up early this morning"){
                resultText.text = "Go back to sleep Master!"
            }

            else if (text == "Good evening"){
                resultText.text = "Good evening Master, did you have an eventful day?"
            }

            else if (text == "Yes I did"){
                resultText.text = "That is great Master!"
            }

            else if (text == "No I did not"){
                resultText.text = "I am sorry Master :("
            }

            else if (text == "You are amazing"){
                resultText.text = "Thank you soo much Master!"
            }

            else if (text == "Good night"){
                resultText.text = "Good night Master, you must sleep well"
            }

            else {
                resultText.text = "Not accepted Input"
            }

            resultText.text = text




        }
        //Reset Button
        resetButton.setOnClickListener {
            textInput.text.clear()
            resultText.text = "Response shown here"
        }


    }
}