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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winter = (ImageButton) findViewById(R.id.winter);
        middle = (ImageButton) findViewById(Middle);
        summer = (ImageButton) findViewById(Summer);

    }

    int FIRST = 0;

    public void Winter(View view) {
        FIRST = 1;
        toSecond();

    }


    public void Middle(View view) {
        FIRST = 1;
        toSecond();
    }

    public void Summer(View view) {
        FIRST = 1;
        toSecond();
    }

    public void toSecond() {

    }
}



