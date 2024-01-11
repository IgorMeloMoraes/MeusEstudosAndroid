package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ToastActivity_08 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_08);
    }

    public void gerarToast(View view){
        /* Toast - Um Toast é uma visualização que contém uma pequena mensagem rápida para o usuário Quando a visualização é mostrada ao usuário, aparece como uma visualização flutuante sobre o aplicativo.
        * A ideia é ser o mais discreto possível, ao mesmo tempo que mostra ao usuário as informações que você deseja que ele veja. Dois exemplos são o controle de volume e a breve mensagem informando que suas configurações foram salvas.
        * MakeText - Cria e gerencia tanto o texto quanto a duração dele
        * Contexto - Activity Atual
        * Text - É a string que deseja passar para o usuario visualizar
        * Tempo - Defini se vai ser longo ou curto
        * show - fecha a visualização
        * */
        Toast.makeText(ToastActivity_08.this, "Bem-Vindo aos Estudos", Toast.LENGTH_SHORT).show();
    }
}