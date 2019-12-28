package com.example.samsunghomework;


import android.os.Bundle;

import android.view.View;


import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

/////////////////////////////////////////////////////////////////////////////
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onClick(View view) {
        TextView q = findViewById(R.id.q);
        TextView w = findViewById(R.id.w);
        TextView e = findViewById(R.id.e);
        TextView r = findViewById(R.id.r);
        TextView t = findViewById(R.id.t);
        TextView y = findViewById(R.id.y);

        Random random = new Random();

        int morkov = (random.nextInt(10));
        int moloko = (random.nextInt(10));
        int kartofan = (random.nextInt(10));
        int lyk = (random.nextInt(10));
        int xleb = (random.nextInt(10));
        int dirol = (random.nextInt(5));
        terminal(moloko, morkov, kartofan, lyk, xleb, dirol);
        morkovH(morkov);
        molokoH(moloko);
        kartofanH(kartofan);
        lykH(lyk);
        xlebH(xleb);
        dirolH(dirol);
        ////////// DEBUGGENO ////////////////


    }
////////////////////////////////////////////////////////////


    public void terminal(int morkov, int moloko, int lyk, int kartofan, int xleb, int dirol) {
        Random random = new Random();

        TextView q = findViewById(R.id.q);
        TextView w = findViewById(R.id.w);
        TextView e = findViewById(R.id.e);
        TextView r = findViewById(R.id.r);
        TextView t = findViewById(R.id.t);
        TextView y = findViewById(R.id.y);
        ////////// DEBUGGENO ////////////////

        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (random.nextInt(5));
            if (array[i] == 0) morkovH(i);
            if (array[i] == 1) molokoH(i);
            if (array[i] == 2) kartofanH(i);
            if (array[i] == 3) lykH(i);
            if (array[i] == 4) xlebH(i);
            if (array[i] == 5) dirolH(i);
        }

    }

    private void morkovH(int i, int morkov) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }

    }

    private void molokoH(int i, int moloko) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }

    }

    private void kartofanH(int i, int kartofan) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }

    }


    private void lykH(int i, int lyk) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }

    }

    private void xlebH(int i, int xleb) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }

    }

    private void dirolH(int i, int dirol) {
        Random random = new Random();
        int qwertyuiop = 0;
        while (qwertyuiop == 0) {
            qwertyuiop = (random.nextInt(3));
        }
    }


}


