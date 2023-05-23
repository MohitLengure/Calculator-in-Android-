package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Button buttB=(Button) findViewById(R.id.button41);
        Button butt1=(Button) findViewById(R.id.button42);//area of circle
        Button butt2=(Button) findViewById(R.id.button43);//area of triangle
        Button butt3=(Button) findViewById(R.id.button44);//area of rectangle

        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity14.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity14.this, MainActivity15.class);
                startActivity(intent);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity14.this, MainActivity16.class);
                startActivity(intent);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity14.this, MainActivity17.class);
                startActivity(intent);
            }
        });
    }
}