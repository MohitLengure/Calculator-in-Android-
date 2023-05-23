package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    int n, i, m=0, flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Result = (TextView) findViewById(R.id.textView28);
        Number = (EditText) findViewById(R.id.textView27);

        Button buttB = (Button) findViewById(R.id.button30);
        Button butt1 = (Button) findViewById(R.id.button31);
        Button butt2 = (Button) findViewById(R.id.button32);


        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity9.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=Integer.parseInt(Number.getText().toString());
                m=n/2;
                for(i = 2; i <= m; i++)
                {
                    if(n % i == 0)
                    {
                        Result.setText(String.valueOf("Number is Not Prime"));
                        flag=1;
                        break;
                    }
                }
                if (flag==0)
                    Result.setText(String.valueOf("Number is Prime"));

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