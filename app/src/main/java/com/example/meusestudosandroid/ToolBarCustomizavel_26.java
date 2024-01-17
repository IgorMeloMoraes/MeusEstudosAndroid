package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class ToolBarCustomizavel_26 extends AppCompatActivity {

    ImageView imgIconSol, imgIconCorona;
    TextView txtToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar_customizavel_26);

        // Crie um Novo recurso de layout com o nome de toolbar
        // Depois Inclua o layout dentro do xml que desejar

        imgIconSol = findViewById(R.id.left_icon);
        imgIconCorona = findViewById(R.id.right_icon);
        txtToolbar = findViewById(R.id.txt_toolbar);

        imgIconSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToolBarCustomizavel_26.this, "Sol meu querido Sol", Toast.LENGTH_SHORT).show();
            }
        });

        imgIconCorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               showMenu(view);
            }
        });

        txtToolbar.setText("iguana");

    }

    // Criando um PopPup Menu
    public void showMenu(View v){
        // Crie uma pasta Menu, e um resource chamado de menu
        PopupMenu popupMenu = new PopupMenu(ToolBarCustomizavel_26.this, v);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.menu_um){
                    Toast.makeText(ToolBarCustomizavel_26.this, "UMMMM", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.menu_dois){
                    Toast.makeText(ToolBarCustomizavel_26.this, "DOISSS", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.menu_tres){
                    Toast.makeText(ToolBarCustomizavel_26.this, "EEE TREESSS", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        popupMenu.show();
    }
}