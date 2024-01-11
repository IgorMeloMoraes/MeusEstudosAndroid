package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CalculadoraDoAmor_15 extends AppCompatActivity {

    // Variaveis Globais
    EditText edtHomem, edtMulher;
    TextView txtResultado;
    Button btnCalcular;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_do_amor_15);
    }

    // Click de Ação
    public void calculoDoAmor(View view){
        // Hooks
        edtHomem = findViewById(R.id.edt_homem_love_calculator);
        edtMulher = findViewById(R.id.edt_mulher_love_calculator);
        txtResultado = findViewById(R.id.txt_porcentagem_love_calculator);

        // Armazenar Valores Digitados - Criamos uma variavel e recebemos as variaveis dos ids com getText (Pega o Texto), toString (Tranforma em uma string) e armazena na variavel
        String homem = edtHomem.getText().toString();
        String mulher = edtMulher.getText().toString();

        // Calculo dos nomes
        String soma = homem + mulher;
        String somaCaracteres= soma.toLowerCase();

        // Transforma nossa string em um codigo hash inteiro
        int valorCaracteres = somaCaracteres.hashCode();

        // Random - Aleatorio com a variavel inteira
        Random random = new Random(valorCaracteres);
        resultado = (random.nextInt(100) + 1) + "%";

        // Validação dos campos - Vazio
        if (mulher.equals("") || homem.equals("")){
            Toast.makeText(this, "Preencha os campos nome", Toast.LENGTH_SHORT).show();
        }

        // Setar valor na tela
        txtResultado.setText(resultado);

    }
}