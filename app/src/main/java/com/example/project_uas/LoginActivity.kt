package com.example.project_uas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val halamanHome = findViewById<Button>(R.id.loginButton)
        val username =  findViewById<EditText>(R.id.usernameEditText)
        val password = findViewById<EditText>(R.id.passwordEditText)

        halamanHome.setOnClickListener{
            val enteredUsername = username.text.toString()
            val enteredPassword = password.text.toString()
            if (isValidCredentials(enteredUsername, enteredPassword)) {
                showToast("Login successful!")
                HomeHalaman()
            } else {
                showToast("Invalid username dan Password. Please try again.")
            }
        }

    }
    private fun isValidCredentials(username: String, password: String): Boolean {
        val expectedUsername = "Rumawan"
        val expectedPassword = "password"
        return username == expectedUsername && password == expectedPassword
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun HomeHalaman(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}