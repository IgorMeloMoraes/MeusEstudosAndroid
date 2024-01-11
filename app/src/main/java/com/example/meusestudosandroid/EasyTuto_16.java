package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EasyTuto_16 extends AppCompatActivity {

    // Variaveis Globais
    TextView txtQtdRupias;
    Button btnAdd, btnSub;
    int dinDin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_tuto_16);

        // Hooks
        txtQtdRupias = findViewById(R.id.txt_qtd_rupias);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        dinDin = 0;

        // Clicks Listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Incremento de rupias - Add
                dinDin += 1;
                txtQtdRupias.setText("Você tem" + dinDin + "Rupias");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Decremento de rupias - Sub
                dinDin -= 1;
                txtQtdRupias.setText("Você tem" + dinDin + "Rupias");
            }
        });

    }
}