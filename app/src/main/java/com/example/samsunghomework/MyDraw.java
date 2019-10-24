package com.example.samsunghomework;

;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyDraw extends View {


    MyDraw(Context context) {
        super(context);

    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        int N = 10;
        @SuppressLint("DrawAllocation") float[] x = new float[N];
        @SuppressLint("DrawAllocation") float[] y = new float[N];
        @SuppressLint("DrawAllocation") float[] vx = new float[N];
        @SuppressLint("DrawAllocation") float[] vy = new float[N];
        for (int i = 0; i < N; i++) {
            x[i] = (float) (Math.random() * 500);
            y[i] = (float) (Math.random() * 500);
            vx[i] = (float) (Math.random() * 6 - 3);
            vy[i] = (float) (Math.random() * 6 - 3);

        }
        for (int j = 0; j < N; j++) {
            canvas.drawCircle(x[j], y[j], 40, paint);
        }

        for (int k = 0; k < N; k++) {
            x[k] += vx[k];
            y[k] += vy[k];
        }

        invalidate();
    }
}


