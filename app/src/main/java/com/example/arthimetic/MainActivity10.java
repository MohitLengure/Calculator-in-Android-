package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    int n, reverse=0, rem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Result = (TextView) findViewById(R.id.textView31);
        Number = (EditText) findViewById(R.id.textView29);

        Button buttB = (Button) findViewById(R.id.button33);
        Button butt1 = (Button) findViewById(R.id.button34);
        Button butt2 = (Button) findViewById(R.id.button35);


        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(Number.getText().toString());
                while(n!=0)
                {   rem=n%10;
                    reverse=reverse*10+rem;
                    n/=10;
                }
                Result.setText(String.valueOf(reverse));
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