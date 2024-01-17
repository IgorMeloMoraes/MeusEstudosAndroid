package com.example.meusestudosandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notificacoes_24 extends AppCompatActivity {

    Button btnNotificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacoes_24);

        btnNotificacao = findViewById(R.id.btn_notificacao);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        btnNotificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Para criarmos notificaões, primeiro temos que criar o contrutor NotificationCompat.Builder e intancioa-lo, passando o contexto e uma string id para o nosso channel
                // Depois basta acessar as notações de titulo e conteudo
                NotificationCompat.Builder builder = new NotificationCompat.Builder(Notificacoes_24.this, "My Notification");
                builder.setContentTitle("Meu Titulo");
                builder.setContentText("Notificação de Teste");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Notificacoes_24.this);
                if (ActivityCompat.checkSelfPermission(Notificacoes_24.this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                managerCompat.notify(1, builder.build());


            }
        });
    }
}