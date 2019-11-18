package com.example.fiscaliza.model;

import androidx.annotation.NonNull;

import java.util.Calendar;
import java.util.Date;

public class Ocorrencia {

//    private String usuario;
    private String problema;
    private String latitude;
    private String longitude;
    private String descricao;
    private Date dataCadastro;

    public Ocorrencia(String problema, String latitude, String longitude, String descricao){
        this.problema = problema;
        this.latitude = latitude;
        this.longitude = longitude;
        this.descricao = descricao;
        Calendar c = Calendar.getInstance();
        this.dataCadastro = c.getTime();
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @NonNull
    @Override
    public String toString(){
        return this.getProblema() + "\n" + this.getLatitude() + "\n" + this.getLongitude() + "\n" + this.getDescricao() + "\n" + this.getDataCadastro();
    }

}
