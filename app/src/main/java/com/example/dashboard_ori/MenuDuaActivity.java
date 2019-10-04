package com.example.dashboard_ori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuDuaActivity extends AppCompatActivity {

    Button vertebrate, invertebrate, prev, home2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dua);
        vertebrate = findViewById(R.id.btnvertebrates);
        invertebrate = findViewById(R.id.btninvertebrates);
        prev = findViewById(R.id.prevbtn2);
        home2 = findViewById(R.id.homemenuwia2);

        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        vertebrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VertebrateActivity.class);
                startActivity(i);
            }
        });

        invertebrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), InvertebrateActivity.class);
                startActivity(i);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuDuaActivity.this, MenuSatuActivity.class));
            }
        });
    }
}
