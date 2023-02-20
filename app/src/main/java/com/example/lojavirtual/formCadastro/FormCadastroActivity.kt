package com.example.lojavirtual.formCadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lojavirtual.R
import com.example.lojavirtual.databinding.ActivityFormCadastroBinding
import com.example.lojavirtual.databinding.ActivityFormLoginBinding

class FormCadastroActivity : AppCompatActivity() {

    lateinit var binding: ActivityFormCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFormCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_form_cadastro)
    }
}