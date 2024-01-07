package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OnClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click);
    }

    // Metodo de click utilizando o OnClick (Metodo já defassado, mas ainda util)
    public void GeradorHelloWorld(View view) {

        // Aqui é definido um novo texto para o campo especifico ao clicar no botão
        TextView txtResultado = findViewById(R.id.txt_resultado_on_click);
        txtResultado.setText(R.string.txt_resultado_on_click);
    }
}