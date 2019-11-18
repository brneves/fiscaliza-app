package com.example.fiscaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.fiscaliza.dao.OcorrenciaDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaOcorrenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ocorrencias);

        Button btnNovo = findViewById(R.id.btnAddOcorrencia);
        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaOcorrenciasActivity.this, CadastroOcorrenciaActivity.class));
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();

        ListView listaOcorrencias = findViewById(R.id.listaOcorrencias);

        OcorrenciaDao dao = new OcorrenciaDao();

        listaOcorrencias.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.all()));
    }


}
