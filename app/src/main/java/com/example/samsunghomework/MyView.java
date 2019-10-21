package com.example.samsunghomework;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class MyView extends View {

    MyView(Context context) {
        super(context);

    }


    @Override


    protected void onDraw(Canvas canvas) {
        int y = 0;
        while (y < getHeight()) {
            @SuppressLint("DrawAllocation") Paint paint = new Paint();
            canvas.drawLine(0, y, getWidth() - y, getHeight(), paint);
            y += 30;
        }
        int x = 0;
        while (x < getWidth()) {
            @SuppressLint("DrawAllocation") Paint paint = new Paint();
            canvas.drawLine(x, 0, getWidth(), getHeight() - x, paint);
            x += 30;

        }
    }
}












