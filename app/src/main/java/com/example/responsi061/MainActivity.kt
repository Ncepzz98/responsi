package com.example.responsi061

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_login.setOnClickListener{
            val bundle = intent.extras
            val userBro = bundle?.get("usr1").toString()
            val namaBro = bundle?.get("nama1").toString()
            val nimBro = bundle?.get("nim1").toString()
            val passBro = bundle?.get("pss1").toString()

            val usernya: EditText = findViewById(R.id.user)
            val usernyaa = usernya.text.toString()
            val passnya: EditText = findViewById(R.id.pass)
            val passnyaa = passnya.text.toString()

            if(usernyaa == "acep" && passnyaa == "nur"){
                intent = Intent(this, home::class.java)
                intent.putExtra("nim2",namaBro)
                intent.putExtra("nama2",nimBro)
                intent.putExtra("usr2",userBro)
                intent.putExtra("pss2",passBro)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Masukkan username dan password dengan benar!!", Toast.LENGTH_SHORT).show()
            }
        }

        to_reg_form.setOnClickListener{
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
