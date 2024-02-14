package com.example.afiqamjadbinkhairir_assignment3problem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate Was Called")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart Was Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart Was Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume Was Called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause Was Called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop Was Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy Was Called")
    }
}