package com.example.samsunghomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
    }


    public void onClick(View view) {

        EditText LOGINJUST = findViewById(R.id.editText1);
        EditText PASSWORDJUST = findViewById(R.id.editText2);
        String newlogin = LOGINJUST.getText().toString();
        String newpassword = PASSWORDJUST.getText().toString();
        Intent i = new Intent();
        i.putExtra("editText1", newlogin);
        i.putExtra("editText2", newpassword);
        setResult(RESULT_OK, i);

        finish();
    }


}
