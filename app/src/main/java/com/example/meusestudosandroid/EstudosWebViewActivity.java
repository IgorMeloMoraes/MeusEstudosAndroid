package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class EstudosWebViewActivity extends AppCompatActivity {

    // Estudos sobre como utilizar HTML e CSS dentro do App Android

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudos_web_view);

        // String apontando para o caminho do arquivo html e armazana na variavel
        String myUrl = "file:///android_asset/index.html";

        // Acessa o id do objetoWebView e armazena na variavel
        WebView webView = (WebView) this.findViewById(R.id.web_view);

        // Ativa o Javascript
        webView.getSettings().getJavaScriptEnabled();

        // carrega o arquivo da variavel
        webView.loadUrl(myUrl);

        // Criar uma pasta chamada assets para inserir o html - New + Folder + AssetsFolder = Pasta Criada
            // Dentro da pasta basta inserir o arquivo html desejado ou criar um utilizando new + file e criar o html
    }
}