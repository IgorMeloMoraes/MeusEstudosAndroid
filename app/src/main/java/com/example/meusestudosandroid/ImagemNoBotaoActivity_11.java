package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ImagemNoBotaoActivity_11 extends AppCompatActivity {

    // Globais
    int contador;
    TextView txtContador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagem_no_botao_11);

        // Hooks
        txtContador = findViewById(R.id.txt_contador_img_btn);
    }

    public void somarImgBtn(View view){
        // Contador com acrescimo +=
        contador += 1;
        txtContador.setText("Contador = " + contador);
    }

    public void subtrairImgBtn(View view){
        // Contador com decrescimo +=
        contador -= 1;
        txtContador.setText("Contador = " + contador);
    }
}