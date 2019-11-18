package com.example.fiscaliza;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.fiscaliza.model.Ocorrencia;
import com.example.fiscaliza.service.HTTPService;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MapaActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.cadastrarOcorrencia:
                cadastrarOcorrencia();
                return true;
            default:
                return true;
        }
    }

    public void cadastrarOcorrencia(){
        Intent intent = new Intent(this, CadastroOcorrenciaActivity.class);
        startActivity(intent);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Centraliza o mapa em São Luís
        LatLng saoLuis = new LatLng(-2.5522755, -44.2434229);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saoLuis));

        //adicionar ponto
        LatLng p1 = new LatLng(-2.540367, -44.210097);
        mMap.addMarker(
                new MarkerOptions()
                        .position(p1)
                        .title("Semáforo não funciona")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.semaforo))
        );

        //adiciona ponto
        LatLng p2 = new LatLng(-2.570237, -44.228752);
        mMap.addMarker(
                new MarkerOptions()
                        .position(p2)
                        .title("Buraco na rua")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.buraco))
        );

        //adiciona ponto
        LatLng p3 = new LatLng(-2.540146, -44.209190);
        mMap.addMarker(
                new MarkerOptions()
                        .position(p3)
                        .title("Sem parada de ônibus")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.onibus))
        );

        //adiciona ponto
        LatLng p4 = new LatLng(-2.516601, -44.269819);
        mMap.addMarker(
                new MarkerOptions()
                        .position(p4)
                        .title("Desnível na ponte")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.buraco))
        );


    }
}
