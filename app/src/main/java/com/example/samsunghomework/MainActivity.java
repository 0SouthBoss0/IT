package com.example.samsunghomework;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.samsunghomework.R.id.*;

public class MainActivity extends AppCompatActivity {
    ImageButton winter;
    ImageButton middle;
    ImageButton summer;
    ImageButton three;
    ImageButton seven;
    ImageButton fourteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winter = (ImageButton) findViewById(R.id.winter);
        middle = (ImageButton) findViewById(Middle);
        summer = (ImageButton) findViewById(Summer);
        three = (ImageButton) findViewById(R.id.three);
        seven = (ImageButton) findViewById(R.id.seven);
        fourteen = (ImageButton) findViewById(R.id.fourteen);
    }


    int galka = 0;
    int curr = 0;

    public void Winter(View view) {
        if (galka == 0) winter.setImageResource(R.drawable.galka);
        else if (curr == 2) {
            middle.setImageResource(R.drawable.listok);
            winter.setImageResource(R.drawable.galka);
        }
        if (curr == 3) {
            summer.setImageResource(R.drawable.unnamed);
            winter.setImageResource(R.drawable.galka);
        }
        galka = 1;
        curr = 1;

    }


    public void Middle(View view) {
        if (galka == 0) middle.setImageResource(R.drawable.galka);
        else if (curr == 1) {
            winter.setImageResource(R.drawable.snejinka);
            middle.setImageResource(R.drawable.galka);
        }
        if (curr == 3) {
            summer.setImageResource(R.drawable.unnamed);
            middle.setImageResource(R.drawable.galka);
        }
        galka = 1;
        curr = 2;
    }

    public void Summer(View view) {
        if (galka == 0) summer.setImageResource(R.drawable.galka);
        else if (curr == 1) {
            winter.setImageResource(R.drawable.snejinka);
            summer.setImageResource(R.drawable.galka);
        }

        if (curr == 2) {
            middle.setImageResource(R.drawable.listok);
            summer.setImageResource(R.drawable.galka);

        }
        galka = 1;
        curr = 3;
    }

}



