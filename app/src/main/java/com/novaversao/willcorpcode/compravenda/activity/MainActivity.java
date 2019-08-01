package com.novaversao.willcorpcode.compravenda.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.novaversao.willcorpcode.compravenda.R;

public class MainActivity extends AppCompatActivity {

    //Activity
    private EditText loginEmail;
    private EditText loginSenha;
    private Button botaoLogin;

    //banco de dados
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        loginEmail = findViewById(R.id.id_email_login);
        loginSenha = findViewById(R.id.id_senha_login);
        botaoLogin = findViewById(R.id.b_entrar_login);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = loginEmail.getText().toString();
                String senha = loginSenha.getText().toString();
                if (!email.isEmpty()){
                    if (!senha.isEmpty()){


                    }else{
                        Toast.makeText(MainActivity.this,"Coloque a sua senha",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Coloque o seu email",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
