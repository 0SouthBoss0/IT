package com.example.samsunghomework;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DynamicResult extends ListActivity {


    ArrayList<String> myArr = new ArrayList<>();
    ArrayAdapter<String> monthAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int curr1 = getIntent().getExtras().getInt("curr1");
        int curr2 = getIntent().getExtras().getInt("curr2");
        int curr3 = getIntent().getExtras().getInt("curr3");
        int DAY = getIntent().getExtras().getInt("DAY");

        if (DAY <= 3) {
            myArr.add("Нижнее белье: " + DAY + " шт.");
            myArr.add("Носки: " + DAY + " шт.");
            if (curr1 == 1) {
                myArr.add("Теплая непромокаемая куртка");
                myArr.add("Шарф, перчатки: 1 пара");
                myArr.add("Термобелье: 1 шт.");
                myArr.add("Теплые штаны: 1 шт.");
                myArr.add("Теплая обувь: 1 пара");
            }
            if (curr2 == 1) {
                myArr.add("Рубашка: 2 шт.");
                myArr.add("Футболка: " + DAY + " шт.");
                myArr.add("Кофта/джемпер: 1 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Брюки+ремень: 1 шт.");


            }

            if (curr3 == 1) {
                myArr.add("Лёгкий рюкзак");
                myArr.add("Нож");
                myArr.add("Носовые платки: 1 упаковка");
                myArr.add("Лейкопластырь");
                myArr.add("Средство от насекомых: 1 шт.");
                myArr.add("Бутылка для воды: 1 шт.");
                myArr.add("Фонарик");
                myArr.add("Фотоаппарат + карта памяти");
                myArr.add("Наушники");

            }


            if (curr1 == 2) {
                myArr.add("Непромокаемая куртка с капюшоном");
                myArr.add("Шарф, перчатки: 1 пара");
                myArr.add("Теплые штаны: 1 шт.");
                myArr.add("Теплая обувь: 1 пара");
                myArr.add("Зонт");
            }
            if (curr2 == 2) {
                myArr.add("Футболка с длинным рукавом: " + DAY + " шт.");
                myArr.add("Кофта/джемпер: 1 шт.");
                myArr.add("Слюнявчик: 1 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Подгузники: 1 упаковка");
            }
            if (curr3 == 2) {
                myArr.add("Лёгкий рюкзак");
                myArr.add("Крем для обуви");
                myArr.add("Визитки");
                myArr.add("Блокнот и ручка");
                myArr.add("Бутылка для воды: 1 шт.");


            }
            if (curr1 == 3) {
                myArr.add("Шорты: " + DAY + " шт.");
                myArr.add("Купальный костюм: 2 шт.");
                myArr.add("Сланцы: 1 пара");
                myArr.add("Кроссовки: 1 пара");
                myArr.add("Солнцезащитные очки");
            }

            if (curr2 == 3) {
                myArr.add("Блузка: " + DAY + " шт.");
                myArr.add("Юбка: 2 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Платье: " + DAY + " шт.");
                myArr.add("Кофта/джемпер: 2 шт.");
            }
            if (curr3 == 3) {
                myArr.add("Пляжное полотенце");
                myArr.add("Солнцезащитный крем");
                myArr.add("Мяч для пляжного волейбола");
                myArr.add("Снаряжение для подводного плавания");
            }


        }
        if (DAY > 3 && DAY <= 10) { //СТИРКА
            myArr.add("Нижнее белье: " + (int) Math.round(DAY / 2) + " шт.");
            myArr.add("Носки: " + (int) Math.round(DAY / 2) + " шт.");
            if (curr1 == 1) {
                myArr.add("Теплая непромокаемая куртка");
                myArr.add("Шарф, перчатки: 2 пары");
                myArr.add("Термобелье: 2 шт.");
                myArr.add("Теплые штаны: 2 шт.");
                myArr.add("Теплая обувь: 2 пары");
            }
            if (curr2 == 1) {
                myArr.add("Рубашка: 3 шт.");
                myArr.add("Футболка: " + Math.round((DAY / 3)) + " шт.");
                myArr.add("Кофта/джемпер: 3 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Брюки+ремень: 2 шт.");


            }

            if (curr3 == 1) {
                myArr.add("Рюкзак");
                myArr.add("Нож");
                myArr.add("Носовые платки: 1 упаковка");
                myArr.add("Лейкопластырь");
                myArr.add("Средство от насекомых: 2 шт.");
                myArr.add("Бутылка для воды: 2 шт.");
                myArr.add("Фонарик");
                myArr.add("Фотоаппарат + карта памяти");
                myArr.add("Наушники");
            }


            if (curr1 == 2) {
                myArr.add("Непромокаемая куртка с капюшоном");
                myArr.add("Шарф, перчатки: 1 пара");
                myArr.add("Теплые штаны: 2 шт.");
                myArr.add("Теплая обувь: 2 пары");
                myArr.add("Зонт");
            }
            if (curr2 == 2) {
                myArr.add("Футболка с длинным рукавом: " + Math.round((DAY / 2) + 1) + " шт.");
                myArr.add("Кофта/джемпер: 3 шт.");
                myArr.add("Слюнявчик: 2 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Подгузники: 1 упаковка");
            }
            if (curr3 == 2) {
                myArr.add("Рюкзак");
                myArr.add("Крем для обуви");
                myArr.add("Визитки");
                myArr.add("Блокнот и ручка");
                myArr.add("Бутылка для воды: 2 шт.");
            }
            if (curr1 == 3) {
                myArr.add("Шорты: " + Math.round((DAY / 2) + 1) + " шт.");
                myArr.add("Купальный костюм: 2 шт.");
                myArr.add("Сланцы: 1 пара");
                myArr.add("Кроссовки: 2 пары");
                myArr.add("Солнцезащитные очки");
            }

            if (curr2 == 3) {
                myArr.add("Блузка: " + Math.round((DAY / 2) + 1) + " шт.");
                myArr.add("Юбка: 3 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Платье: " + Math.round((DAY / 2) + 1) + " шт.");
                myArr.add("Кофта/джемпер: 3 шт.");
            }
            if (curr3 == 3) {
                myArr.add("Пляжное полотенце");
                myArr.add("Солнцезащитный крем");
                myArr.add("Мяч для пляжного волейбола");
                myArr.add("Снаряжение для подводного плавания");
                myArr.add("Зонт от солнца");
            }

        }


        if (DAY > 10) {
            myArr.add("Нижнее белье: 7 шт.");
            myArr.add("Носки: 7 пар");
            if (curr1 == 1) {
                myArr.add("Теплая непромокаемая куртка");
                myArr.add("Шарф, перчатки: 2 пары");
                myArr.add("Термобелье: 3 шт.");
                myArr.add("Теплые штаны: 2 шт.");
                myArr.add("Теплая обувь: 2 пары");
            }
            if (curr2 == 1) {
                myArr.add("Рубашка: 3 шт.");
                myArr.add("Футболка: 4 шт.");
                myArr.add("Кофта/джемпер: 3 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Брюки+ремень: 2 шт.");


            }

            if (curr3 == 1) {
                myArr.add("Рюкзак");
                myArr.add("Нож");
                myArr.add("Носовые платки: 1 упаковка");
                myArr.add("Лейкопластырь");
                myArr.add("Средство от насекомых: 2 шт.");
                myArr.add("Бутылка для воды: 2 шт.");
                myArr.add("Фонарик");
                myArr.add("Фотоаппарат + карта памяти");
                myArr.add("Наушники");
            }


            if (curr1 == 2) {
                myArr.add("Непромокаемая куртка с капюшоном");
                myArr.add("Шарф, перчатки: 1 пара");
                myArr.add("Теплые штаны: 1 шт.");
                myArr.add("Теплая обувь: 2 пары");
                myArr.add("Зонт");
            }
            if (curr2 == 2) {
                myArr.add("Футболка с длинным рукавом: 4 шт.");
                myArr.add("Кофта/джемпер: 3 шт.");
                myArr.add("Слюнявчик: 2 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Подгузники: 1 упаковка");
            }
            if (curr3 == 2) {
                myArr.add("Рюкзак");
                myArr.add("Крем для обуви");
                myArr.add("Визитки");
                myArr.add("Блокнот и ручка");
                myArr.add("Бутылка для воды: 2 шт.");
            }
            if (curr1 == 3) {
                myArr.add("Шорты: 3 шт.");
                myArr.add("Купальный костюм: 2 шт.");
                myArr.add("Сланцы: 1 пара");
                myArr.add("Кроссовки: 2 пары");
                myArr.add("Солнцезащитные очки");
            }

            if (curr2 == 3) {
                myArr.add("Блузка: 3 шт.");
                myArr.add("Юбка: 2 шт.");
                myArr.add("Тапочки: 1 пара");
                myArr.add("Платье: 3 шт.");
                myArr.add("Кофта/джемпер: 2 шт.");
            }
            if (curr3 == 3) {
                myArr.add("Пляжное полотенце");
                myArr.add("Солнцезащитный крем");
                myArr.add("Мяч для пляжного волейбола");
                myArr.add("Снаряжение для подводного плавания");
                myArr.add("Зонт от солнца");
            }
        }


        monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArr);
        setListAdapter(monthAdapter);


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        l.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                myArr.add("Новая вещь");
                monthAdapter.notifyDataSetInvalidated();
                return true;
            }
        });
        String month = (String) getListAdapter().getItem(position);
        String element = (String) myArr.get(position), sub = "✔";


        if (element.indexOf(sub) == -1) {
            myArr.set(position, (element + " ✔️"));
            monthAdapter.notifyDataSetInvalidated();

        }
        int counter = 0;
        for (int i = 0; i < myArr.size(); i++) {
            String qq = (String) getListAdapter().getItem(i);
            String ll = (String) myArr.get(i), subb = "✔";
            if (ll.indexOf(subb) != -1) {
                counter++;
            }
        }
        if (counter == myArr.size()) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Счастливой поездки!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}

