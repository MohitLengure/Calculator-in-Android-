package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity19 extends AppCompatActivity {
    private TextView Name,RollNo,Class,Pers,CGPA,SGPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        Name = (TextView) findViewById(R.id.textView51);
        RollNo = (TextView) findViewById(R.id.textView52);
        Class = (TextView) findViewById(R.id.textView54);
        Pers = (TextView) findViewById(R.id.textView53);
        CGPA = (TextView) findViewById(R.id.textView58);
        SGPA = (TextView) findViewById(R.id.textView55);

        //back button
        Button buttB=(Button) findViewById(R.id.button48);
        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity19.this, MainActivity18.class);
                startActivity(intent);
            }
        });


//get the value form activity 18
        String stdName,Rollno,CLass,Per,cgpa;

        stdName=getIntent().getStringExtra("stdName");
        Rollno=getIntent().getStringExtra("Roll");
        CLass=getIntent().getStringExtra("CLass");
        Per=getIntent().getStringExtra("Per");
        cgpa=getIntent().getStringExtra("CGPA");



        //value assign to id
        Name.setText(stdName);
        RollNo.setText(Rollno);
        Class.setText(CLass);
        Pers.setText(String.valueOf(Per));
        CGPA.setText(String.valueOf(cgpa));
        SGPA.setText(String.valueOf(cgpa));


    }
}