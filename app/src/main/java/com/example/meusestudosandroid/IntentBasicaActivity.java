package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntentBasicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_basica);
    }

    // Forma de chamar a proxima acitivity sem passar valores - Clicando no botão de ação
    public void ProximaTela(View view){
        startActivity(new Intent(IntentBasicaActivity.this, EstudosWebViewActivity.class));
        finish();
    }
}