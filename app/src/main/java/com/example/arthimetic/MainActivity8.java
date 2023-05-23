package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;;

public class MainActivity8 extends AppCompatActivity {
    private TextView Result;
    private EditText Year;
    int year;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Result=(TextView)findViewById(R.id.textView26);
        Year=(EditText)findViewById(R.id.textView22);

        Button buttB=(Button) findViewById(R.id.button27);
        Button butt1=(Button) findViewById(R.id.button28);
        Button butt2=(Button) findViewById(R.id.button29);
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity8.this,MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                year=Integer.parseInt(Year.getText().toString());
                if(((year%4==0) && ((year%400==0) || (year%100!=0))))
                {
                    Result.setText(String.valueOf("Year is Leap Year "));
                } else {
                    Result.setText(String.valueOf("Year is not a leap year"));
                }
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(String.valueOf(""));
                Year.setText(String.valueOf(""));

            }
        });
    }

}