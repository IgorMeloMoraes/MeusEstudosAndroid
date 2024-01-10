package com.example.meusestudosandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashBasicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_basica)

        // Aqui é utilizada o objeto Handler que manipula o tempo de tela em millisegundos (5000 = 5 segundos)
        // Apos isso, chamamos a proxima tela utilizando uma intent e finalizando a tela atual
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },5000)
    }
}