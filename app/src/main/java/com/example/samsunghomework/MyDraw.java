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

    long lastTime = System.currentTimeMillis();

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(x, 300, 20, paint);
        long nowTime = System.currentTimeMillis();
        x += 0.01f * (nowTime - lastTime);
        lastTime = nowTime;
        invalidate();
    }
}




