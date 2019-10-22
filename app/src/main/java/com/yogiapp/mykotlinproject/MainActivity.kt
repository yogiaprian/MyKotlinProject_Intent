package com.yogiapp.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_proses as btn_proses

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim = findViewById<EditText>(R.id.nim)
        val nama = findViewById<EditText>(R.id.nama)
        val nilai = findViewById<EditText>(R.id.nilai)
        val proses = findViewById<Button>(R.id.btn_proses)

        btn_proses.setOnClickListener(){
            val nim = nim.text.toString()
            val nama = nama.text.toString()
            var nilai = nilai.text.toString()

            val nil = nilai.toInt()

            if(nil >= 80 && nil<= 100){
            nilai = "A";
        }else if(nil >= 60)run {
            nilai = "B";
        }else if(nil >= 40)run {
            nilai = "C";
        }else if(nil >= 20)run {
            nilai = "D";
        }else {
            nilai = "E";
        }



            intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai", nilai)
            startActivity(intent)

        }

    }
}




