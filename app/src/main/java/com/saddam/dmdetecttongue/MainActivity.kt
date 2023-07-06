package com.saddam.dmdetecttongue

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnScan : ImageButton =findViewById(R.id.id_scan)
        btnScan.setOnClickListener()
        {
            val intent = Intent(this, scan::class.java)
            startActivity(intent)
        }
        val btnAbout : Button =findViewById(R.id.btn_about)
        btnAbout.setOnClickListener()
        {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
        val btnTutorial : Button =findViewById(R.id.btn_tutorial)
        btnTutorial.setOnClickListener()
        {
            val intent = Intent(this, Tutorial::class.java)
            startActivity(intent)
        }
    }
}
