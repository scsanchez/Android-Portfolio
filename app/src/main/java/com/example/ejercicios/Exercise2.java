package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise2 extends AppCompatActivity {

    private EditText ex2_textup;
    private Button ex2_button_down;
    private Button ex2_button_up;
    private EditText ex2_textdown;

    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        ex2_textup = (EditText) findViewById(R.id.ex2_text1);
        ex2_button_down = (Button) findViewById(R.id.ex2_button_down);
        ex2_button_up = (Button) findViewById(R.id.ex2_button_up);
        ex2_textdown = (EditText) findViewById(R.id.ex2_text2);

        button_back = (Button) findViewById(R.id.button_back2);

        ex2_button_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ex2_textup.getText().toString();
                ex2_textdown.setText(input);
                ex2_textup.setText("");
                ex2_textdown.requestFocus();
                ex2_button_down.setVisibility(View.INVISIBLE);
                ex2_button_up.setVisibility(View.VISIBLE);
            }
        });

        ex2_button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ex2_textdown.getText().toString();
                ex2_textup.setText(input);
                ex2_textdown.setText("");
                ex2_textup.requestFocus();
                ex2_button_up.setVisibility(View.INVISIBLE);
                ex2_button_down.setVisibility(View.VISIBLE);
            }
        });



        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Exercise2.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });

    }
}