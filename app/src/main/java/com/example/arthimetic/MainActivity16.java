package com.example.arthimetic;
//area of triangle
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity16 extends AppCompatActivity {
    private TextView Area;
    private EditText Base;
    private EditText Height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        Base = (EditText) findViewById(R.id.textView34);
        Height= (EditText) findViewById(R.id.textView35);
        Area = (TextView) findViewById(R.id.textView37);

        Button buttB = (Button) findViewById(R.id.button36);
        Button butt1 = (Button) findViewById(R.id.button39);
        Button butt2 = (Button) findViewById(R.id.button40);
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity16.this, MainActivity14.class);
                startActivity(intent);
            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double area,b,h;
                b=Float.parseFloat(Base.getText().toString());
                h=Float.parseFloat(Height.getText().toString());
                area =0.5*b*h;
                Area.setText(String.valueOf(area));
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Area.setText(String.valueOf(""));
                Base.setText(String.valueOf(""));
                Height.setText(String.valueOf(""));

            }
        });
    }
}