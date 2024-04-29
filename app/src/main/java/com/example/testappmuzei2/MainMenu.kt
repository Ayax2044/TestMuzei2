package com.example.testappmuzei2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun Registr_Click(view: View) {
        val intent: Intent = Intent(this, Registracia::class.java)
        startActivity(intent)
        finish()
    }

    fun Cencel(view: View) {
        finish()
    }
}