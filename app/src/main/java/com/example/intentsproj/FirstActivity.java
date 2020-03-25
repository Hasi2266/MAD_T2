package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText value1;
    EditText value2;
    Button ok;
    String num1;
    String num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ok = (Button) findViewById(R.id.btn_ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                value1 = (EditText) findViewById(R.id.no1);
                num1 = value1.getText().toString();

                value2 = (EditText) findViewById(R.id.no2);
                num2 = value2.getText().toString();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                //set the values pass to the next activity
                intent.putExtra("NUMBER1",num1);
                intent.putExtra("NUMBER2",num2);
                startActivity(intent);


            }
        });




    }
}
