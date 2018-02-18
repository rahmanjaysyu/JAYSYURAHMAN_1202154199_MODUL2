package com.example.android.jaysyurahman_1202154199_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MenuViewHolder> {

    class MenuViewHolder extends RecyclerView.ViewHolder {
        private TextView Nama, Harga, ID;
        private ImageView Gambar;

        public MenuViewHolder(View itemView) {
            super(itemView);
            ID = (TextView) itemView.findViewById(R.id.ListID);
            Nama = (TextView) itemView.findViewById(R.id.ListNama);
            Harga = (TextView) itemView.findViewById(R.id.ListHarga);
            Gambar = (ImageView) itemView.findViewById(R.id.ListGambar);
        }
    }

    private ArrayList<MenuModel> dataList;

    public ListAdapter(ArrayList<MenuModel> list) {
        this.dataList = list;
        Log.d("Jumlah Menu", "Size: " + getItemCount());
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.menulist, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuViewHolder holder, final int position) {
        holder.ID.setText("" + position);
        holder.Nama.setText(dataList.get(position).getNama());
        holder.Harga.setText("" + NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.Gambar.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idx = holder.ID.getText().toString();
                Log.d("ItemMenuCLICKED", "ID:" + idx);
                Toast.makeText(v.getContext(), "Memilih Menu '" + dataList.get(Integer.parseInt(idx)).getNama() + "'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID", "" + idx);
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
}