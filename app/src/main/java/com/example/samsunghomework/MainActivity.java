 package com.example.samsunghomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.samsunghomework.R;
import com.example.samsunghomework.Sit;

import org.w3c.dom.Text;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity
{
    public TextView title, tZ, tE;
    public Button but1, but2, but3;
    public Sit current;
    public int z, e;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView)findViewById(R.id.title);
        but1 = (Button)findViewById(R.id.but1);
        but2 = (Button)findViewById(R.id.but2);
        but3 = (Button)findViewById(R.id.but3);
        int next[] = { 2, 3, 43 };
        current = new Sit(1, next);
        e = 25;
        z = 0;
        setText();
    }
    private void setText()
    {
        z += current.getZ();
        e += current.getE();
        title.setText(current.getTitle());

        if (current.getDeadlock())
        {
            but1.setText("");
            but2.setText("");
            but3.setText("");
        }
        else
        {
            but1.setText(current.getAction(0));
            but2.setText(current.getAction(1));
            but3.setText(current.getAction(2));
        }
    }
    private void end(int s)
    {
        Intent i = new Intent(MainActivity.this, Result.class);
        i.putExtra("end", Integer.toString(s));
        startActivity(i);
    }
    public void click1(View view)
    {
        if (current.getDeadlock())
        {
            end(current.getId());
        }
        else
        {
            current = current.getNext(1);
            setText();
        }
    }
    public void click2(View view)
    {
        if (current.getDeadlock())
        {
            end(current.getId());
        }
        else
        {
            current = current.getNext(2);
            setText();
        }
    }
    public void click3(View view)
    {
        if (current.getDeadlock())
        {
            end(current.getId());
        }
        else
        {
            current = current.getNext(3);
            setText();
        }
    }
}
