package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity17 extends AppCompatActivity {
    private TextView Area;
    private EditText Length;
    private EditText Width;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        Length = (EditText) findViewById(R.id.textView34);
        Width= (EditText) findViewById(R.id.textView35);
        Area = (TextView) findViewById(R.id.textView37);

        Button buttB = (Button) findViewById(R.id.button36);
        Button butt1 = (Button) findViewById(R.id.button39);
        Button butt2 = (Button) findViewById(R.id.button40);
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity17.this, MainActivity14.class);
                startActivity(intent);
            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double area,l,w;
                l=Float.parseFloat(Length.getText().toString());
                w=Float.parseFloat(Width.getText().toString());
                area = l * w;
                Area.setText(String.valueOf(area));
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Area.setText(String.valueOf(""));
                Length.setText(String.valueOf(""));
                Width.setText(String.valueOf(""));

            }
        });
    }
}