package com.example.fiscaliza.service;

import android.os.AsyncTask;

import com.example.fiscaliza.model.Ocorrencia;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, Ocorrencia> {

    private final String ocorrencia;

    public HTTPService(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    @Override
    protected Ocorrencia doInBackground(Void... voids) {

        StringBuilder resposta = new StringBuilder();

        try{
            URL url = new URL("https://fiscaliza-wyden.herokuapp.com/ocorrencias");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setConnectTimeout(5000);
            connection.connect();

            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNext()){
                resposta.append(scanner.next());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
