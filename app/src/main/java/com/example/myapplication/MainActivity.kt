package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val lenyomott_gomb = findViewById(R.id.gombom) as Button
        var i=0
        // set on-click listener
        lenyomott_gomb.setOnClickListener {
            i = i + 1 //-- Számolja a kattintásokat
            Toast.makeText(this@MainActivity, i.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}