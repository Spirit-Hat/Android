package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity, "onCreate()",

            Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this@MainActivity, "onPause()",

            Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this@MainActivity, "onStart()",

            Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this@MainActivity, "onRestart()",

            Toast.LENGTH_LONG).show()
    }
}