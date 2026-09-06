package com.example.a24012011037_mad_practical_2

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        display(msg = "onCreate method is called ")
    }

    override fun onStart() {
        display("onStart method is called")
        super.onStart()
    }

    override fun onPause() {
        display("onPause method is called")
        super.onPause()
    }

    override fun onResume() {
        display("onResume method is called")
        super.onResume()
    }

    override fun onStop() {
        display("onStop method is called")
        super.onStop()
    }

    override fun onRestart() {
        display("onRestart method is called")
        super.onRestart()
    }

    override fun onDestroy() {
        display("onDestroy method is called")
        super.onDestroy()
    }

    fun display(msg:String){
        // 1. LogCat Message
        Log.i(TAG, msg)
        //2. Toast Message
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        //3. Snackbar msg
        val rootView = findViewById<View>(R.id.main)
        if(rootView != null){
            Snackbar.make(rootView,msg, Snackbar.LENGTH_SHORT).show()
        }
    }

}