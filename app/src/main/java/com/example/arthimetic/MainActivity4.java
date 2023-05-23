package com.example.arthimetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Number = (EditText) findViewById(R.id.textView102);
        Result = (TextView) findViewById(R.id.textView39);



        Button buttB = (Button) findViewById(R.id.button13);
        Button butt1 = (Button) findViewById(R.id.button14);
        Button butt2 = (Button) findViewById(R.id.button15);



        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int n1=0,n2=1,n3,i,number;
                number=Integer.parseInt(Number.getText().toString());
                Result.append("\t"+n1);
                Result.append(","+n2+"\t");
                for(i=2;i<number;++i)
                {
                    n3=n1+n2;
                    Result.append(","+ n3 +"\t");
                    n1=n2;
                    n2=n3;
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