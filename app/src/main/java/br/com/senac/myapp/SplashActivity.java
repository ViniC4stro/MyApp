package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        //EXECUTAR UM PROCESSO EM BACKGROUND
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //ABRIR JANELA E LOGIN
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
            }
        },3000);

    }
}