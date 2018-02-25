package com.example.android.nurcahyadi_1202154156_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView title, liter;
    ImageView photo,baterry;
    ImageButton mButtonMin, mButtonPlus;

    private int liters = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String mjudul = intent.getStringExtra("judul");
        Integer mgambar = intent.getIntExtra("gambar",0);

        title = findViewById(R.id.detailjudul);
        liter = findViewById(R.id.Liter);
        photo =  findViewById(R.id.detailgambar);
        baterry =  findViewById(R.id.baterry);
        mButtonPlus = findViewById(R.id.btn_tambah);
        mButtonMin = findViewById(R.id.btn_kurang);


        title.setText(mjudul);
        Battery();
        photo.setImageResource(mgambar);

        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liters++;
                Battery();
            }
        });

        mButtonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liters--;
                Battery();
            }
        });
    }


    public void Battery() {
        if (liters <= 0) {
            // 20%
            liter.setText("1L");
            baterry.setImageResource(R.drawable.ic_battery_20);
            Toast.makeText(this, "Air sedikit", Toast.LENGTH_SHORT).show();
        } else if (liters == 1) {
            // 30%
            liter.setText("2L");
            baterry.setImageResource(R.drawable.ic_battery_30);
        } else if (liters == 2) {
            // 50%
            liter.setText("3L");
            baterry.setImageResource(R.drawable.ic_battery_50);
        } else if (liters == 3) {
            // 60%
            liter.setText("4L");
            baterry.setImageResource(R.drawable.ic_battery_60);
        } else if (liters == 4) {
            // 80%
            liter.setText("5L");
            baterry.setImageResource(R.drawable.ic_battery_80);
        } else if (liters == 5) {
            // 90%
            liter.setText("6L");
            baterry.setImageResource(R.drawable.ic_battery_90);
        } else {
            // 100%
            liter.setText("7L");
            baterry.setImageResource(R.drawable.ic_battery_full);
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_SHORT).show();
        }
    }
}

