package com.example.android.nurcahyadi_1202154156_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class recyclerView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> mJudul;
    private ArrayList<Integer> mGambar;
    private ArrayList<String> mDesc;


    //Daftar Judul
    private String[] Judul = {"AQUA", "VIT", "PRISTINE", "NESTLE", "LEMINERAL", "EVIAN", "EQUIL",
            "CLUB","CLEO","AMIDIS","ADES"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.aqua, R.drawable.vit, R.drawable.pristine,
            R.drawable.nestle, R.drawable.leminerale, R.drawable.evian, R.drawable.equil,
            R.drawable.club,R.drawable.cleo,R.drawable.amidis,R.drawable.ades};
    //Daftar Deskripsi
    private String[] Desc = {"ini adalah air minum merk AQUA", "ini adalah air minum merk VIT", "ini adalah air minum merk PRISTINE",
            "ini adalah air minum merk NESTLE", "ini adalah air minum merk LEMINERALE",
            "ini adalah air minum merk EVIAN", "ini adalah air minum merk EQUIL", "ini adalah air minum merk CLUB",
            "ini adalah air minum merk CLEO","ini adalah air minum merk AMIDIS",
            "ini adalah air minum merk ADES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mJudul = new ArrayList<>();
        mGambar = new ArrayList<>();
        mDesc = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new RecyclerViewAdapter(mJudul, mGambar,mDesc);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    //Mengambil data dari Varibale Gambar dan Judul serta deskripsi, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int a=0; a<Judul.length; a++){
            mGambar.add(Gambar[a]);
            mJudul.add(Judul[a]);
            mDesc.add(Desc[a]);

        }
    }
}
