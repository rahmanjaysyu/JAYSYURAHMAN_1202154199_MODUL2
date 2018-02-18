package com.example.android.jaysyurahman_1202154199_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity {

    private Spinner nomorMeja;
    private TextView nama;
    private String labelNoMeja;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);

        nama = (TextView)findViewById(R.id.txtDineIn);
        nomorMeja = (Spinner)findViewById(R.id.txtNomorMeja);
        ArrayList<String> list = isiNomorMeja();
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        nomorMeja.setAdapter(dataAdapter);
    }

    public ArrayList<String> isiNomorMeja(){
        int maks = 10;
        ArrayList<String> data = new ArrayList<>();
        for(int i=1; i<=maks;i++){data.add("Meja "+i);}
        return data;
    }

    public void pilihMenu(View view){
        String nomejax, namax;
        nomejax = String.valueOf(nomorMeja.getSelectedItem());
        namax = nama.getText().toString();
        Toast.makeText(this, nomejax+" atas Nama "+namax+" Dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, DaftarMenu.class));
    }

}
