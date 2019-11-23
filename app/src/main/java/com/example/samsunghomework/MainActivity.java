package com.example.samsunghomework;


import android.content.Context;
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

        ;
        final String s1 = "southboss";
        final String s2 = "klass";

        TextView itog = findViewById(R.id.qqq);

        EditText LOGINJUST = findViewById(R.id.editText1);
        EditText PASSWORDJUST = findViewById(R.id.editText2);

        String LOGIN = LOGINJUST.getText().toString();
        String PASSWORD = PASSWORDJUST.getText().toString();
        if ((LOGIN.equals(s1)) && (PASSWORD.equals(s2))) {

            itog.setTextColor(GREEN);
            itog.setText("WELCOME");
            itog.invalidate();
            LOGINJUST.setText ("");
            PASSWORDJUST.setText("");

        } else {
            itog.setTextColor(RED);
            itog.setText("INCORRECT");
            itog.invalidate();
            LOGINJUST.setText ("");
            PASSWORDJUST.setText("");
        }
    }


}