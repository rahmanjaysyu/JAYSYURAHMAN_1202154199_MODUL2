package com.example.android.jaysyurahman_1202154199_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        menuList = detilMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new ListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> detilMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Ayam Bakar", 14000, R.drawable.ayambakar, "Ayam Bakar + Nasi + Lalapan"));
        data.add(new MenuModel("Ayam Gulai", 14000, R.drawable.ayamgulai, "Ayam Gulai + Nasi"));
        data.add(new MenuModel("Dendeng", 19000, R.drawable.dendeng, "Dendeng + Nasi."));
        data.add(new MenuModel("Ikan Nila", 19000, R.drawable.nila, "Ikan Nila Bumbu Pedas + Nasi"));
        data.add(new MenuModel("Rendang", 19000, R.drawable.rendang, "Rendang Sapi  + Nasi"));
        data.add(new MenuModel("Telor Balado", 4000, R.drawable.telorbalado, "Telor dengan sambal balado"));
        data.add(new MenuModel("Sayur Nangka", 2000, R.drawable.nangka, "Sayur Nangka dengan kuah khas padang"));
        data.add(new MenuModel("Sayur Singkong", 2000, R.drawable.singkong, "Sayur Singkong rebus"));
        return data;
    }


}
