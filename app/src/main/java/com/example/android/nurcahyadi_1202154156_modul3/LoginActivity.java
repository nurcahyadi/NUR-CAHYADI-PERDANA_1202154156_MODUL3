package com.example.android.nurcahyadi_1202154156_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText musername,mpassword;
    Button mlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        musername = findViewById(R.id.username);
        mpassword = findViewById(R.id.password);
        mlogin = findViewById(R.id.btn_login);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = musername.getText().toString();
                String pass = mpassword.getText().toString();

                if(uname.equals("EAD") && pass.equals("MOBILE")){

                    Toast.makeText(getApplicationContext(),"Login Success !!!",Toast.LENGTH_LONG).show();
                    Intent login = new Intent(LoginActivity.this,recyclerView.class);
                    startActivity(login);

                }else {
                    Toast.makeText(getApplicationContext(),"Login Failed !!!",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
