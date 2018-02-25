package com.example.android.nurcahyadi_1202154156_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        progressBar =  findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(Splashscreen.this,"NUR CAHYADI PERDANA_1202154156",Toast.LENGTH_LONG).show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), Splashscreen.class));
                Intent a = new Intent(Splashscreen.this,LoginActivity.class);
                startActivity(a);
                progressBar.setVisibility(View.GONE);
                finish();
            }
        }, 5000L); //1000 L = 1 detik

    }
}
