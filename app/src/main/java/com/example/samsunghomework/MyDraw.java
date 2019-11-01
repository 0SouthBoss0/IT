package com.example.samsunghomework;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {

    int N = 50; // количество шариков
    float[] x = new float[N];
    float[] y = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];

    public MyDraw(Context context) {
        super(context);
        for (int i = 0; i < N; i++) {
            x[i] = (float) (Math.random() * 500);
            y[i] = (float) (Math.random() * 500);
            vx[i] = (float) (Math.random() * 6 - 3);
            vy[i] = (float) (Math.random() * 6 - 3);
        }

    }

    void add(float[] array, float[] values) {
        for (int i = 0; i < array.length; i++) {
            array[i] += values[i];
        }
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        // отрисовываем все шарики
        drawBalls(canvas);
        // готовим массивы x и у для следующего кадра
        add(x, vx);
        add(y, vy);
        // запрашиваем перерисовку
        invalidate();
    }

    private void drawBalls(Canvas canvas) {
        for (int i = 0; i < N; i++) {
            canvas.drawCircle(x[i], y[i], 20, paint);
        }
    }
}