package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity6 extends AppCompatActivity {
    private TextView Result;
    private EditText Number;
int i,n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Result=(TextView)findViewById(R.id.textView16);
        Number=(EditText)findViewById(R.id.textView19);


        Button buttB=(Button) findViewById(R.id.button19);
        Button butt1=(Button) findViewById(R.id.button20);
        Button butt3=(Button) findViewById(R.id.button21);



        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity6.this,MainActivity2.class);
                startActivity(intent);

            }
        });


//even or odd
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num;
                num=Integer.parseInt(Number.getText().toString());

                // true if num is perfectly divisible by 2
                if(num % 2 == 0)
                    Result.setText(String.valueOf(num+"\t"+"Number is Even."));
                else
                    Result.setText(String.valueOf(num+"\t"+"Number is Odd."));
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(String.valueOf(""));
                Result.setText(String.valueOf(""));
            }
        });
    }
}