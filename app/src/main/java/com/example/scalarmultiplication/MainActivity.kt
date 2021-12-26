package com.example.scalarmultiplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sumButton = findViewById<Button>(R.id.button)
        val firstVectorText = findViewById<EditText>(R.id.firstVector)
        val secondVectorText = findViewById<EditText>(R.id.secondVector)
        val result = findViewById<TextView>(R.id.result)

        sumButton.setOnClickListener {

            val firstVector = firstVectorText.text.toString().split(",")
            val secondVector = secondVectorText.text.toString().split((","))

            if(firstVector.size != secondVector.size)
            {
                Toast.makeText(this, "Размерность должна быть одинаковой!", Toast.LENGTH_SHORT).show()
            }
            else{
                result.text = ScalarMultiplication(firstVector.map{i -> i.trim()}.map { i -> i.toInt() }
                    , secondVector.map{i -> i.trim()}.map { i -> i.toInt() })
                    .getScalarMultiplication().toString()
            }

        }
    }
}