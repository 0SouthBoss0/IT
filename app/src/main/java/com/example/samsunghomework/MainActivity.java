package com.example.samsunghomework;


import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;


import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int[] array = new int[11];
                        TextView itog = findViewById(R.id.result);
                        TextView ERROR = findViewById(R.id.ERROR);
                        CheckBox mirage = (CheckBox) findViewById(R.id.mirage);
                        CheckBox cache = (CheckBox) findViewById(R.id.cache);
                        CheckBox inferno = (CheckBox) findViewById(R.id.inferno);
                        CheckBox overpass = (CheckBox) findViewById(R.id.overpass);
                        CheckBox train = (CheckBox) findViewById(R.id.train);
                        CheckBox nuke = (CheckBox) findViewById(R.id.nuke);
                        CheckBox vertigo = (CheckBox) findViewById(R.id.vertigo);
                        CheckBox dust = (CheckBox) findViewById(R.id.dust);
                        CheckBox cobblestone = (CheckBox) findViewById(R.id.cobblestone);
                        CheckBox office = (CheckBox) findViewById(R.id.office);
                        CheckBox agency = (CheckBox) findViewById(R.id.agency);
                        if (mirage.isChecked()) array[0] = 1;
                        if (cache.isChecked()) array[1] = 1;
                        if (inferno.isChecked()) array[2] = 1;
                        if (overpass.isChecked()) array[3] = 1;
                        if (train.isChecked()) array[4] = 1;
                        if (nuke.isChecked()) array[5] = 1;
                        if (vertigo.isChecked()) array[6] = 1;
                        if (dust.isChecked()) array[7] = 1;
                        if (cobblestone.isChecked()) array[8] = 1;
                        if (office.isChecked()) array[9] = 1;
                        if (agency.isChecked()) array[10] = 1;
                        int check = 0;
                        int sum = 0;
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] == 0) sum++;
                        }


                        if (sum == 0) {
                            ERROR.setText("ВЫ ВЫБРАЛИ ВСЕ КАРТЫ, НЕОБХОДИМО ОСТАВИТЬ ХОТЯ БЫ ОДНУ");
                            check++;
                        }          // SUM OKEY SUM OKEY SUM OKEY

                        if (check == 0) {


                            int gotov[] = new int[sum];
                            for (int i = 0; i < array.length; i++) {
                                if (array[i] == 0) {
                                    for (int j = 0; j < gotov.length; j++) {
                                        if (gotov[j] == 0) {
                                            gotov[j] = i + 1;
                                            break;
                                        }
                                    }
                                }
                            }//закрыли
                            Random random = new Random();
                            int q = (random.nextInt(gotov.length));


                            int hohol = gotov[q];
                            if (hohol == 1) ERROR.setText("Mirage");
                            if (hohol == 2) ERROR.setText("Cache");
                            if (hohol == 3) ERROR.setText("Inferno");
                            if (hohol == 4) ERROR.setText("Overpass");
                            if (hohol == 5) ERROR.setText("Train");
                            if (hohol == 6) ERROR.setText("Nuke");
                            if (hohol == 7) ERROR.setText("Vertigo");
                            if (hohol == 8) ERROR.setText("Dust II");
                            if (hohol == 9) ERROR.setText("Cobblestone");
                            if (hohol == 10) ERROR.setText("Office");
                            if (hohol == 11) ERROR.setText("Agency");
                            String qq = String.valueOf(q); // q - рандом число , qq- стринга


                        }
                    }
                });
    }



}
