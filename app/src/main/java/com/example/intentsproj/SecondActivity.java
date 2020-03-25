package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView answer;
    Button add;
    Button sub;
    Button multi;
    Button divide;
    String n1,n2;
    Double val1,val2;
    CharSequence message  = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        answer = (TextView) findViewById(R.id.answer);
        add = (Button) findViewById(R.id.btn_add);
        sub = (Button)findViewById(R.id.btn_sub);
        multi = (Button)findViewById(R.id.btn_multi);
        divide = (Button) findViewById(R.id.btn_divide);

        //get values and passed to variables
        n1 = intent.getStringExtra("NUMBER1");
        n2 = intent.getStringExtra("NUMBER2");

        num1 = (EditText) findViewById(R.id.no1);
        num2 = (EditText) findViewById(R.id.no2);

        num1.setText(n1);
        num2.setText(n2);

        //convert into double
        val1 = Double.parseDouble(n1);
        val2 = Double.parseDouble(n2);

        final Context context = getApplicationContext();
        message = "You just clicked the OK button" + val1 + " " + val2;
        final int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();

        //this execute when press add button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(val1 + "+" + val2 + "=" + (val1 + val2));
                 message = "Add two Numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();
            }
        });

        //this excute when press sub button
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(val1 + "-" + val2 + "=" + (val1 - val2));
                message = "Subtract two Numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();

            }
        });
        //this execute when press multiplication button
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(val1 + "*" + val2 + "=" + (val1  * val2));
                message = "Multiplication two Numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();
            }
        });
        //this execute when press divide button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(val1 + "/" + val2 + "=" + (val1 / val2));
                message = "Divide two Numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,0);
                toast.show();
            }
        });








    }
}
