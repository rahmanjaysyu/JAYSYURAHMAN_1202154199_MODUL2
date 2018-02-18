package com.example.android.jaysyurahman_1202154199_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
    }

    public void pilihMenu(View view){
        startActivity(new Intent(this, DaftarMenu.class));
    }
}
