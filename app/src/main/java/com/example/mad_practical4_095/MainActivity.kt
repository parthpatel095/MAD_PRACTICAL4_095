package com.example.mad_practical4_095

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login : Button = findViewById(R.id.login)
        login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }

        val singup : Button = findViewById(R.id.Singup)
        singup.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
    }

}