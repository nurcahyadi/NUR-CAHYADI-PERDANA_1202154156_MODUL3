package com.example.android.nurcahyadi_1202154156_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nurcahyadiperdana on 2/16/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> arrayList; //Digunakan untuk Judul
    private ArrayList<Integer> mList; //Digunakan untuk Image/Gambar
    private ArrayList<String> aList; //Digunakan untuk Deskripsi

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList<String> arrayList, ArrayList<Integer> mList, ArrayList<String> aList){
        this.arrayList = arrayList;
        this.mList = mList;
        this.aList = aList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mJudul, mSub;
        private ImageView mGambar;
        private RelativeLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);



            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            mJudul = itemView.findViewById(R.id.title);
            mSub = itemView.findViewById(R.id.desc);
            mGambar = itemView.findViewById(R.id.pict);
            ItemList = itemView.findViewById(R.id.item_list);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String Nama = arrayList.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String deskripsi = aList.get(position);
        final int gambar = mList.get(position);
        holder.mJudul.setText(Nama);
        holder.mSub.setText(deskripsi);
        holder.mGambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.mJudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(view.getContext(),DetailActivity.class);
                //Snackbar.make(view, "Nama Saya: "+Nama, Snackbar.LENGTH_SHORT).show();

                switch (position){
                    case 0:
                    a.putExtra("judul", Nama);
                    a.putExtra("deskripsi", deskripsi);
                    a.putExtra("gambar", gambar);
                    view.getContext().startActivity(a);
                    break;
                    case 1:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 2:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 3:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 4:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 5:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 6:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 7:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 8:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;
                    case 9:
                        a.putExtra("judul", Nama);
                        a.putExtra("deskripsi", deskripsi);
                        a.putExtra("gambar", gambar);
                        view.getContext().startActivity(a);
                        break;

                }

            }
        });
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayList.size();
    }
}
