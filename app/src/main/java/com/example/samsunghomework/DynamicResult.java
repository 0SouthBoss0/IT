package com.example.samsunghomework;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

public class DynamicResult extends ListActivity {


    ArrayList<String> myArr = new ArrayList<>();
    ArrayAdapter<String> monthAdapter;
    SharedPreferences sPref;
    String frignjeoihghboi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setTheme(android.R.style.Theme_Material_Light);
        int curr1 = getIntent().getExtras().getInt("curr1");
        int curr2 = getIntent().getExtras().getInt("curr2");
        int curr3 = getIntent().getExtras().getInt("curr3");
        int DAY = getIntent().getExtras().getInt("DAY");
        frignjeoihghboi = (DAY + "" + curr1 + "" + curr2 + "" + curr3);


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
        registerForContextMenu(getListView());

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.name:
                editItem(info.position);
                return true;
            case R.id.delete:
                deleteItem(info.position);
                return true;
            case R.id.num:
                numItem(info.position);
                return true;
            case R.id.galka:
                galka(info.position);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.add:
                addItem();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }


    private void addItem() {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите Вашу новую вещь");


        // alert.setMessage("Message");

        final EditText input = new EditText(this);

        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String qq = input.getText().toString();
                myArr.add(qq);
                monthAdapter.notifyDataSetInvalidated();

            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();


        /////////////////////

    }

    LinearLayout view;
    EditText input;
    Button in;
    Button gfxtr;
    Button gfh;
    String tyfpe;
    int Type = 0;

    private void numItem(int position) {
        view = (LinearLayout) getLayoutInflater()
                .inflate(R.layout.dialog, null);
        input = (EditText) view.findViewById(R.id.input);


        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите новое количество");

        alert.setView(view);

        alert.setMessage("При единичном значении оставьте поле пустым");

        //  final EditText input = new EditText(this);

        //  alert.setView(input);

        alert.setPositiveButton("ДА", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {


                String qq = input.getText().toString();

                if (input.length() == 0) {
                    if (myArr.get(position).contains(":")) {
                        int index = myArr.get(position).indexOf(":");
                        myArr.set(position, (myArr.get(position).substring(0, index)).replace("✔", ""));
                    } else {
                    }
                    monthAdapter.notifyDataSetInvalidated();


                } else {
                    int check = 0;
                    int TypeQ = 0;
                    try {
                        TypeQ = Integer.parseInt(qq);
                    } catch (Exception e) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Введено неверное количество", Toast.LENGTH_SHORT);
                        toast.show();
                        check = 1;
                    }
                    if (check == 0) {
                        if (TypeQ != 0) {
                            if (Type == 1) {
                                tyfpe = "шт.";


                            }
                            if (Type == 2) {
                                if (TypeQ % 10 == 1) {
                                    tyfpe = "пачка";
                                }
                                if (TypeQ % 10 == 2 || TypeQ % 10 == 3 || TypeQ % 10 == 4) {
                                    tyfpe = "пачки";
                                }
                                if (TypeQ % 10 > 4) {
                                    tyfpe = "пачек";
                                }


                            }
                            if (Type == 3) {
                                tyfpe = "пар";


                            }
                        }
                        if (myArr.get(position).contains(":")) {
                            int index = myArr.get(position).indexOf(":");
                            try {
                                myArr.set(position, (myArr.get(position).substring(0, index + 2)) + qq.replace("✔", "") + " " + tyfpe);
                            } catch (Exception e) {
                                myArr.set(position, qq.replace("✔", "") + " " + tyfpe);
                            }
                        } else {
                            String just = myArr.get(position).replace("✔", "");
                            myArr.set(position, just + ": " + qq + " " + tyfpe);
                        }
                        monthAdapter.notifyDataSetInvalidated();
                    }
                }
            }
        });


        alert.setNegativeButton("НЕТ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();


    }

    private void editItem(int position) { //name
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите Вашу изменённую вещь");

        // alert.setMessage("Message");

        final EditText input = new EditText(this);

        alert.setView(input);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String qq = input.getText().toString().replace("✔", "");


                if (input.length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Укажите название", Toast.LENGTH_SHORT);
                    alert.setView(input);
                    input.setText("");
                    toast.show();


                } else {

                    int index = myArr.get(position).indexOf(":");
                    try {
                        myArr.set(position, (qq + myArr.get(position).substring(index)));
                    } catch (Exception e) {
                        myArr.set(position, qq);
                    }

                    monthAdapter.notifyDataSetInvalidated();
                    //      loadText(qq);
                    //    saveText(qq);

                }
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }

        });

        alert.show();

        /////////////////////
    }

    private void deleteItem(int position) {
        myArr.remove(position);

        monthAdapter.notifyDataSetInvalidated();
    }

    private void galka(int position) {
        String qq = myArr.get(position).replace("✔", "");
        myArr.set(position, qq);
        monthAdapter.notifyDataSetInvalidated();
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

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

    private void saveText(String qq) {

        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(frignjeoihghboi, qq);
        ed.commit();

    }

    private void loadText(String qq) {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(frignjeoihghboi, qq);

        Toast.makeText(this, savedText, Toast.LENGTH_SHORT).show();
    }

    public void onqq(ListView l, View v, int position, long id) {
        l.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id1) {
////////////////////////////////////////////////////////////////////////////////////////////////
                DynamicResult.this.openContextMenu(l);

////////////////////////////////////////////////////////////////////////////////////////////////

                return true;
            }
        });
    }

int KNOPKA;
    public void in(View view) { // шт

        Type = 1;
        in = (Button) view.findViewById(R.id.in);
        
        KNOPKA = 1;


    }

    public void gfxtr(View view) { // пачек

        Type = 2;
    }


    public void gfh(View view) { // пар

        Type = 3;

    }


}

