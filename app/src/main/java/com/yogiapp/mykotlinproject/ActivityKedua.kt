package com.yogiapp.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.*

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = getIntent();
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")

        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)

        //setText
        resultTv.text = "Nim : "+nim+"\nNama : "+nama+"\nNilai : "+nilai



    }
}
