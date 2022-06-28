package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
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
                double pounds = Double.parseDouble(s);
                if (pounds == 0) {
                    textview.setText("Please Enter valid input");
                } else {
                    double kg = 2.202 * pounds;
                    textview.setText("The corresponding pound value in kgs is " + kg + " kgs");
                }
            }
        });
    }
}
