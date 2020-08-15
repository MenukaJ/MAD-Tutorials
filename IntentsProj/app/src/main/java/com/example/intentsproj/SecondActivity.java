package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editText3;
    EditText editText4;
    TextView textView;
    int number1;
    int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button1= (Button)findViewById(R.id.button2);
        Button button2= (Button)findViewById(R.id.button3);
        Button button3= (Button)findViewById(R.id.button4);
        Button button4= (Button)findViewById(R.id.button5);

        String num1 = getIntent().getExtras().getString("value2");
        String num2 = getIntent().getExtras().getString("value1");

        number1 = Integer.parseInt(num1);
        number2 = Integer.parseInt(num2);

        editText3 = findViewById(R.id.editTextNumber6);
        editText3.setText(num1);
 //       editText3.setEnabled(false);

        editText4 = findViewById(R.id.editTextNumber3);
        editText4.setText(num2);
 //       editText4.setEnabled(false);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView9);

                textView.setText(number2 + " + " + number1 + " = " + (number2+number1));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView9);

                textView.setText(number2 + " - " + number1 + " = " + (number2-number1));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView9);

                textView.setText(number2 + " * " + number1 + " = " + (number2*number1));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.textView9);

                textView.setText(number2 + " / " + number1 + " = " + (number2/number1));
            }
        });
    }
}