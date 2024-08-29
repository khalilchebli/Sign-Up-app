package com.signupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    lateinit var usernameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var registerBtn: Button
    lateinit var repassInput:EditText
    lateinit var emailInput:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput=findViewById(R.id.username_input)
        passwordInput=findViewById(R.id.password_input)
        emailInput=findViewById(R.id.email_input)
        registerBtn=findViewById(R.id.signup_btn)
        repassInput=findViewById(R.id.repassword_input)

        registerBtn.setOnClickListener{
            val username=usernameInput.text.toString()
            val password=passwordInput.text.toString()
            Log.i("test Credentials","Username:$username and Password :$password")
        }




    }
}