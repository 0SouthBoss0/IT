package com.example.samsunghomework;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    QQ qq = new QQ();
    int CRACK = 0;
    int i = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.txt);
        final Button button1 = findViewById(R.id.bt1);
        Button button2 = findViewById(R.id.bt2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {

                if (CRACK == 0) {
                    qq.execute();
                } else {
                    i = 0;
                    CRACK = 0;
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                qq.cancel();

                TextView txt = findViewById(R.id.txt);
                txt.setText("0");
            }
        });
    }


    public void onProgressUpdate(Integer qqq) {

        TextView txt = findViewById(R.id.txt);
        Integer qqqq = qqq;
        txt.setText(String.valueOf(qqqq));

    }


    private class QQ extends AsyncTask<Integer, Integer, Integer> { ///
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


        protected Integer doInBackground(Integer... args) {
            for (int i = 0; i < 1000000; i++) {

                try {
                    Thread.sleep(1000); ///задержка
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                peredacha1(i);

            }


            return null;
        }

        private void peredacha1(Integer i) {
            Integer qq = i;
            peredacha2(qq);
        }
    }


    private void peredacha2(Integer qq) {
        Integer qqq = qq;
        onProgressUpdate(qqq);
    }


}

