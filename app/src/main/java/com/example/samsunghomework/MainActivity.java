package com.example.samsunghomework;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.samsunghomework.R.id.*;

public class MainActivity extends AppCompatActivity {
    ImageButton winter;
    ImageButton middle;
    ImageButton summer;
    ImageButton man;
    ImageButton child;
    ImageButton woman;
    LinearLayout mainlayout;


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
        mainlayout = (LinearLayout) findViewById(R.id.mainlayout);
        man = (ImageButton) findViewById(R.id.man);
        child = (ImageButton) findViewById(R.id.child);
        woman = (ImageButton) findViewById(R.id.woman);

    }


    int galka = 0;
    int curr = 0;

    public void Winter(View view) {
        //   mainlayout.removeAllViews();
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

    int galka2 = 0;
    int curr2 = 0;


    public void Man(View view) {
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

}




