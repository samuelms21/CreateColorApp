package com.example.createcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimAndName = findViewById<TextView>(R.id.nim_and_name)
        val studentInfo = arrayOf("NIM: 202000202", "Nama: Samuel Marcellino Setiawan")

        nimAndName.text = studentInfo.reduce{acc, item -> acc + "\n" + item}

        val rgbRed = findViewById<EditText>(R.id.RedValue).text
        val rgbGreen = findViewById<EditText>(R.id.GreenValue).text
        val rgbBlue = findViewById<EditText>(R.id.BlueValue).text

        val getColorBtn = findViewById<Button>(R.id.get_color_rgb)

        val colorRgbResult = findViewById<TextView>(R.id.color_text_view)

        getColorBtn.setOnClickListener {
            val color = Color.parseColor("#$rgbRed$rgbGreen$rgbBlue")
            colorRgbResult.setBackgroundColor(color)
        }
    }
}