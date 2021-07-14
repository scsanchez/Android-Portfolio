package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise4 extends AppCompatActivity {

    private EditText firsttext;
    private EditText secondtext;
    private EditText thirdtext;
    private Button firstbutton;
    private Button secondbutton;
    private Button thirdbutton;

    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);

        firsttext = (EditText) findViewById(R.id.ex4_text1);
        secondtext = (EditText) findViewById(R.id.ex4_text2);
        thirdtext = (EditText) findViewById(R.id.ex4_text3);
        firstbutton = (Button) findViewById(R.id.ex4_button1);
        secondbutton = (Button) findViewById(R.id.ex4_button2);
        thirdbutton = (Button) findViewById(R.id.ex4_button3);

        button_back = (Button) findViewById(R.id.button_back4);

        firstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = firsttext.getText().toString();
                secondtext.setText(input);
                firsttext.setText("");
                secondtext.requestFocus();
            }
        });

        secondbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = secondtext.getText().toString();
                thirdtext.setText(input);
                secondtext.setText("");
                thirdtext.requestFocus();
            }
        });

        thirdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = thirdtext.getText().toString();
                firsttext.setText(input);
                thirdtext.setText("");
                firsttext.requestFocus();
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Exercise4.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}