package com.example.responsi061

import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val nimnya: EditText = findViewById(R.id.nim)
        val namanya: EditText = findViewById(R.id.nama)
        val usernya: EditText = findViewById(R.id.userr)
        val passnya: EditText = findViewById(R.id.passs)

        reg_btn.setOnClickListener{
            intent = Intent(this, AkunActivity::class.java)
            intent.putExtra("nim",nimnya.text)
            intent.putExtra("nama",namanya.text)
            intent.putExtra("usr",usernya.text)
            intent.putExtra("pss",passnya.text)
            startActivity(intent)
        }
    }
}
