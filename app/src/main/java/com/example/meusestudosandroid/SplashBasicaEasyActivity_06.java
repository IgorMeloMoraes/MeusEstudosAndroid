package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashBasicaEasyActivity_06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_basica_easy_06);

        // Em java utilizamos o mesmo objeto HANDLER, instanciando ele e passando a notação postDelayed + os millisegunfos
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Forma mais pratica de declarar a intent chamado a proxima tela
                startActivity(new Intent(SplashBasicaEasyActivity_06.this, WebViewActivity_04.class));
                finish();
            }
        }, 5000);
    }
}