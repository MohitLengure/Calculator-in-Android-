package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity20 extends AppCompatActivity {
private EditText Number;
private TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        Number=(EditText) findViewById(R.id.edittext12);
        Result=(TextView) findViewById(R.id.textView59);


        Button buttB = (Button) findViewById(R.id.button50);
        Button butts=(Button) findViewById(R.id.button52);
        Button buttcl=(Button) findViewById(R.id.button53);

        buttB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity20.this, MainActivity2.class);
            startActivity(intent);
        }
    });
        butts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n,r;
                n=Integer.parseInt(Number.getText().toString());
                if (n<0) {
                    Result.setText(String.valueOf("Number is Negative"));

                }
                else if(n>0)
                {
                    Result.setText(String.valueOf("Number is Positive."));
                }
                else if(n == 0)
                {
                    Result.setText(String.valueOf("Number is Zero."));
                }
                else {
                    Result.setText(String.valueOf("Number is invalid."));
                }
            }
        });
        buttcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(String.valueOf(""));
                Result.setText(String.valueOf(""));
            }
        });

    }
}