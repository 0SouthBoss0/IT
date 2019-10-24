package com.example.samsunghomework;

;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyDraw extends View {

    //конструктор – обсуждается в курсе позднее
    MyDraw(Context context) {
        super(context);
    }


    Paint paint = new Paint();
    float x = 0;

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(x, 300, 20, paint);
        // готовим x для следущего кадра
        x += 5f;
        invalidate();
    }
}




