package com.example.dashboard_ori;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MenuSatuActivity extends AppCompatActivity {
    int oldValue;
    private Button btnTextInd, btnTextEng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_satu);

        btnTextInd = (Button)findViewById(R.id.changetextbtnInd);
        btnTextEng = (Button)findViewById(R.id.changetextbtnEng);

        btnTextInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnTextInd.setText("Second Text");
            }
        });


        changeTextViewValueRandomlyOnButtonClick();
        changeTextKeInd();
        changeTextKeEng();

        Button hometowia = findViewById(R.id.homemenuwia);
        hometowia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSatuActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Back to Main Menu", Toast.LENGTH_SHORT).show();
            }
        });

        Button nexttowia = findViewById(R.id.nextbtn1);
        nexttowia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuSatuActivity.this, MenuDuaActivity.class);
                startActivity(intent);
            }
        });
    }

    private void changeTextViewValueRandomlyOnButtonClick() {
        final String[] manyDifferentStrings = {"Animals are living things.\n" +
                "\n Like plants, animals need food and waterto tlive. \n" +
                "\n Unlike plants, which make their own food,\n" +
                "animals feed themselves " +
                "by eating plants or other animals"};

        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButtonToInd = (Button) findViewById(R.id.changetextbtnEng);

        changeTextButtonToInd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = (int) (Math.random() * manyDifferentStrings.length);
                if (random == oldValue) {
                    random = (int) (Math.random() * manyDifferentStrings.length);
                }
                changingText.setText(manyDifferentStrings[random]);
                oldValue = random;
            }
        });
    }

    public void changeTextKeInd(){
        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtnInd);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("Hewan adalah mahluk hidup. " +
                        "Seperti tumbuhan, hewan membutuhkan makanan dan air untuk hidup, " +
                        "Hewan memberi makan dirinya sendiri dengan memakan tumbuhan atau hewan yang lain");
            }
        });
    }

    public void changeTextKeEng(){
        final TextView changingText = (TextView) findViewById(R.id.txtwiatochange);
        Button changeTextButton = (Button) findViewById(R.id.changetextbtnEng);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                changingText.setText("Animals are living things. " +
                        "Like plants, animals need food and water to live. " +
                        "Unlike plants, which make their own food, " +
                        "animals feed themselves " +
                        "by eating plants or other animals");
            }
        });
    }
}
