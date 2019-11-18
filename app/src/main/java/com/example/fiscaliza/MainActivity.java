package com.example.fiscaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Ao clicar no botão cadastro, chama a Activity com o formulário de cadastro
     * @param view
     */
    public void cadastro(View view){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    /**
     * Ao clicar no botão do mapa, chama a Activity com o mapa
     * @param view
     */
    public void mapa(View view){
        Intent intent = new Intent(this, MapaActivity.class);
        startActivity(intent);
    }

    public void addOcorrencia(View view) {
        Intent intent = new Intent(this, CadastroOcorrenciaActivity.class);
        startActivity(intent);
    }
}
