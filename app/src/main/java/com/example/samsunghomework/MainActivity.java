package com.example.samsunghomework;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.samsunghomework.R.id.Middle;
import static com.example.samsunghomework.R.id.Summer;
import static com.example.samsunghomework.R.id.turizm;

public class MainActivity extends AppCompatActivity {
    ImageButton winter;
    ImageButton middle;
    ImageButton summer;
    ImageButton man;
    ImageButton child;
    ImageButton woman;
    ImageButton turuzm;
    ImageButton komandirovka;
    ImageButton plyazh;
    ScrollView scrollView;
    LinearLayout mainlayout;


    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winter = (ImageButton) findViewById(R.id.winter);
        middle = (ImageButton) findViewById(Middle);
        summer = (ImageButton) findViewById(Summer);
        mainlayout = (LinearLayout) findViewById(R.id.mainlayout);
        man = (ImageButton) findViewById(R.id.man);
        child = (ImageButton) findViewById(R.id.child);
        woman = (ImageButton) findViewById(R.id.woman);
        turuzm = (ImageButton) findViewById(turizm);
        komandirovka = (ImageButton) findViewById(R.id.komandirovka);
        plyazh = (ImageButton) findViewById(R.id.plyazh);
        editText = (EditText) findViewById(R.id.editText);
     //   scrollView = (ScrollView) findViewById(scrool);
//        scrollView.setBackgroundColor(Color.parseColor("#bbbbbb"));
        editText.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
        man.setVisibility(View.INVISIBLE);
        child.setVisibility(View.INVISIBLE);
        woman.setVisibility(View.INVISIBLE);
        turuzm.setVisibility(View.INVISIBLE);
        komandirovka.setVisibility(View.INVISIBLE);
        plyazh.setVisibility(View.INVISIBLE);

    }


    int galka = 0;
    int alo = 0;

    public int curr = 0;
    public int DAY = 0;
    int galka3 = 0;
    int curr3 = 0;

    int galka2 = 0;
    int curr2 = 0;

    public void Winter(View view) {
        man.setVisibility(View.VISIBLE);
        child.setVisibility(View.VISIBLE);
        woman.setVisibility(View.VISIBLE);
        if (galka == 0) winter.setImageResource(R.drawable.galka);

        else if (curr == 2) {
            middle.setImageResource(R.drawable.listok);
            winter.setImageResource(R.drawable.galka);
        }
        if (curr == 3) {
            summer.setImageResource(R.drawable.summer);
            winter.setImageResource(R.drawable.galka);
        }
        galka = 1;
        curr = 1;
        //  mainlayout.addView(new ImageButton(this));
       /*
        ImageButton imageButton = new ImageButton(MainActivity.this);
        imageButton.setImageResource(R.drawable.galka);
        LinearLayout.LayoutParams imageViewLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        imageButton.setLayoutParams(imageViewLayoutParams);

        mainlayout.addView(imageButton);
*/
    }


    public void Middle(View view) {
        man.setVisibility(View.VISIBLE);
        child.setVisibility(View.VISIBLE);
        woman.setVisibility(View.VISIBLE);
        if (galka == 0) middle.setImageResource(R.drawable.galka);
        else if (curr == 1) {
            winter.setImageResource(R.drawable.winter);
            middle.setImageResource(R.drawable.galka);
        }
        if (curr == 3) {
            summer.setImageResource(R.drawable.summer);
            middle.setImageResource(R.drawable.galka);
        }
        galka = 1;
        curr = 2;
    }

    public void Summer(View view) {
        man.setVisibility(View.VISIBLE);
        child.setVisibility(View.VISIBLE);
        woman.setVisibility(View.VISIBLE);
        if (galka == 0) summer.setImageResource(R.drawable.galka);
        else if (curr == 1) {
            winter.setImageResource(R.drawable.winter);
            summer.setImageResource(R.drawable.galka);
        }

        if (curr == 2) {
            middle.setImageResource(R.drawable.listok);
            summer.setImageResource(R.drawable.galka);

        }
        galka = 1;
        curr = 3;
    }


    public void Man(View view) {
        turuzm.setVisibility(View.VISIBLE);
        komandirovka.setVisibility(View.VISIBLE);
        plyazh.setVisibility(View.VISIBLE);
        if (galka2 == 0) man.setImageResource(R.drawable.galka);
        else if (curr2 == 2) {
            child.setImageResource(R.drawable.child);
            man.setImageResource(R.drawable.galka);
        }
        if (curr2 == 3) {
            woman.setImageResource(R.drawable.woman);
            man.setImageResource(R.drawable.galka);
        }
        galka2 = 1;
        curr2 = 1;

    }


    public void Child(View view) {
        turuzm.setVisibility(View.VISIBLE);
        komandirovka.setVisibility(View.VISIBLE);
        plyazh.setVisibility(View.VISIBLE);
        if (galka2 == 0) child.setImageResource(R.drawable.galka);
        else if (curr2 == 1) {
            man.setImageResource(R.drawable.man);
            child.setImageResource(R.drawable.galka);
        }
        if (curr2 == 3) {
            woman.setImageResource(R.drawable.woman);
            child.setImageResource(R.drawable.galka);
        }
        galka2 = 1;
        curr2 = 2;

    }


    public void Woman(View view) {
        turuzm.setVisibility(View.VISIBLE);
        komandirovka.setVisibility(View.VISIBLE);
        plyazh.setVisibility(View.VISIBLE);
        if (galka2 == 0) woman.setImageResource(R.drawable.galka);
        else if (curr2 == 1) {
            man.setImageResource(R.drawable.man);
            woman.setImageResource(R.drawable.galka);
        }

        if (curr2 == 2) {
            child.setImageResource(R.drawable.child);
            woman.setImageResource(R.drawable.galka);

        }
        galka2 = 1;
        curr2 = 3;

    }

    /////////////////////////////////////////////////////////////
    public void turizm(View view) {
     //   if (galka3 == 0)
          turuzm.setImageResource(R.drawable.galka);
      //  else
            if (curr2 == 2) {
            komandirovka.setImageResource(R.drawable.komandirovka);
            turuzm.setImageResource(R.drawable.galka);
        }
        if (curr2 == 3) {
            plyazh.setImageResource(R.drawable.plyazh);
            turuzm.setImageResource(R.drawable.galka);
        }
        galka3 = 1;
        curr3 = 1;
        alo = 0;
        CONTINUE();
    }


    public void komandirovka(View view) {
      //  if (galka3 == 0)
            komandirovka.setImageResource(R.drawable.galka);
       // else
        if (curr3 == 1) {
            turuzm.setImageResource(R.drawable.turizm);
            komandirovka.setImageResource(R.drawable.galka);
        }
        if (curr3 == 3) {
            plyazh.setImageResource(R.drawable.plyazh);
            komandirovka.setImageResource(R.drawable.galka);
        }
        galka3 = 1;
        curr3 = 2;
        alo = 0;
        CONTINUE();
    }

    public void plyazh(View view) {
       // if (galka3 == 0)
            plyazh.setImageResource(R.drawable.galka);
        //else
            if (curr3 == 1) {
            turuzm.setImageResource(R.drawable.turizm);
            plyazh.setImageResource(R.drawable.galka);
        }

        if (curr3 == 2) {
            komandirovka.setImageResource(R.drawable.komandirovka);
            plyazh.setImageResource(R.drawable.galka);

        }
        galka3 = 1;
        curr3 = 3;
        alo = 0;
        CONTINUE();
    }

    public void CONTINUE() {


        if (editText.length() != 0) {


            String DAYSTRING = editText.getText().toString();

            try {
                DAY = Integer.parseInt(DAYSTRING);
            } catch (Exception e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Error: ошибка в написании числа дней", Toast.LENGTH_SHORT);

                toast.show();
                turuzm.setImageResource(R.drawable.turizm);
                komandirovka.setImageResource(R.drawable.komandirovka);
                plyazh.setImageResource(R.drawable.plyazh);
                editText.setText("");
                alo = 1;
            }

            if (alo == 0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Внимание!");
                builder.setMessage("Вы уверены, что хотите продолжить?");

                builder.setPositiveButton("ДА", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do do my action here

                        Intent i = new Intent(MainActivity.this, DynamicResult.class);

                        i.putExtra("curr1", curr);
                        i.putExtra("curr2", curr2);
                        i.putExtra("curr3", curr3);
                        i.putExtra("DAY", DAY);

                        startActivity(i);


                    }


                });

                builder.setNegativeButton("НЕТ", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        turuzm.setImageResource(R.drawable.turizm);
                        komandirovka.setImageResource(R.drawable.komandirovka);
                        plyazh.setImageResource(R.drawable.plyazh);
                        dialog.dismiss();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Укажите число дней", Toast.LENGTH_SHORT);
            toast.show();
            turuzm.setImageResource(R.drawable.turizm);
            komandirovka.setImageResource(R.drawable.komandirovka);
            plyazh.setImageResource(R.drawable.plyazh);
        }
    }


}