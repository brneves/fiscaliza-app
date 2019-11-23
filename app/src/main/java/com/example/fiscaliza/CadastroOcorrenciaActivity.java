package com.example.fiscaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.fiscaliza.dao.OcorrenciaDao;
import com.example.fiscaliza.model.Ocorrencia;

import java.util.Date;

public class CadastroOcorrenciaActivity extends AppCompatActivity {

    private EditText campoLatitude;
    private EditText campoLongitude;
    private Spinner campoProblema;
    private EditText campoDescricao;
    private Date dataCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ocorrencia);
    }

    public void cadastrar(View view){

        final OcorrenciaDao dao = new OcorrenciaDao();

        campoLatitude = (EditText) findViewById(R.id.edtLatitude);
        campoLongitude = (EditText) findViewById(R.id.edtLongitude);
        campoProblema = (Spinner) findViewById(R.id.problema);
        campoDescricao = (EditText) findViewById(R.id.edtDescricao);

        String latitude = campoLatitude.getText().toString();
        String longitude = campoLongitude.getText().toString();
        String problema = campoProblema.getSelectedItem().toString();
        String descricao = campoDescricao.getText().toString();

        Ocorrencia ocorrencia = new Ocorrencia(latitude, longitude, problema, descricao);

        Toast.makeText(CadastroOcorrenciaActivity.this, "Latitude: " + ocorrencia.getLatitude() + "\nLongitude: " + ocorrencia.getLongitude() + "\nProblema: " + ocorrencia.getProblema() + "\nDescrição: " + ocorrencia.getDescricao(), Toast.LENGTH_SHORT).show();

        dao.salvar(ocorrencia);

        Intent intent = new Intent(this, ListaOcorrenciasActivity.class);
        startActivity(intent);

//        finish();

    }

}
