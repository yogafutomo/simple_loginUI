@file:Suppress("DEPRECATION")

package com.example.nativecontent

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please insert your email and password", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            if (email == "futomo@gmail.com" && password == "password") {
                val progressDialog = ProgressDialog(
                    this,
                    R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}




