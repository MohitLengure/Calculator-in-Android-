package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity15 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        Number = (EditText) findViewById(R.id.textView34);
        Result = (TextView) findViewById(R.id.textView35);

        Button buttB = (Button) findViewById(R.id.button36);
        Button butt1 = (Button) findViewById(R.id.button39);
        Button butt2 = (Button) findViewById(R.id.button40);


        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity15.this, MainActivity14.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Area,r,pi=3.14;
                r=Float.parseFloat(Number.getText().toString());
                double ra=r*r;
                Area = pi*ra;
                    Result.setText(String.valueOf(Area));
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(String.valueOf(""));
                Result.setText(String.valueOf(""));

            }
        });
    }
}