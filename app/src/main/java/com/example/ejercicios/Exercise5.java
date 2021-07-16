package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Exercise5 extends AppCompatActivity {
    private Button game1;
    private Button game2;
    private Button button_back;
    private TextView displaycoins;
    private Integer main_coins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);

        main_coins=100;

        game1 = (Button) findViewById(R.id.ex5_button1);
        game2 = (Button) findViewById(R.id.ex5_button2);
        displaycoins = (TextView) findViewById(R.id.ex5_textViewcoins);
        button_back = (Button) findViewById(R.id.button_back5);

        displaycoins.setText("Tienes " + String.valueOf(main_coins)+ " monedas");

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game1 = new Intent(Exercise5.this, Game1.class);
                game1.putExtra("coins",main_coins);
                startActivity(game1);
            }
        });

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game2 = new Intent(Exercise5.this, Game2.class);
                startActivity(game2);
            }
        });


        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Exercise5.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }
        );
    }
}