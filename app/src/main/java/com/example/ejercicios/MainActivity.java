package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button button_exercise1;
    private Button button_exercise2;
    private Button button_exercise3;
    private Button button_exercise4;
    private Button button_exercise5;
    private Button button_exercise6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_exercise1 = (Button) findViewById(R.id.button_ex1);
        button_exercise2 = (Button) findViewById(R.id.button_ex2);
        button_exercise3 = (Button) findViewById(R.id.button_ex3);
        button_exercise4 = (Button) findViewById(R.id.button_ex4);
        button_exercise5 = (Button) findViewById(R.id.button_ex5);
        button_exercise6 = (Button) findViewById(R.id.button_ex6);

        button_exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise1.class);
                startActivity(exercise);
                finish();
            }
        });

        button_exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise2.class);
                startActivity(exercise);
                finish();
            }
        });

        button_exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise3.class);
                startActivity(exercise);
                finish();
            }
        });

        button_exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise4.class);
                startActivity(exercise);
                finish();
            }
        });

        button_exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise5.class);
                startActivity(exercise);
                finish();
            }
        });

        button_exercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise6.class);
                startActivity(exercise);
                finish();
            }
        });


    }
}
