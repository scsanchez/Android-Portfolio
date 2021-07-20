package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private Button button_exercise1;
    private Button button_exercise2;
    private Button button_exercise3;
    private Button button_exercise4;
    private Button button_exercise5;
    private Button button_exercise6;
    private TextView github;
    private TextView linkedin;
    private TextView email;

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

        github =(TextView) findViewById(R.id.textView_github) ;
        github.setMovementMethod(LinkMovementMethod.getInstance());

        linkedin =(TextView) findViewById(R.id.textView_linkedin) ;
        linkedin.setMovementMethod(LinkMovementMethod.getInstance());



        button_exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise1.class);
                startActivity(exercise);

            }
        });

        button_exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise2.class);
                startActivity(exercise);

            }
        });

        button_exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise3.class);
                startActivity(exercise);
            }
        });

        button_exercise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise4.class);
                startActivity(exercise);

            }
        });

        button_exercise5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise5.class);
                startActivity(exercise);

            }
        });

        button_exercise6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercise = new Intent(MainActivity.this, Exercise6.class);
                startActivity(exercise);

            }
        });


    }
}
