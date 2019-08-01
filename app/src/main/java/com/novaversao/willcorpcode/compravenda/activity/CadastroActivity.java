package com.novaversao.willcorpcode.compravenda.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.novaversao.willcorpcode.compravenda.R;

public class CadastroActivity extends AppCompatActivity {

    //Activity
    private EditText nome;
    private EditText email;
    private EditText senha;
    private EditText senhaConf;
    private Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.id_cad_nome);
        email = findViewById(R.id.id_cad_email);
        senha = findViewById(R.id.id_cad_pass);
        senhaConf = findViewById(R.id.id_cad_passconf);
        confirmar = findViewById(R.id.b_cad_cadastrar);


    }
}
