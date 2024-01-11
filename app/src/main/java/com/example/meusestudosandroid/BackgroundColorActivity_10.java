package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

public class BackgroundColorActivity_10 extends AppCompatActivity {

    // Global
    View view;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_color_10);

        // Acessa a janela da activity para alterar o plano de fundo
        // getWindow - Recupera a janela atual da atividade.
        // getDecorView - Recupere a visualização de decoração da janela de nível superior
        view = this.getWindow().getDecorView();
        view.setBackgroundColor(R.color.bg_verde_escuro);
    }

    @SuppressLint("ResourceAsColor")
    public void BgVerde(View view){
        // Defini a cor de fundo da nossa janela
        view.setBackgroundColor(R.color.bg_verde_escuro);
    }

    @SuppressLint("ResourceAsColor")
    public void BgVermelho(View view){
        // Defini a cor de fundo da nossa janela
        view.setBackgroundColor(R.color.bg_vermelho_indian);
    }

    @SuppressLint("ResourceAsColor")
    public void BgRoxo(View view){
        // Defini a cor de fundo da nossa janela
        view.setBackgroundColor(R.color.bg_roxo);
    }
}