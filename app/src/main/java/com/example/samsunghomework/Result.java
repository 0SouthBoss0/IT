package com.example.samsunghomework;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    CheckBox trysi;
    CheckBox rubaha;
    CheckBox footbolka;
    CheckBox shorti;
    CheckBox noski;
    CheckBox bruki;
    CheckBox kofta;
    CheckBox obuv;
    CheckBox dop1;
    CheckBox dop2;
    CheckBox dop3;
    CheckBox dop4;
    CheckBox dop5;
    CheckBox dop6;
    CheckBox dop7;
    TextView text;
    MainActivity mainActivity = new MainActivity();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        trysi = (CheckBox) findViewById(R.id.trusi);
        rubaha = (CheckBox) findViewById(R.id.rubaha);
        footbolka = (CheckBox) findViewById(R.id.footbalka);
        shorti = (CheckBox) findViewById(R.id.shorti);
        noski = (CheckBox) findViewById(R.id.nocki);
        bruki = (CheckBox) findViewById(R.id.bruki);
        kofta = (CheckBox) findViewById(R.id.kofta);
        obuv = (CheckBox) findViewById(R.id.obuv);

        dop1 = (CheckBox) findViewById(R.id.dop1);
        dop2 = (CheckBox) findViewById(R.id.dop2);
        dop3 = (CheckBox) findViewById(R.id.dop3);
        dop4 = (CheckBox) findViewById(R.id.dop4);
        dop5 = (CheckBox) findViewById(R.id.dop5);
        dop6 = (CheckBox) findViewById(R.id.dop6);
        dop7 = (CheckBox) findViewById(R.id.dop7);


        text = (TextView) findViewById(R.id.WELCOME);
        text.setText("Ваш чек-лист: ");

        int curr1 = getIntent().getExtras().getInt("curr1");
        int curr2 = getIntent().getExtras().getInt("curr2");
        int curr3 = getIntent().getExtras().getInt("curr3");
        int DAY = getIntent().getExtras().getInt("DAY");


        if (DAY > 10) {
            noski.setText("Носки: 10 шт.");
            footbolka.setText("Футболка: 8 шт.");
            trysi.setText("Нижнее бельё: " + "8" + " шт.");
            rubaha.setText("Рубашка: 4 шт.");
            kofta.setText("Кофта: 2 шт.");


            obuv.setText("Обувь: 2 шт.");
            shorti.setText("Шорты: 2 шт");
            bruki.setText("Брюки: 3 шт.");

        } else {

            trysi.setText("Нижнее бельё: " + DAY + " шт.");
            rubaha.setText("Рубашка: " + (int) Math.round(DAY / 2) + " шт.");
            footbolka.setText("Футболка: " + (int) Math.round((DAY / 2) + 1) + " шт.");
            noski.setText("Носки: " + DAY + " шт.");
            kofta.setText("Кофта " + (int) Math.round(DAY / 3) + " шт.");

            obuv.setText("Обувь: 1 шт.");
            shorti.setText("Шорты: 1 шт.");
            bruki.setText("Брюки " + (int) Math.round(DAY / 2) + " шт");


        }
    }
}

