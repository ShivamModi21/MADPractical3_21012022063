package com.example.madpractical3_21012022063

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.madpractical3_21012022063.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.bottomNavigationView.selectedItemId = R.id.bottom_reg_registration
        binding.bottomNavigationView.setOnItemSelectedListener{it1->
            when(it1.itemId)
            {
                R.id.bottom_reg_registration->
                {
                    Intent(this,LoginActivity::class.java).also {startActivity(it)}
                }
            }
            return@setOnItemSelectedListener true
        }

        binding.tvLogin.setOnClickListener {
            Intent(this,LoginActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}
