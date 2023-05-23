package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    EditText Num;
    int i,fact=1,number,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //click
        Result=(TextView)findViewById(R.id.textView14);
        Number=(EditText)findViewById(R.id.textView13);

        Button buttB=(Button) findViewById(R.id.button16);
        Button butt1=(Button) findViewById(R.id.button17);
        Button butt2=(Button) findViewById(R.id.button18);
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity5.this,MainActivity2.class);
                startActivity(intent);

            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                number=Integer.parseInt(Number.getText().toString());
                for(i=1;i<=number;i++){
                    fact=fact*i;
                }
                Result.setText(String.valueOf(fact));
            }
        });
        //claer
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(String.valueOf(""));
                Number.setText(String.valueOf(""));

            }
        });
    }

    }
