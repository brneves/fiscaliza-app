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

    //Um Intent é um objeto que fornece vínculos de tempo de execução entre componentes separados, como duas atividades. O Intent representa uma “intenção de fazer algo” do aplicativo. Você pode usar intents para uma ampla variedade de tarefas, mas, nesta lição, o intent iniciará outra atividade.

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

}
