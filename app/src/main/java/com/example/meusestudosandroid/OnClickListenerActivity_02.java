package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnClickListenerActivity_02 extends AppCompatActivity {

    // Variaveis Globais
    TextView txtAppName, txtClick;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click_listener_02);

        // Hooks - Retorno das variaveis dentro de um metodo
        txtClick = findViewById(R.id.txt_click_after_on_click_listener);
        btnClick = findViewById(R.id.btn_click_on_click_listener);
        txtAppName = findViewById(R.id.txt_titulo_on_click_listener);

        // Notação Ponto SetOnClickListener que gera uma ação quando o click na variavel é acionado
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAppName.setText(R.string.txt_new_title_on_click_listener);
                txtClick.setText(R.string.txt_click_before_on_click_listener);
                txtClick.setTextSize(20);
            }
        });
    }
}