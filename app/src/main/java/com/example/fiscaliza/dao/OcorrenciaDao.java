package com.example.fiscaliza.dao;

import com.example.fiscaliza.model.Ocorrencia;

import java.util.ArrayList;
import java.util.List;

public class OcorrenciaDao {

    private final static List<Ocorrencia> ocorrencias = new ArrayList<>();

    public void salvar(Ocorrencia ocorrencia){
        ocorrencias.add(ocorrencia);
    }

    public List<Ocorrencia> all(){
        return new ArrayList<>(ocorrencias);
    }

}
