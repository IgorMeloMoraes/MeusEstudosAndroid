package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity_13 extends AppCompatActivity {

    // Variavel e intancia da String para receber um array de itens
    String itens [] = new String[] {"Apple", "Sansung", "Xiomi", "Motorola", "Nokia"};
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_13);

        // Hooks
        lista = findViewById(R.id.list_view);

        // Chamar o Array de Adapter e passar a String de arrays
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
        lista.setAdapter(adapter);

        // Setar Click na Lista retornando o nome de acordo com sua posição
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Tost para informar qual item esta sendo clicado na tela do usuario passando a posição [int I - Position]
               // Toast.makeText(ListViewActivity_13.this, itens[i], Toast.LENGTH_SHORT).show();

                // Para abrir outros menus a partir da lista criada, clidando no menu X, abre a activity X, clicando na Y, abre a activity Y
                // Crie uma classe e defina ela como nula, para depois ela receber os menus
                Class MeusMenusAcesso = null;

                // Crie um try catch para verificação, caso o menu esteja indiponivel, o app retorna uma msg
                try {
                    // Passar a variavel de classe que criamos, recebendo uma Class, e a notação forName que pega o nome da classe ou nesse caso o pacote que contem as classes
                    // Depois passar nossa array de menus passando o ponto I, que é a possição do menui que acessa corretamenta o pacte e a classe que pertecene aquele clique
                    MeusMenusAcesso = Class.forName("com.example.meusestudosandroid." + itens[i]);
                }
                catch (ClassNotFoundException e){
                    e.printStackTrace();
                }

                Intent intent = new Intent(ListViewActivity_13.this, MeusMenusAcesso);
                startActivity(intent);


            }
        });
    }
}