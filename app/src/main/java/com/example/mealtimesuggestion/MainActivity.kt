package com.example.mealtimesuggestion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //This is where i have declared all of my variables
        //Author : Zahra Bulbulia
        //URL : https://github.com/zb662000/assignmen
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val buttonSuggest = findViewById<Button>(R.id.buttonSuggest)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val textViewSuggestion = findViewById<TextView>(R.id.textViewSuggestion)
//this is where i have started doing the coding for my meal time app as well as my use of a when statement
        //Author : Zahra Bulbulia
        //URL : https://github.com/zb662000/assignmen
        buttonSuggest.setOnClickListener {
        val timeOfDay = editTextTime.text.toString().trim()
        val suggestion = when (timeOfDay.lowercase()) {
            "morning" -> "Egg's and Bacon"
            "mid-morning" -> "Protein Bar"
            "afternoon" -> "Toasted Sandwich"
            "mid-afternoon" -> "Peanut Brittle"
            "dinner" -> "Steak Eggs and Chips"
            "dessert" -> "Cheese Cake"
        else -> "Please enter a valid time of day."
        }
        textViewSuggestion.text = suggestion




    }// this is where i have added in my reset button
        // this specific button is used to reset the edit text view and the edit text box
        buttonReset.setOnClickListener {
            editTextTime.text.clear()
            textViewSuggestion.text = " "
        }
}}