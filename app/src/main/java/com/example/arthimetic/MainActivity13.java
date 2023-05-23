package com.example.arthimetic;
//palindrome program
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity13 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        Result = (TextView) findViewById(R.id.textView35);
        Number = (EditText) findViewById(R.id.textView34);

        Button buttB = (Button) findViewById(R.id.button36);
        Button butt1 = (Button) findViewById(R.id.button39);
        Button butt2 = (Button) findViewById(R.id.button40);


        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity13.this, MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n,r,sum=0,temp;
                n=Integer.parseInt(Number.getText().toString());
                temp=n;
                while(n>0)
                {
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                    Result.setText(String.valueOf(temp+"is palindrome "));
                else
                    Result.setText(String.valueOf(temp+" is not palindrome "));

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