package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercise1 extends AppCompatActivity {

    private EditText ex1_name;
    private Button ex1_button;
    private TextView ex1_greet;
    private Button button_back;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);


        ex1_name = (EditText) findViewById(R.id.ex1_text1);
        ex1_button = (Button) findViewById(R.id.ex1_button);
        ex1_greet = (TextView) findViewById(R.id.ex1_text2);
        button_back = (Button) findViewById(R.id.button_back1);

        ex1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ex1_name.getText().toString();
                name = input;
                input = "¡Hola " + input + "! ¡Que onda?";
                ex1_greet.setText(input);
            }
        });


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Exercise1.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });

    }
}