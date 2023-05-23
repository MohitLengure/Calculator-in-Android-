package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView Result;
    private EditText FNumber;
    private EditText SNumber;
    private EditText TNumber;
    private TextView Result4;
    double a,b,c,d,e;
    EditText firstnum,secondnum,thirdnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Result=(TextView)findViewById(R.id.Result);
        Result4=(TextView)findViewById(R.id.Result4);
        FNumber=(EditText)findViewById(R.id.first);
        SNumber=(EditText)findViewById(R.id.second);
        TNumber=(EditText)findViewById(R.id.second2);


        firstnum=(EditText) findViewById(R.id.first);
        secondnum=(EditText) findViewById(R.id.second);
        thirdnum=(EditText) findViewById(R.id.second2);


        //Button finder
        Button buttB=(Button) findViewById(R.id.buttonBack);
        Button butt1=(Button) findViewById(R.id.buttonsubmit);
        Button butt2=(Button) findViewById(R.id.buttonClear);

        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(firstnum.getText().toString());
                b=Double.parseDouble(secondnum.getText().toString());
                c=Double.parseDouble(thirdnum.getText().toString());
                d=(a*b*c)/100;
                e=d+a;
                Result.setText(String.valueOf(d));
                Result4.setText(String.valueOf(e));
            }
        });
        //claer
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FNumber.setText(String.valueOf(""));
                SNumber.setText(String.valueOf(""));
                TNumber.setText(String.valueOf(""));
                Result.setText(String.valueOf(""));
                Result4.setText(String.valueOf(""));

            }
        });
    }
}