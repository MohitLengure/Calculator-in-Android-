package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button butt1=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button);
        Button butt3=(Button) findViewById(R.id.button2);
        Button butt4=(Button) findViewById(R.id.button6);
        Button butt5=(Button) findViewById(R.id.button7);
        Button butt6=(Button) findViewById(R.id.button9);
        Button butt7=(Button) findViewById(R.id.button4);
        Button butt8=(Button) findViewById(R.id.button49);
        Button butt9=(Button) findViewById(R.id.button12);
        Button butt10=(Button) findViewById(R.id.button10);
        Button butt11=(Button) findViewById(R.id.button47);
        Button butt12=(Button) findViewById(R.id.button5);
        Button butt13=(Button) findViewById(R.id.button11);
        Button butt14=(Button) findViewById(R.id.button38);
        Button butt15=(Button) findViewById(R.id.button37);
        Button butt16=(Button) findViewById(R.id.button51);
        Button butt17=(Button) findViewById(R.id.button8);


        //On click
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,LoginActivity.class);
                startActivity(intent);

            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);

            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);

            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);

            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);

            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);

            }
        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity7.class);
                startActivity(intent);

            }
        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity8.class);
                startActivity(intent);

            }
        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity9.class);
                startActivity(intent);

            }
        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity10.class);
                startActivity(intent);

            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity11.class);
                startActivity(intent);

            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity12.class);
                startActivity(intent);

            }
        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity13.class);
                startActivity(intent);

            }
        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity14.class);
                startActivity(intent);

            }
        });
        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity18.class);
                startActivity(intent);

            }
        });
        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity20.class);
                startActivity(intent);

            }
        });
        butt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity21.class);
                startActivity(intent);

            }
        });
    }
}