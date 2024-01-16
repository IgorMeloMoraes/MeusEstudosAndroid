package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BancoDados_23 extends AppCompatActivity {

    // BANCO DE DADOS
    // Criar uma JAVA CLASS para o HELPER

    TextView txtTelaBanco;
    EditText edtId, edtNome, edtTel;
    Button btnInsert, btnUpdate, btnDelete, btnShow;

    // Inicializa a DataBaseHelper
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banco_dados_23);

        txtTelaBanco = findViewById(R.id.txt_screen_dados);
        edtId = findViewById(R.id.edt_id_banco);
        edtNome = findViewById(R.id.edt_nome_banco);
        edtTel = findViewById(R.id.edt_tel_banco);
        btnInsert = findViewById(R.id.btn_insert_banco);
        btnUpdate = findViewById(R.id.btn_update_banco);
        btnDelete = findViewById(R.id.btn_delete_banco);
        btnShow = findViewById(R.id.btn_show_banco);

        // Retornar a instancia do database + seu contexto
        databaseHelper = new DatabaseHelper(this);

        // Inserir Dados
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Criamos primeiramente uma classe de insert dentro do helper
                // Agora Inserimos os dados no banco com a notação ponto que criamos no helper para passar a inserção de dads e passamos as variaveis que vamos criar
                databaseHelper.onInsert(edtNome.getText().toString(), edtTel.getText().toString());
            }
        });

        // Mostrar os dados inseridos na tela para o usuario acompanhar
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Cursor res = databaseHelper.showData();
              txtTelaBanco.setText("");
              while (res.moveToNext()){
                  String id = res.getString(0);
                  String nome = res.getString(1);
                  String tel = res.getString(2);
                  txtTelaBanco.setText(txtTelaBanco.getText().toString() + "\n" + id + " " + nome + " " + "+" + tel);
              }
            }
        });

        // Aualiza o item da lista quando informamos o id e passamos outro nome e telefone
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseHelper.UpdateData(edtId.getText().toString(), edtNome.getText().toString(), edtTel.getText().toString());
            }
        });

        // Deleta a patir do ID informado
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseHelper.deleteData(edtId.getText().toString());
            }
        });
    }
}