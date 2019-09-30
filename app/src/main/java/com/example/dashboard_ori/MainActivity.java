package com.example.dashboard_ori;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView whatisanimal, exercise, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whatisanimal = findViewById(R.id.btn_whatisanimals);
        exercise = findViewById(R.id.btn_exercise);
        info = findViewById(R.id.btn_information);

        whatisanimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MenuSatuActivity.class));
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol What is Animal", Toast.LENGTH_SHORT).show();
            }
        });



        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
                Toast.makeText(getApplicationContext(), "Anda menekan Tombol Information", Toast.LENGTH_SHORT).show();
            }
        });

    }

    //untuk exit
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //jika user memencet "yes" maka bisa langsung keluar
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //jika user memencet "no" maka akan kembali ke aplikasi
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
