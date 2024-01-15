package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class CheckBoxActivity_18 extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener  {

    // CheckBox com o implements

    TextView txtTela;
    CheckBox ckNegrito, ckItalico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_18);

        txtTela = findViewById(R.id.txt_check_box);

        // CheckBox Hooks
        ckNegrito = findViewById(R.id.check_box_menu);
        ckNegrito.setOnCheckedChangeListener(this);
        ckItalico = findViewById(R.id.check_box_layout);
        ckItalico.setOnCheckedChangeListener(this);
    }


    // Metodo para o checkBox
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        // Primeiro Verificamos se o botão está marcado
        if (ckItalico.isChecked()){
            // Verifica se o outro chcek tbm esta marcado
            if (ckNegrito.isChecked()){
                // Caso for verdadeiro, alteramos nosso texto para BOLD e ITALICO - Verifica se os dois estão marcados
                txtTela.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
            }
            else {
                // Caso o Negrito não esteja marcado, tranforma o texto apenas em Italico
                txtTela.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            }
        }
        else {
            // Caso o italico nao esteja marcado, verificar se o negrito esta
            if (ckNegrito.isChecked()){
                // Caso esteja marcado somente o negrito, transforme o texto em negrito apenas
                txtTela.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            }
            else {
                // Caso nenhum esteja marcado, mantenha o te4xto como normal
                txtTela.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
            }
        }
    }
}
