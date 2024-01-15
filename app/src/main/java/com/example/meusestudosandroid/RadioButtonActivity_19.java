package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonActivity_19 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    // Implementa o Radio para usar seu metodo

    RadioGroup radioGroup;
    RadioButton rb30, rb50, rb70;
    TextView txtTelaRadio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_19);

        radioGroup = findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(this);
        rb30 = findViewById(R.id.rb_tamanho_30);
        rb50 = findViewById(R.id.rb_tamanho_50);
        rb70 = findViewById(R.id.rb_tamanho_70);
        txtTelaRadio = findViewById(R.id.txt_tela_radio);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        // O Radio Button, só pode ser escolhido apneas escolha

        // Faz a verificação de cada botão se está marcado e se sim, definir o tamanho do texto de acoco com a marcação
        if (rb30.isChecked()){
            txtTelaRadio.setTextSize(30);
        }
        if (rb50.isChecked()){
            txtTelaRadio.setTextSize(50);
        }
        if (rb70.isChecked()){
            txtTelaRadio.setTextSize(70);
        }

    }
}