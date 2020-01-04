package com.example.samsunghomework;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ImageView iv = new ImageView(this);
        setContentView(iv);
        Thread t = new Thread()  {
            @Override
            public void run() {
                try {
                    final Bitmap bitmap = BitmapFactory.decodeStream(new URL("https://memepedia.ru/wp-content/uploads/2017/05/%D1%80%D0%B8%D0%BA%D1%80%D0%BE%D0%BB%D0%BB.png").openStream());
                    iv.post(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageBitmap(bitmap);
                        }
                    });
                } catch (Exception e) { e.printStackTrace(); }
            };
        };
        t.start();
    }
}