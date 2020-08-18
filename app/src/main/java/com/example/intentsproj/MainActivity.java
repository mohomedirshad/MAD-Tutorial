package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;
    EditText EtNum1;
    EditText EtNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtNum1 = (EditText) findViewById(R.id.EditActivity2Num1);
        EtNum2 = (EditText) findViewById(R.id.EditActivity2Num2);
    }

    //Navigate to Second activity
    public void onClick(View view)
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("num1", EtNum1.getText().toString());
        intent.putExtra("num2", EtNum2.getText().toString());

        //Toast message
        //Toast.makeText(this, "You just Clicked OK", Toast.LENGTH_SHORT).show();
        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();  //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

        startActivity(intent);
    }
}