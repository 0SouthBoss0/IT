package com.example.samsunghomework;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        int check = 0;
        final String s1 = "southboss";
        final String s2 = "klass";

        TextView itog = findViewById(R.id.qqq);

        EditText LOGINJUST = findViewById(R.id.editText1);
        EditText PASSWORDJUST = findViewById(R.id.editText2);

        String LOGIN = LOGINJUST.getText().toString();
        String PASSWORD = PASSWORDJUST.getText().toString();
        if ((LOGIN.equals(s1)) && (PASSWORD.equals(s2) || (LOGIN.equals(s1)) && (PASSWORD.equals(s2)))) {

            itog.setTextColor(GREEN);
            itog.setText("WELCOME");
            itog.invalidate();
            LOGINJUST.setText("");
            PASSWORDJUST.setText("");
            check = 1;
        } else {
            itog.setTextColor(RED);
            itog.setText("INCORRECT");
            itog.invalidate();
            LOGINJUST.setText("");
            PASSWORDJUST.setText("");
        }
        if (check == 0) {
            Intent i = new Intent(MainActivity.this, Registration.class);
            startActivityForResult(i, 1);

        }


    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode) {
            case RESULT_OK:
                EditText LOGINJUST = findViewById(R.id.editText1);
                EditText PASSWORDJUST = findViewById(R.id.editText2);
                LOGINJUST.setText(data.getStringExtra("editText1"));
                final String qqlog = (data.getStringExtra("editText1"));
                final String qqpas = (data.getStringExtra("2"));

                break;
        }
    }
}