package com.example.fiscaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText senha;
    private Button btnLimpar, btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.edtNome);
        email = (EditText) findViewById(R.id.edtEmail);
        senha = (EditText) findViewById(R.id.edtSenha);
    }

    /**
     * Limpa os dados preenchidos no formulário
     * @param view
     */
    public void limparDados(View view){
        nome.setText("");
        email.setText("");
        senha.setText("");
    }

    /**
     * Chama o Toast para exibir a mensagem de cadastro
     * @param view
     */
    public void cadastrar(View view){
        alert("Cadastro realizado com sucesso");
    }

    /**
     * Exibe o Toast na tela
     * @param s
     */
    public void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        btnEnviar.setEnabled(false);
        btnLimpar.setEnabled(true);
    }

}