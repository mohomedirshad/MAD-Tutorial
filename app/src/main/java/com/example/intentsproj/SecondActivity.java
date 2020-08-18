package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText EtNum1;
    EditText EtNum2;

    String number1;
    String number2;

    TextView textView;

    double num1;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EtNum1 = (EditText) findViewById(R.id.EditActivity2Num1);
        EtNum2 = (EditText) findViewById(R.id.EditActivity2Num2);

        textView = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("num1");
        number2 = intent.getStringExtra("num2");

        EtNum1.setText(number1);
        EtNum2.setText(number2);

        num1 = Double.parseDouble(number1);
        num2 = Double.parseDouble(number2);
    }

    public void Add(View view){
        textView.setText(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void Subtract(View view){
        textView.setText(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void Multiply(View view){
        textView.setText(num1 + " X " + num2 + " = " + (num1 * num2));
    }

    public void Divide(View view){
        textView.setText(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}