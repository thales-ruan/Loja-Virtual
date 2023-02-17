package com.example.lojavirtual.formLogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lojavirtual.R
import com.example.lojavirtual.databinding.ActivityFormCadastroBinding
import com.example.lojavirtual.databinding.ActivityFormLoginBinding

class FormLoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityFormLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cliqueAqui.setOnClickListener {
            startActivity(Intent(applicationContext,ActivityFormCadastroBinding::class.java))
        }

    }


}