package com.example.fiscaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroOcorrenciaActivity extends AppCompatActivity {

    private EditText latitude;
    private EditText longitude;
    private EditText problema;
    private EditText descricao;
    private Button btnLimpar, btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ocorrencia);

        latitude= (EditText) findViewById(R.id.edtNome);
    }

    /**
     * Limpa os dados preenchidos no formulário
     * @param view
     */
    public void limparDados(View view){
        latitude.setText("");
        longitude.setText("");
        descricao.setText("");
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
