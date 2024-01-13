package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity_17 extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_17);

        // Audio
        mediaPlayer = MediaPlayer.create(this, R.raw.audio_1);
        mediaPlayer.start();

        // A loading Activity é muito parecido com a splash screen, porem pode ser utilizada para outros carregamentos e em outros locais
        // Para isso, utilizamos a mesma estrutura da splashScreen, porem adicionamos um botão de loading no xml, esse loading carrega

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LoadingActivity_17.this, MainActivity.class));

                // Podemos adicionar um audio para uma tela especifica e para-lo quando ir para uma outro tela
                // Pode ser um audio de introdução ou de carregamento de tela
                mediaPlayer.stop();
                finish();
            }
        },3000);
    }
}