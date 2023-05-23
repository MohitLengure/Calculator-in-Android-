package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity12 extends AppCompatActivity {
    private TextView Square;
    private TextView Squareroot;
    private EditText Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Square = (TextView) findViewById(R.id.textView35);
        Squareroot = (TextView) findViewById(R.id.textView37);
        Number = (EditText) findViewById(R.id.textView34);

        Button buttB = (Button) findViewById(R.id.button36);
        Button butt1 = (Button) findViewById(R.id.button39);
        Button butt2 = (Button) findViewById(R.id.button40);
        buttB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity12.this, MainActivity2.class);
            startActivity(intent);
        }
    });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //square
                int n,a;
                n=Integer.parseInt(Number.getText().toString());
                a=n*n;
                Square.setText(String.valueOf(a));

                //square root
                double t;
                double sqrtroot=n/2;
                do
                {
                    t=sqrtroot;
                    sqrtroot=(t+(n/t))/2;
                }
                while((t-sqrtroot)!= 0);
                Squareroot.setText(String.valueOf(sqrtroot));
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(String.valueOf(""));
                Square.setText(String.valueOf(""));
                Squareroot.setText(String.valueOf(""));

            }
        });
    }
}