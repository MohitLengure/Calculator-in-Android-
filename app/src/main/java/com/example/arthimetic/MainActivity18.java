package com.example.arthimetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity18 extends AppCompatActivity {
    private EditText Name,RollNo,Class1,MAD1,COA2,ASP3,Project4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        Name = (EditText) findViewById(R.id.Name);
        RollNo = (EditText) findViewById(R.id.RollNumber);
        Class1 = (EditText) findViewById(R.id.CLASS);
        MAD1 = (EditText) findViewById(R.id.MAD);
        COA2 = (EditText) findViewById(R.id.COA);
        ASP3 = (EditText) findViewById(R.id.ASP);
        Project4 = (EditText) findViewById(R.id.Project);


        Button buttB=(Button) findViewById(R.id.button45);
        Button buttRun=(Button) findViewById(R.id.button46);

        buttB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity18.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        buttRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variable declare
                float Sub1,Sub2,Sub3,Sub4,Total,Per,CGPA;

                //Input take
                Sub1=Float.parseFloat(MAD1.getText().toString());
                Sub2=Float.parseFloat(COA2.getText().toString());
                Sub3=Float.parseFloat(ASP3.getText().toString());
                Sub4=Float.parseFloat(Project4.getText().toString());
                Total=Sub1+Sub2+Sub3+Sub4;
                Per=(Total/500)*100;
                CGPA = (float) (Per/9.5);


                //User data taken
                String stdname,rollno,CLass,per1,cgpa1;
                stdname=Name.getText().toString();
                rollno=RollNo.getText().toString();
                CLass=Class1.getText().toString();
                per1=Float.toString(Per);
                cgpa1=Float.toString(CGPA);





                //link to another activity for data transfer
                Intent intent = new Intent(MainActivity18.this, MainActivity19.class);
                intent.putExtra("stdName",stdname);
                intent.putExtra("Roll",rollno);
                intent.putExtra("CLass",CLass);
                intent.putExtra("Per",per1);
                intent.putExtra("CGPA",cgpa1);
                startActivity(intent);
            }
        });
    }
}