package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity21 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        Number = (EditText) findViewById(R.id.editTextNumber);
        Result = (TextView) findViewById(R.id.textView63);

        Button buttB = (Button) findViewById(R.id.button54);
        Button butt1 = (Button) findViewById(R.id.button55);
        Button butt2 = (Button) findViewById(R.id.button56);



        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity21.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i,n;
                int ans = 0;
                n=Integer.parseInt(Number.getText().toString());
                for ( i = 1; i <= 10; i++) {
                    ans = (i * n);
                    Result.append(n + " X " + i
                            + " = " + ans + "\n\n");
                }
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