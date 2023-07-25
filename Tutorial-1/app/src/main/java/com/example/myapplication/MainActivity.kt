package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.button)
        val myText:TextView = findViewById(R.id.textView)
        myButton.setOnClickListener {
            // Button click action here
            counter++
            myText.text = counter.toString()
            // Place the code you want to execute when the button is clicked.
        }


    }
}