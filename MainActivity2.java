package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        button=findViewById(R.id.button5);
        textview=findViewById(R.id.textView3);
        editText=findViewById(R.id.textView2);
        editText.setText("0");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double grams = Double.parseDouble(s);
                if (grams == 0) {
                    textview.setText("Please Enter valid input");
                } else {
                    double kg = grams/1000;
                    textview.setText("The corresponding gram value in the KGs is " + kg + " kgs");
                }
            }
        });
    }
}
