package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class OrientationActivity_14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation_14);

        // Alterar e/ou definir o tipo de orientação da tela dos nossos apps, ou de telas especificas nesse caso.
        // Passamos o contexto a qual vai ser atribuida a orientação
        // setRequestedOrientation - Defini uma requisição de orientação da tela
        // Depois passamos a ActivityInfo + a Flaf de orientação que queremos
        // ActivityInfo - Informações Sobre uma Activity
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Passar a orientação de forma fixa para o APP completo
        // Podemos passar essa informação de orientação diretamente no MANIFEST e na ACTIVITY Escolhida
        // Vamos passar o ScreenOrientation + o tipo de orientação
        // Portrait, a tela fica fixa sem rotacionar, Landscape ele gira


    }
}