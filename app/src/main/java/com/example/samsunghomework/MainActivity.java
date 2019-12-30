package com.example.samsunghomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int qq = 0;

    int checkmazahaka = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);
        txt.setText("Тебе удалось успешно сдать экзамен и вот ты пришел на свою первую пару. \n" +
                "Ты поздоровался с преподавателем и он предложил тебе присесть на место. \n" +
                "В аудитории было три свободных места, и ты начал думать: \n" +
                "① У окна, рядом с парнем, с которым, кажется можно подружиться. \n" +
                "② У стены, рядом с красивой девушкой. \n" +
                "③ На ближайщем месте к преподавателю, будет хорошо слышно материал."); //вступление

    }

    /////////////////////////////////////////////////////////////
    public void onClick(View view) {

        Button but1 = findViewById(R.id.bt1);
        Button but2 = findViewById(R.id.bt2);
        Button but3 = findViewById(R.id.bt3);

        TextView txt = findViewById(R.id.txt);

        if (checkmazahaka == 0) {
            switch (view.getId()) { // 1 стадия ответ на вступление
                case R.id.bt1:

                    qq = 1;

                    break;

                case R.id.bt2:

                    qq = 2;

                    break;

                case R.id.bt3:

                    qq = 3;

                    break;

            }//1 стадия
            checkmazahaka = 1;
            VIVOD(qq);
        }
        if ((qq == 1) && (checkmazahaka == 1)) { //развернулся познакомился


            switch (view.getId()) {
                case R.id.bt1:
                    qq = 4;

                    break;


                case R.id.bt2:
                    qq = 5;

                    break;

                case R.id.bt3:
                    qq = 6;

                    break;


            }

            checkmazahaka = 2;
            VIVOD1(qq);
        }


        if ((qq == 2) && (checkmazahaka == 1)) {
            switch (view.getId()) { // 1 стадия
                case R.id.bt1:
                    qq = 7;
                    break;

                case R.id.bt2:
                    qq = 8;

                    break;

                case R.id.bt3:
                    qq = 9;

                    break;

            }
            checkmazahaka = 2;
            VIVOD2(qq);
        }

        if (qq == 3) {
            switch (view.getId()) { // 1 стадия
                case R.id.bt1:
                    qq = 10;

                    break;

                case R.id.bt2:
                    qq = 11;

                    break;

                case R.id.bt3:
                    qq = 12;

                    break;

                //  if (qq == 10) .....
            }
        }

////////////////////////////////////////////////////////


    }


    public void VIVOD(int qq) {
        TextView txt = findViewById(R.id.txt);
        switch (qq) {
            case 1:
                txt.setText("Ты подошел к парню и присел на место. \n"
                        + "Кажется, ему было все равно на твое появление. \n" +
                        "Твои действия? \n" +
                        "① Развернуться к нему и предложить познакомиться. \n" +
                        "② Предложить ему жевательную резинку. \n" +
                        "③ Продолжить осматриваться по сторонам.");
            case 2:
                txt.setText("Ты подошел к девушке и присел на место. \n" +
                        "Кажется, она тобой заинтересовалась... \n" +
                        "Твои действия? \n" +
                        "① Развернуться и предложить познакомиться. \n" +
                        "② Не обращать на ее внимания, стараясь приглядеться к ней. \n" +
                        "③ Посмотреть на нее и улыбнуться.");
            case 3:
                txt.setText("Ты подошел к VIP месту на первой парте и сел перед учителем \n" +
                        "Он заметил твою тягу к знаниям но ничего не сказал \n" +
                        "Твои действия?  \n" +
                        "① Достать телефон и начать в него залипать \n" +
                        "② Преданным взглядом смотреть на преподавателя \n" +
                        "③ Обернуться назад и оглядеть аудиторию");


        }

    }

    public void VIVOD1(int qq) {
        TextView txt = findViewById(R.id.txt);
        switch (qq) {
            case 4:
                txt.setText("Парень оказался не против и с удовольствием с тобой познакомился.\n" +
                        "Он предложил тебе после занятия сходить в KFC.\n" +
                        "Что скажешь?\n" +
                        "① Согласишься и будешь с нетерпением ждать конца пары \n" +
                        "② Откажешься, сославшись на неотложныые дела\n" +
                        "③ Промямлишь что - то непонятное");
            case 5:
                txt.setText("Парень не смог отказаться и с удовольствием взял твой Orbit. \n" +
                        "Он предложил тебе после занятия сходить в KFC.\n" +
                        "Что скажешь?\n" +
                        "① Согласишься и будешь с нетерпением ждать конца пары \n" +
                        "② Откажешься, сославшись на неотложныые дела\n" +
                        "③ Промямлишь что - то непонятное");
            case 6:
                txt.setText("Ты просто сидел и никого не трогал, когда парень сам подошел к тебе. \n" +
                        "Он предложил тебе после занятия сходить в KFC.\n" +
                        "Что скажешь?\n" +
                        "① Согласишься и будешь с нетерпением ждать конца пары \n" +
                        "② Откажешься, сославшись на неотложныые дела\n" +
                        "③ Промямлишь что - то непонятное");

        }

    }

    public void VIVOD2(int qq) {
        TextView txt = findViewById(R.id.txt);
        switch (qq) {
            case 7:
                txt.setText("йй");
            case 8:
                txt.setText("цц");
            case 9:
                txt.setText("уу");
        }
    }
}