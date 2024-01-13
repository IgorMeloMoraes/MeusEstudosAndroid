package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity_17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_17);

        // A loading Activity é muito parecido com a splash screen, porem pode ser utilizada para outros carregamentos e em outros locais
        // Para isso, utilizamos a mesma estrutura da splashScreen, porem adicionamos um botão de loading no xml, esse loading carrega

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LoadingActivity_17.this, MainActivity.class));
                finish();
            }
        },3000);
    }
}