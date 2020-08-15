package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    int val1;
    int val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button= (Button)findViewById(R.id.button);
        editText1 = findViewById(R.id.editTextNumber1);
        editText2 = findViewById(R.id.editTextNumber6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(getApplicationContext(),SecondActivity.class));
                if(!editText1.getText().toString().isEmpty())
                    intent.putExtra("value1", editText1.getText().toString());
                else
                    toastMsg("Number 1 required");

                if(!editText2.getText().toString().isEmpty())
                    intent.putExtra("value2", editText2.getText().toString());
                else
                    toastMsg("Number 2 required");

                if(!editText1.getText().toString().isEmpty() && !editText2.getText().toString().isEmpty()) {
                    startActivity(intent);
                    toastMsg("Sending");
                }

            }
        });
    }
    public void toastMsg(CharSequence message) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER, 0, 0);
        toast.show();
    }


}