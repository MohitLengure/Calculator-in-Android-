package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView Result;
    private EditText FNumber;
    private EditText SNumber;
    EditText firstnum,secondnum;

    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result=(TextView)findViewById(R.id.Result);
        FNumber=(EditText)findViewById(R.id.first);
        SNumber=(EditText)findViewById(R.id.second);

        firstnum=(EditText) findViewById(R.id.first);
        secondnum=(EditText) findViewById(R.id.second);


        //Button finder
        Button buttB=(Button) findViewById(R.id.buttonBack);
        Button butt1=(Button) findViewById(R.id.buttonadd);
        Button butt2=(Button) findViewById(R.id.buttonsub);
        Button butt3=(Button) findViewById(R.id.buttonMul);
        Button butt4=(Button) findViewById(R.id.buttonDiv);
        Button butt5=(Button) findViewById(R.id.buttonClear);
//Back
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });

        //ADD
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(firstnum.getText().toString());
                b=Integer.parseInt(secondnum.getText().toString());
                c=a+b;
                Result.setText(String.valueOf(c));
            }
        });
            //Sub
             butt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    a=Integer.parseInt(firstnum.getText().toString());
                    b=Integer.parseInt(secondnum.getText().toString());
                    c=a-b;
                    Result.setText(String.valueOf(c));
                }
        });
        //Mul
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(firstnum.getText().toString());
                b=Integer.parseInt(secondnum.getText().toString());
                c=a*b;
                Result.setText(String.valueOf(c));
            }
        });
        //DIV
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float e;
                float f;
                float g;
                e=Integer.parseInt(firstnum.getText().toString());
                f=Integer.parseInt(secondnum.getText().toString());

                g=e/f;

                Result.setText(String.valueOf(g));
            }
        });

        //claer
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FNumber.setText("");
                SNumber.setText("");
                Result.setText("");

            }
        });
    }
}