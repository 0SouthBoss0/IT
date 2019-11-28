package com.example.samsunghomework;


import android.os.Bundle;

import android.view.View;

import android.widget.EditText;

import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View view) {
        TextView itog = findViewById(R.id.qqq);
        EditText aaa = findViewById(R.id.editText1);
        EditText bbb = findViewById(R.id.editText2);
        EditText ccc = findViewById(R.id.editText3);
        String aa = aaa.getText().toString();
        String bb = bbb.getText().toString();
        String cc = ccc.getText().toString();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);

        double D = b * b - 4 * a * c;
        if (D < 0) {
            itog.setText("Корней нет");

        }
        if (D == 0) {

            double x = -b / (2 * a);

            itog.setText((int) x);


        }

        if (D > 0) {
            D = Math.sqrt(D);
            double x1 = ((-b - D) / (2 * a));
            double x2 = ((-b + D) / (2 * a));
            int x1int = 0;
            int x2int = 0;
            int flag1 = 0;
            int flag2 = 0;
            if ((int) x1 == (x1)) {
                x1int = (int) x1;
                flag1 = 1;
            }
            if ((int) x2 == (x2)) {
                x2int = (int) x2;
                flag2 = 1;
            }


            if ((flag1 == 0) && (flag2 == 0)) {
                if (x1 > x2) {
                    itog.setText((x2) + " ; " + (x1));

                } else {
                    itog.setText((x1) + " ; " + (x2));

                }

            }
            if ((flag1 == 1) && (flag2 == 0)) {
                if (x1 > x2) {
                    itog.setText((x2) + " ; " + (x1int));

                } else {
                    itog.setText((x1int) + " ; " + (x2));

                }

            }
            if (flag1 == 0) {
                if (x1 > x2) {
                    itog.setText((x2int) + " ; " + (x1));

                } else {
                    itog.setText((x1) + " ; " + (x2int));

                }

            }
            if ((flag1 == 1) && (flag2 == 1)) {
                if (x1 > x2) {
                    itog.setText((x2int) + " ; " + (x1int));

                } else {
                    itog.setText((x1int) + " ; " + (x2int));

                }

            }
        }
    }
}
