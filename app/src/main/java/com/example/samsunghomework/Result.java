package com.example.samsunghomework;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    CheckBox trysi;
    CheckBox noski;
    CheckBox dop1;
    CheckBox dop2;
    CheckBox dop3;
    CheckBox dop4;
    CheckBox dop5;
    CheckBox dop6;
    CheckBox dop7;
    CheckBox dop8;
    CheckBox dop9;
    CheckBox dop10;


    TextView text;
    MainActivity mainActivity = new MainActivity();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        trysi = (CheckBox) findViewById(R.id.trusi);
        noski = (CheckBox) findViewById(R.id.nocki);
        dop1 = (CheckBox) findViewById(R.id.rubaha);
        dop2 = (CheckBox) findViewById(R.id.footbalka);
        dop3 = (CheckBox) findViewById(R.id.bruki);
        dop4 = (CheckBox) findViewById(R.id.kofta);
        dop5 = (CheckBox) findViewById(R.id.obuv);
        dop6 = (CheckBox) findViewById(R.id.dop1);
        dop7 = (CheckBox) findViewById(R.id.dop2);
        dop8 = (CheckBox) findViewById(R.id.dop3);
        dop9 = (CheckBox) findViewById(R.id.dop4);
        dop10 = (CheckBox) findViewById(R.id.dop5);

        text = (TextView) findViewById(R.id.WELCOME);

        text.setText("Ваш чек-лист: ");

        int curr1 = getIntent().getExtras().getInt("curr1");
        int curr2 = getIntent().getExtras().getInt("curr2");
        int curr3 = getIntent().getExtras().getInt("curr3");
        int DAY = getIntent().getExtras().getInt("DAY");


        if (DAY <= 3) {
            trysi.setText("Нижнее белье: " + DAY + " шт.");
            noski.setText("Носки: " + DAY + " шт.");


        }
        if (DAY > 3 && DAY <= 10) { //СТИРКА
            trysi.setText("Нижнее белье " + (int) Math.round(DAY / 2) + " шт.");
            noski.setText("Носки " + (int) Math.round(DAY / 2) + " шт.");
        }


        if (DAY > 10) {
            trysi.setText("Нижнее белье: 7 шт.");
            noski.setText("Носки: 7 пар");
            if (curr1 == 1) {
                dop1.setText("Теплая непромокаемая куртка: 1 шт.");
                dop2.setText("Шарф, перчатки: 2 пары");
                dop3.setText("Термобелье: 3 шт.");
                dop4.setText("Теплые штаны: 2 шт.");
                dop5.setText("Теплая обувь: 2 пары");
            }
            if (curr2 == 1) {
                dop6.setText("Рубашка: 3 шт.");
                dop7.setText("Футболка: 4 шт.");
                dop8.setText("Кофта/джемпер: 3 шт.");
                dop9.setText("Тапочки в дом: 1 пара");
                dop10.setText("Брюки+ремень: 2 шт.");


            }

            if (curr3 == 1) {
                //туризм
            }


            if (curr1 == 2) {
                dop1.setText("Непромокаемая куртка с капюшоном: 1 шт.");
                dop2.setText("Шарф, перчатки: 1 пара");
                dop3.setText("Теплые штаны: 1 шт.");
                dop4.setText("Теплая обувь: 2 пары");
                dop5.setText("Зонт: 1 шт.");
            }
            if (curr2 == 2) {
                dop6.setText("Футболка с длинным рукавом: 4 шт.");
                dop7.setText("Кофта/джемпер: 3 шт.");
                dop8.setText("Слюнявчик: 1 шт.");
                dop9.setText("Тапочки в дом: 1 пара");
                dop10.setText("Подгузники: 1 упаковка");
            }
            if (curr3 == 2) {
                //командировка
            }
            if (curr1 == 3) {
                dop1.setText("Шорты: 3 шт.");
                dop2.setText("Купальный костюм: 1 шт.");
                dop3.setText("Сланцы: 1 пара");
                dop4.setText("Удобные кроссовки: 2 пары");
                dop5.setText("Солнцезащитные очки: 1 шт");
            }

            if (curr2 == 3) {
                dop6.setText("Блузка: 3 шт.");
                dop7.setText("Юбка: 2 шт.");
                dop8.setText("Тапочки в дом: 1 пара");
                dop9.setText("Платье: 3 шт.");
                dop10.setText("Кофта/джемпер: 2 шт.");
            }
            if (curr3 == 3) {
                //пляж
            }
        }


    }
}


