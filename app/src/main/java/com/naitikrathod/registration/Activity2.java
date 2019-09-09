package com.naitikrathod.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String name,sap,branch,age,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();

        name=intent.getStringExtra("NAME");
        sap=intent.getStringExtra("SAP ID");
        branch=intent.getStringExtra("BRANCH");
        age=intent.getStringExtra("AGE");
        gender=intent.getStringExtra("GENDER");


        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText("NAME:"+name);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("SAP ID:"+sap);

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText("BRANCH:"+branch);

        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText("AGE:"+age);

        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText("GENDER:"+gender);
    }
}
