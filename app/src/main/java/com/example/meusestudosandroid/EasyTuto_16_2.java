package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// Implementar o OnClick para manter as classes de onClickLister dentro de uma classe separada
public class EasyTuto_16_2 extends AppCompatActivity implements View.OnClickListener {

    // Declarando Variaveis
    EditText edtNum1, edtNum2;
    TextView txtResultado;
    Button btnAdd, btnSub, btnMult, btnDiv;

    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_tuto_16_2);

        // Hooks
        edtNum1 = findViewById(R.id.edt_numero_1);
        edtNum2 = findViewById(R.id.edt_numero_2);
        txtResultado = findViewById(R.id.txt_resultado_easy);

        // Hooks Btn + Apontando caminho para o metodo OnClick
        btnAdd = findViewById(R.id.btn_add_easy);
        btnAdd.setOnClickListener(this);
        btnSub = findViewById(R.id.btn_sub_easy);
        btnSub.setOnClickListener(this);
        btnMult = findViewById(R.id.btn_mult_easy);
        btnMult.setOnClickListener(this);
        btnDiv = findViewById(R.id.btn_div_easy);
        btnDiv.setOnClickListener(this);


        /* Tipo de Declaração Básica

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quando Clicar pegar o valor que o usuario inseriu e passar ele para inteiro (parseInt)
                num1 = Integer.parseInt(edtNum1.getText().toString());
                num2 = Integer.parseInt(edtNum2.getText().toString());

                // Variavel de soma das variaveis recebidas
                int soma = num1 + num2;

                // Declarando resultado na tela
                txtResultado.setText("Resultado = " + soma);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Quando Clicar pegar o valor que o usuario inseriu e passar ele para inteiro (parseInt)
                num1 = Integer.parseInt(edtNum1.getText().toString());
                num2 = Integer.parseInt(edtNum2.getText().toString());

                // Variavel de subtracao das variaveis recebidas
                int sub = num1 - num2;

                // Declarando resultado na tela
                txtResultado.setText("Resultado = " + sub);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quando Clicar pegar o valor que o usuario inseriu e passar ele para inteiro (parseInt)
                num1 = Integer.parseInt(edtNum1.getText().toString());
                num2 = Integer.parseInt(edtNum2.getText().toString());

                // Variavel de multiplicaçaõ das variaveis recebidas
                int mult = num1 * num2;

                // Declarando resultado na tela
                txtResultado.setText("Resultado = " + mult);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Quando Clicar pegar o valor que o usuario inseriu e passar ele para inteiro (parseInt)
                num1 = Integer.parseInt(edtNum1.getText().toString());
                num2 = Integer.parseInt(edtNum2.getText().toString());

                // Variavel de divisao das variaveis recebidas
                int div = num1 / num2;

                // Declarando resultado na tela
                txtResultado.setText("Resultado = " + div);
            }
        });

  */

    }

    // Metodo de OnClick
    @Override
    public void onClick(View view) {
        // Declarando com Switch - Pode gerar um pequeno problema ao declarar com switch pois os hashs dos IDs dos objetos estão declarado como variaveis e nao como constantes, o que é requerido pelo compolador gerando assum um problema de execxuçaõ - Para resulver basta alterar para if/else cliando em switch + alt enter e alterando a estrytura
        /*
       / Condição de Casos - Ele pega a view de acordo com o id do click
        switch (view.getId()){
            // Caso o id X for clicado, fazer tal ação e break (parar)
            case R.id.btn_add_easy:
                txtResultado.setText("Resultado = " + (num1 + num2));
                break;

            case R.id.btn_sub_easy:
                txtResultado.setText("Resultado = " + (num1 - num2));
                break;

            case R.id.btn_mult_easy:
                txtResultado.setText("Resultado = " + (num1 * num2));
                break;

            case R.id.btn_div_easy:
                txtResultado.setText("Resultado = " + (num1 / num2));
                break;

            default:
                break;
        }


       */


        // Validação das variaveis com try/catch
        try {
            // Variaveis
            num1 = Integer.parseInt(edtNum1.getText().toString());
            num2 = Integer.parseInt(edtNum2.getText().toString());
        }
        catch (Exception e){
            Toast.makeText(this, "POR FAVOR INSIRA APENAS NUMEROS", Toast.LENGTH_SHORT).show();
        }


        // Condição de Casos - Ele pega a view de acordo com o id do click
        int id = view.getId();// Caso o id X for clicado, fazer tal ação e break (parar)
        if (id == R.id.btn_add_easy) {
            txtResultado.setText("Resultado = " + (num1 + num2));
        } else if (id == R.id.btn_sub_easy) {
            txtResultado.setText("Resultado = " + (num1 - num2));
        } else if (id == R.id.btn_mult_easy) {
            txtResultado.setText("Resultado = " + (num1 * num2));
        } else if (id == R.id.btn_div_easy) {
            txtResultado.setText("Resultado = " + (num1 / num2));
        }
    }
}