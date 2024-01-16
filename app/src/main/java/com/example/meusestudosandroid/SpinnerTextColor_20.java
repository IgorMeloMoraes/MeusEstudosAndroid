package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerTextColor_20 extends AppCompatActivity {

    // Declaração da Varaivel
    Spinner spinnerColor;
    TextView txtSpiner;

    // Array de Cores
    String cores[] = new String[]{"Azul", "Verde", "Vermelho", "Roxo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_text_color_20);

        // Retorno do id na variavel
        spinnerColor = findViewById(R.id.spinner);
        txtSpiner = findViewById(R.id.txt_spinner);

        // Declaração do Adapter de Arrays da variavel cores
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, cores);

        // Setando o adapter na variavel de spiner
        spinnerColor.setAdapter(arrayAdapter);

        // Setando eventos de clicks a partir do item selecionado na spiner
        spinnerColor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Definindo um evento de cores a partir de um spiner selecionado, pegamos a posição dele INT I, e declaramos uma condicional

                // Se a posição for igual a 0 (a primeira posição do spiner) - set a cor que é definida como primeira
                if (i == 0){
                    // Alterando a cor do texto
                    txtSpiner.setTextColor(Color.BLUE);
                }

                if (i == 1){
                    // Alterando a cor do texto
                    txtSpiner.setTextColor(Color.GREEN);
                }

                if (i == 2){
                    // Alterando a cor do texto
                    txtSpiner.setTextColor(Color.RED);
                }

                if (i == 3){
                    // Alterando a cor do texto - Podemo usar as cores que add nos nossos recursos - Utilizando GetResources
                    txtSpiner.setTextColor(getResources().getColor(R.color.bg_roxo));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}