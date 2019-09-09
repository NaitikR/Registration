package com.naitikrathod.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    String name,sap,branch,age,gender;
    String username,id,ag,gen,bran;
    RadioGroup radioGroup;
    RadioButton radioButton;



    public void checkButton(View view){

        int rid= radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(rid);
        gender=radioButton.getText().toString();
    }

    public void prev(View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("NAME", username);
        intent.putExtra("SAP ID", id);
        intent.putExtra("BRANCH", bran);
        intent.putExtra("AGE", ag);
        intent.putExtra("GENDER", gen);
        startActivity(intent);
    }



    public void openActivity2(View view){
        EditText nameEditText = findViewById(R.id.nameEditText);
        name=nameEditText.getText().toString();
        EditText sapEditText = findViewById(R.id.sapEditText);
        sap=sapEditText.getText().toString();
        EditText branchEditText = findViewById(R.id.branchEditText);
        branch=branchEditText.getText().toString();
        EditText ageEditText = findViewById(R.id.ageEditText);
        age=ageEditText.getText().toString();

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.naitikrathod.registration", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("name",name).apply();
        sharedPreferences.edit().putString("sap",sap).apply();
        sharedPreferences.edit().putString("branch",branch).apply();
        sharedPreferences.edit().putString("age",age).apply();
        sharedPreferences.edit().putString("gender",gender).apply();



        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("NAME", name);
        intent.putExtra("SAP ID", sap);
        intent.putExtra("BRANCH", branch);
        intent.putExtra("AGE", age);
        intent.putExtra("GENDER", gender);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radiog);

        SharedPreferences sharedPreferences=getSharedPreferences("com.naitikrathod.registration" +
                "",Context.MODE_PRIVATE);
        username = sharedPreferences.getString("name","");
        id = sharedPreferences.getString("sap","");
        bran = sharedPreferences.getString("branch","");
        ag = sharedPreferences.getString("age","");
        gen = sharedPreferences.getString("gender","");

    }

}
