package com.example.responsi061

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

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
