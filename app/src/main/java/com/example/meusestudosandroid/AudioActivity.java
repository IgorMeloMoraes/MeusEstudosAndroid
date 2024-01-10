package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AudioActivity extends AppCompatActivity {

    // Criar uma pasta RAW em res e adicionar os audios

    // Criar uma variavel para acessar o objeto MediaPlayer
    // MediaPlayer - pode ser usada para controlar a reprodução de arquivos e fluxos de áudio/vídeo.
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        // Aqui é onde acessamos o arquivo apontanto para o caminho tanto da activity de contexto, quanto para o caminho do arquivo que ficara armazenado na variavel que instanciamos globalmente
        mediaPlayer = MediaPlayer.create(AudioActivity.this, R.raw.audio_1);
    }

    // Metodo OnCLick no botão para iniciar o audio
    public void play(View view){
        // Start inicia o arquivo de audio
        mediaPlayer.start();
    }

    // Metodo de pause para para a reprodução ao clicar novamente no botão
    @Override
    protected void onPause() {
        super.onPause();

        // Release - Libera recursos associados a este objeto MediaPlayer.
        //Você deve chamar esse método quando a instância não for mais necessária.
        mediaPlayer.release();
    }
}