package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickme = findViewById<Button>(R.id.button1)

        clickme.setOnClickListener{

            Toast.makeText(this,"Avramchuk Vlad",Toast.LENGTH_SHORT).show()
        }
    }
}