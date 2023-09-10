package com.simpletask.sorteioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonGenerate = findViewById<Button>(R.id.buttonGenerate)
        val result = findViewById<TextView>(R.id.textResult)

        buttonGenerate.setOnClickListener(View.OnClickListener {
            val randomNumber = Random().nextInt(10) + 1
            result.text = "O Número Sorteado foi: $randomNumber"
            result.visibility = View.VISIBLE
        })
    }
}
