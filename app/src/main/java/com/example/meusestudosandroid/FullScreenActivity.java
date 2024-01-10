package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Deixar a tela em fullScreen - Ideal para splashScreen ou alguma pagina com video ou conteudo especifico

        // RequestWindowFeature - Habilita recursos de janela estendida.
        // FEATURE_NO_TITLE - desativa o título na parte superior da tela.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // getWindow - Recupera a janela atual da atividade.
        // setFlags - Defini as Flags
        // WindowManeger - A interface que os aplicativos usam para conversar com o gerenciador de janelas.
        // LayoutParams - Parametros de layout
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_full_screen);
    }
}