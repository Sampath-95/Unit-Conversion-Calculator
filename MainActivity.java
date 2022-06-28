package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast toast = Toast.makeText(MainActivity.this, "Welcome",Toast.LENGTH_SHORT);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kgtogram();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gramtokg();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poundstokg();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kgtopounds();
            }
        });

    }

    public void kgtogram() {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);
    }

    public void gramtokg() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void poundstokg() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void kgtopounds() {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}
