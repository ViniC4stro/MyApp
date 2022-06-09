package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //Declarar as variáveis globais
    EditText edtEmail, edtSenha;
    Button btnLogin;
    TextView txtForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtForgot = findViewById(R.id.txtForgot);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pegas os valores do email e senha do usuário
                String email, senha;

                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();

                //Criando a estrutura de decisão para acesso ao sistema
                if (email.equals("senac@sp.senac.br") && senha.equals("senac")){
                    //ENTRAR AQUI
                    Intent intent = new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class);
                    //PASSAR PARÂMETROS PARA OUTRAS JANELAS
                    startActivity(intent);
                }
            }
        });

        txtForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(),"Cliquei no botão do Facebook",
                Toast.LENGTH_SHORT).show();
    }
}