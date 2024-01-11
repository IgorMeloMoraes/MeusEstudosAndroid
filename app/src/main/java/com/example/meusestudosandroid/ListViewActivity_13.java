package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

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
                Toast.makeText(ListViewActivity_13.this, itens[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}