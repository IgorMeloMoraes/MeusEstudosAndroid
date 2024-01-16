package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen_22 extends AppCompatActivity {

    // READ PREFERENCES - Lendo dados de Preferencia salvos no aparelho celular

    TextView txtTelLogin, txtEmailLogin;
    EditText edtNomeLogin, edtSenhaLogin;
    Button btnLogar;

    // Add o SharedPrefereces igual a tela de registro
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_2222);

        txtTelLogin = findViewById(R.id.txt_tel_login);
        txtEmailLogin = findViewById(R.id.txt_email_login);
        edtNomeLogin = findViewById(R.id.edt_nome_login);
        edtSenhaLogin = findViewById(R.id.edt_senha_login);
        btnLogar = findViewById(R.id.btn_logar);

        // Preferences
        sharedPreferences = getSharedPreferences("Dados Usuario", Context.MODE_PRIVATE);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Rececebendo e armazenando dados informados pelo usuario nos campos
                String nomeLogin = edtNomeLogin.getText() .toString().trim();
                String senhaLogin = edtSenhaLogin.getText() .toString().trim();

                // Leitura das preferencias - A ideia é ler os dados salvos na tela de registro para o usaurio fazer seu login
                // Criar variaveis que possam receber os valores das chaves dos dados salvos na tela de registro
                String nomeRegistrado = sharedPreferences.getString("keyNome", "0");
                String senhaRegistrado = sharedPreferences.getString("keySenha", "0");
                String emailRegistrado = sharedPreferences.getString("keyemail", "0");
                int telefoneRegistrado = sharedPreferences.getInt("keyTelefone",  0);

                // Valida se os dados informados na tela de login são os mesmo dados que foram salvos na tela de registro
                if (nomeLogin.equals(nomeRegistrado)){
                    if (senhaLogin.equals(senhaRegistrado)){
                        // Acesos Permitido pois dados sao os mesmo - Nesse caso, so para demonstração, vamos exibir o telefone e o email caso todos os dados estejam corretos
                        txtEmailLogin.setText(emailRegistrado);
                        txtTelLogin.setText("" + telefoneRegistrado);

                        // Esconde os campos usando GONE para melhor visualização da tela
                        edtSenhaLogin.setVisibility(View.GONE);
                        edtNomeLogin.setVisibility(View.GONE);
                        btnLogar.setVisibility(View.GONE);
                    }
                    else {
                        // caso contratrio informe um erro para o usuario informando que os dados estão errados
                        edtSenhaLogin.setError("Senha inconsistente com o Registro");
                    }
                }
                else {
                    // Caso o nome informado for inconsistente, passar o erro para o usuario
                    edtNomeLogin.setError("Nome inconsistente com o Registro");
                }
            }
        });
    }
}