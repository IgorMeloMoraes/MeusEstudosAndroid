package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroSreen_21 extends AppCompatActivity {

    TextView txtTitulo;
    EditText edtNome, edtTel, edtEmail, edtSenha, edtSenhaRetry;
    Button btnEnviar;

    // Define o Tipo de Armazenamento dos dados - Se Interno ou Banco de Dados
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editorPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_sreen_21);

        txtTitulo = findViewById(R.id.txt_titulo_registro);
        edtNome = findViewById(R.id.edt_nome);
        edtTel = findViewById(R.id.edt_telefone);
        edtEmail = findViewById(R.id.edt_email);
        edtSenha = findViewById(R.id.edt_senha);
        edtSenhaRetry = findViewById(R.id.edt_senha_retry);
        btnEnviar = findViewById(R.id.btn_enviar);

        // Pega nossas preferencias de armazenamento e define um nome e um modo de salvamento para ela
        sharedPreferences = getSharedPreferences("Dados Usuario", Context.MODE_PRIVATE);
        editorPreferences = sharedPreferences.edit();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pega o valor digitado pelo usuario no campo EditText e armazena em uma variavel - Armazenar os valores em seus respectivos tipos de dados
                String nome = edtNome.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                String senha = edtSenha.getText().toString().trim();
                String senhaRetry = edtSenhaRetry.getText().toString().trim();
                int telefone = Integer.parseInt(edtTel.getText().toString());


                // Validação de campo utilizando setError para retornar um erro para o usuario
                // Nesse caso a validação é para o campo vazio - seta o erro e define o foco para o usuario
                if (nome.isEmpty()){
                    edtNome.setError("Campo nome não foi preenchido");
                    edtNome.requestFocus();
                    return;
                }

                if (email.isEmpty()){
                    edtEmail.setError("Campo email não foi preenchido");
                    edtEmail.requestFocus();
                    return;
                }

                if (senha.isEmpty()){
                    edtSenha.setError("Campo senha não foi preenchido");
                    edtSenha.requestFocus();
                    return;
                }

                // Verifica se o campo senha é menor que 6 digitos
                if (senha.length() < 6){
                    edtSenha.setError("Campo senha precisa ter mais que 6 digitos");
                    edtSenha.requestFocus();
                    return;
                }

                // Verifica se a senha é igual a primeira digitada
                if (!senhaRetry.equals(senha)){
                    edtSenhaRetry.setError("Senha é diferente da digitada");
                    edtSenhaRetry.requestFocus();
                    return;
                }
                
                // Se todos os campos estiverem ok, é exibido uma msg para o usuario
                Toast.makeText(RegistroSreen_21.this, "Criação de Registro Realizado com Sucesso", Toast.LENGTH_SHORT).show();

                // Salvando os Dados com PutExtra - Passamos uma chave e a nossa varaivel
                // Esses dados vao ficar salvos no cache do prorpio telefone do usurio
                editorPreferences.putString("KeyNome", nome);
                editorPreferences.putInt("KeyTelefone", telefone);
                editorPreferences.putString("KeyEmail", email);
                editorPreferences.putString("KeySenha", senhaRetry);
                editorPreferences.apply();
            }
        });
    }
}