package com.example.samsunghomework;

import android.content.Context;
import android.content.DialogInterface;
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
import androidx.appcompat.app.AppCompatActivity;

import com.orhanobut.hawk.Hawk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewResult extends AppCompatActivity {
    ArrayList<String> myArr = new ArrayList<>();
    ArrayAdapter<String> monthAdapter;
    String UNIC = "";
    ListView listView;

    String SAVEDITEMS = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        int curr1 = getIntent().getExtras().getInt("curr1");
        int curr2 = getIntent().getExtras().getInt("curr2");
        int curr3 = getIntent().getExtras().getInt("curr3");
        int DAY = getIntent().getExtras().getInt("DAY");
        UNIC = (DAY + "" + curr1 + "" + curr2 + "" + curr3);

        loadText(UNIC);


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
            myArr.add("Нижнее белье: " + Math.round(DAY / 2) + " шт.");
            myArr.add("Носки: " + Math.round(DAY / 2) + " шт.");
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
        if (curr2 == 1) {
            myArr.add("Телефон и зарядное устройство");
            myArr.add("Наушники");
            myArr.add("Бритва");
            myArr.add("Гель для бритья");
            myArr.add("Зубная щётка");
            myArr.add("Зубная паста");
            myArr.add("Гель для душа");
            myArr.add("Туалетная бумага");
            myArr.add("Мочалка");
            myArr.add("Дезодорант");
            myArr.add("Расчёска");
            myArr.add("Паспорт");
            myArr.add("Водительские права");
            myArr.add("Медицинский полис");
            myArr.add("Наличные");
            myArr.add("Банковская карта");
            myArr.add("Билеты на транспорт");

        }
        if (curr2 == 2) {
            myArr.add("Плед");
            myArr.add("Зубная щётка");
            myArr.add("Зубная паста");
            myArr.add("Небольшая игрушка");
            myArr.add("Гель для душа");
            myArr.add("Туалетная бумага");
            myArr.add("Мочалка");
            myArr.add("Салфетки");
            myArr.add("Расчёска");
            myArr.add("Свидетельство о рождении");
            myArr.add("Медицинский полис");
            myArr.add("Билеты на транспорт");
        }
        if (curr2 == 3) {
            myArr.add("Телефон и зарядное устройство");
            myArr.add("Наушники");
            myArr.add("Бритва");
            myArr.add("Гель для бритья");
            myArr.add("Зубная щётка");
            myArr.add("Зубная паста");
            myArr.add("Гель для душа");
            myArr.add("Туалетная бумага");
            myArr.add("Мочалка");
            myArr.add("Дезодорант");
            myArr.add("Косметика");
            myArr.add("Парфюм");
            myArr.add("Расчёска");
            myArr.add("Паспорт");
            myArr.add("Водительские права");
            myArr.add("Медицинский полис");
            myArr.add("Наличные");
            myArr.add("Банковская карта");
            myArr.add("Билеты на транспорт");

        }

        monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myArr);

        listView = findViewById(R.id.listodejda);
        listView.setAdapter(monthAdapter);
        registerForContextMenu(listView);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> arg0, View view,
                                            int position, long id) {


                        String element = myArr.get(position), sub = "✔";


                        if (!element.contains(sub)) {
                            myArr.set(position, (element + " ✔️"));
                            monthAdapter.notifyDataSetInvalidated();

                        }
                        int counter = 0;
                        for (int i = 0; i < myArr.size(); i++) {

                            String ll = myArr.get(i), subb = "✔";
                            if (ll.contains(subb)) {
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
        );
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
        switch (item.getItemId()) {
            case R.id.add:
                addItem();
                return true;
            case R.id.save:
                saveList();
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }

    LinearLayout addview;
    EditText addinput;
    EditText addinputq;
    Button addin;
    Button addgfxtr;
    Button addgfh;
    int addType = 0;

    public void addin(View view) {
        addType = 1;
        addsetText(addType);
    }

    public void addgfxtr(View view) {
        addType = 2;
        addsetText(addType);
    }

    public void addgfh(View view) {
        addType = 3;
        addsetText(addType);
    }

    String addtypfre;

    private void addItem() {
        addview = (LinearLayout) getLayoutInflater()
                .inflate(R.layout.adddialog, null);
        addinput = addview.findViewById(R.id.addinput);
        addinputq = addview.findViewById(R.id.addinputq);
        addin = addview.findViewById(R.id.addin);
        addgfxtr = addview.findViewById(R.id.addgfxtr);
        addgfh = addview.findViewById(R.id.addgfh);

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите Вашу новую вещь");


        alert.setView(addview);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int whichButton) {
                String qq = addinput.getText().toString();
                String qqq = addinputq.getText().toString();

                if (qq.isEmpty()) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите название вещи", Toast.LENGTH_SHORT);
                    toast.show();
                }
                if (qqq.isEmpty()) {
                    myArr.add(qq);
                }
                if (!qq.isEmpty() && !qqq.isEmpty()) {

                    int addCheck = 0;
                    int typeAdd = 0;

                    try {
                        typeAdd = Integer.parseInt(qqq);
                    } catch (Exception e) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Введено неверное количество", Toast.LENGTH_SHORT);
                        toast.show();
                        addCheck = 1;
                    }
                    if (typeAdd == 1 || typeAdd == 0) {
                        myArr.add(qq);
                    } else if (addCheck == 0) {
                        if (addType != 0) {
                            if (addType == 1) {
                                addtypfre = "шт.";


                            }
                            if (addType == 2) {
                                if (typeAdd % 10 == 1) {
                                    addtypfre = "пачка";
                                }
                                if (typeAdd % 10 == 2 || typeAdd % 10 == 3 || typeAdd % 10 == 4) {
                                    addtypfre = "пачки";
                                }
                                if (typeAdd % 10 > 4) {
                                    addtypfre = "пачек";
                                }


                            }
                            if (addType == 3) {
                                if (typeAdd % 10 == 1) {
                                    addtypfre = "пара";
                                }
                                if (typeAdd % 10 == 2 || typeAdd % 10 == 3 || typeAdd % 10 == 4) {
                                    addtypfre = "пары";
                                }
                                if (typeAdd % 10 > 4) {
                                    addtypfre = "пар";
                                }

                            }
                        }
                        myArr.add(qq + ": " + qqq + " " + addtypfre);
                    } else {
                        myArr.add(qq + ": " + qqq);
                    }


                }


                monthAdapter.notifyDataSetInvalidated();
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();


    }

    LinearLayout view;
    EditText input;
    String tyfpe;
    int Type = 0;

    private void numItem(int position) {
        view = (LinearLayout) getLayoutInflater()
                .inflate(R.layout.dialog, null);
        input = view.findViewById(R.id.input);


        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Введите новое количество");

        alert.setView(view);

        alert.setMessage("При единичном значении оставьте поле пустым");


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
                                if (TypeQ % 10 == 1) {
                                    tyfpe = "пара";
                                }
                                if (TypeQ % 10 == 2 || TypeQ % 10 == 3 || TypeQ % 10 == 4) {
                                    tyfpe = "пары";
                                }
                                if (TypeQ % 10 > 4) {
                                    tyfpe = "пар";
                                }


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


                }
            }
        });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }

        });

        alert.show();

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


    private void saveList() {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Вы уверены, что хотите сохранить Ваш список?");


        alert.setPositiveButton("ДА", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

                saveText();


            }
        });


        alert.setNegativeButton("НЕТ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        alert.show();


    }


    private void saveText() {
        Context context = getApplicationContext();
        Hawk.init(context).build();
        for (int i = 0; i < myArr.size(); i++) {
            SAVEDITEMS = SAVEDITEMS + myArr.get(i).replace("✔", "") + "&";
        }

        Hawk.put(UNIC, SAVEDITEMS);


        Toast toast = Toast.makeText(getApplicationContext(),
                "Ваш список сохранен", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void loadText(String UNIC) {
        Context context = getApplicationContext();
        Hawk.init(context).build();

        String savedText = Hawk.get(UNIC);

        if (Hawk.contains(UNIC)) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Вы хотите загрузить Ваш прошлый список?");

            alert.setView(view);

            alert.setPositiveButton("ДА", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    myArr.clear();
                    //переменная savedText - сохранеенные итемы, разделенные &
                    List<String> textArray = new ArrayList<>(Arrays.asList(savedText.split("&")));

                    myArr.addAll(textArray);

                    monthAdapter.notifyDataSetInvalidated();

                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш список загружен", Toast.LENGTH_SHORT);
                    toast.show();
                }
            });


            alert.setNegativeButton("НЕТ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {

                }
            });
            alert.show();

        }


    }

    public void onqq(ListView l) {
        l.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id1) {

                ListViewResult.this.openContextMenu(l);


                return true;
            }
        });
    }

    int KNOPKA;

    public void in(View view) { // шт

        Type = 1;
        setText(Type);
        KNOPKA = 1;


    }

    public void setText(int Type) {
        Button inButton = view.findViewById(R.id.in);
        Button gfxtrButton = view.findViewById(R.id.gfxtr);
        Button gfhButton = view.findViewById(R.id.gfh);
        if (Type == 1) {
            inButton.setText("шт. ✔");
            gfxtrButton.setText("пачек");
            gfhButton.setText("пар");
        }
        if (Type == 2) {
            gfxtrButton.setText("пачек ✔");
            inButton.setText("шт.");
            gfhButton.setText("пар");
        }
        if (Type == 3) {
            gfhButton.setText("пар ✔");
            gfxtrButton.setText("пачек");
            inButton.setText("шт.");
        }
    }

    Button addinButton;
    Button addgfxtrButton;
    Button addgfhButton;

    public void addsetText(int addType) {
        addinButton = addview.findViewById(R.id.addin);
        addgfxtrButton = addview.findViewById(R.id.addgfxtr);
        addgfhButton = addview.findViewById(R.id.addgfh);
        if (addType == 1) {
            addinButton.setText("шт. ✔");
            addgfxtrButton.setText("пачек");
            addgfhButton.setText("пар");
        }
        if (addType == 2) {
            addgfxtrButton.setText("пачек ✔");
            addinButton.setText("шт.");
            addgfhButton.setText("пар");
        }
        if (addType == 3) {
            addgfhButton.setText("пар ✔");
            addgfxtrButton.setText("пачек");
            addinButton.setText("шт.");
        }
    }

    public void gfxtr(View view) { // пачек


        Type = 2;
        setText(Type);
    }


    public void gfh(View view) { // пар


        Type = 3;
        setText(Type);
    }


}



