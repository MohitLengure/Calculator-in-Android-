package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity7 extends AppCompatActivity {
    private EditText Fahrenheit;
    private EditText Celsius;
   float F,C;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Fahrenheit = (EditText) findViewById(R.id.textView17);
        Celsius = (EditText) findViewById(R.id.textView15);

        Button buttB = (Button) findViewById(R.id.button23);
        Button butt1 = (Button) findViewById(R.id.button25);
        Button butt2 = (Button) findViewById(R.id.button24);
        Button butt3 = (Button) findViewById(R.id.button26);

        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F=Float.parseFloat(Fahrenheit.getText().toString());
                C = ((F-32)*5)/9;
                Celsius.setText(String.valueOf(C));

            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C=Float.parseFloat(Celsius.getText().toString());
                F= ((C*9)/5)+32;
                Fahrenheit.setText(String.valueOf(F));

            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fahrenheit.setText(String.valueOf(""));
                Celsius.setText(String.valueOf(""));

            }
        });
    }
}