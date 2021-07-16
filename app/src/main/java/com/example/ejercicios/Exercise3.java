package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise3 extends AppCompatActivity {

    private int FirstValue, SecondValue;
    private EditText resultbox,resultbox1;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonC;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal ;
    private boolean addition, subtraction, multiplication, division;

    private Button button_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        resultbox = (EditText) findViewById(R.id.ex3_text);
        resultbox1 = (EditText) findViewById(R.id.ex3_text1);
        button1 = (Button) findViewById(R.id.ex3_button1);
        button2 = (Button) findViewById(R.id.ex3_button2);
        button3 = (Button) findViewById(R.id.ex3_button3);
        button4 = (Button) findViewById(R.id.ex3_button4);
        button5 = (Button) findViewById(R.id.ex3_button5);
        button6 = (Button) findViewById(R.id.ex3_button6);
        button7 = (Button) findViewById(R.id.ex3_button7);
        button8 = (Button) findViewById(R.id.ex3_button8);
        button9 = (Button) findViewById(R.id.ex3_button9);
        button0 = (Button) findViewById(R.id.ex3_button0);
        buttonC = (Button) findViewById(R.id.ex3_buttonc);
        add = (Button) findViewById(R.id.ex3_button_add);
        subtract = (Button) findViewById(R.id.ex3_button_subtract);
        multiply = (Button) findViewById(R.id.ex3_button_multiply);
        divide = (Button) findViewById(R.id.ex3_button_divide);
        equal = (Button) findViewById(R.id.ex3_button_equal);

        button_back = (Button) findViewById(R.id.button_back3);


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstValue = 0;
                SecondValue = 0;
                addition = false;
                subtraction = false;
                multiplication = false;
                division = false;
                resultbox.setText("");
                resultbox1.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = String.valueOf((int) FirstValue);
                SecondValue = Integer.parseInt(resultbox.getText() + "");
                String number2 = String.valueOf((int) SecondValue);
                if (addition == true) {
                    resultbox1.setText(number1 + "+"+ number2);
                    resultbox.setText(String.valueOf((int) (FirstValue + SecondValue)));
                    addition = false;
                }
                if (subtraction == true) {
                    resultbox1.setText(number1 + "-"+ number2);
                    resultbox.setText(String.valueOf((int) (FirstValue - SecondValue)));
                    subtraction = false;
                }
                if (multiplication == true) {
                    resultbox1.setText(number1 + "*"+ number2);
                    resultbox.setText(String.valueOf((int) (FirstValue * SecondValue)));
                    multiplication = false;
                }
                if (division == true) {
                    resultbox1.setText(number1 + "/"+ number2);
                    resultbox.setText(String.valueOf((int) (FirstValue / SecondValue)));
                    division = false;
                }
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox1.setText(resultbox.getText()+ " +");
                if (resultbox == null) {
                    resultbox.setText("");
                } else {
                    FirstValue = Integer.parseInt(resultbox.getText() + "");
                    addition = true;
                    resultbox.setText(null);
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox1.setText(resultbox.getText()+ " -");
                if (resultbox == null) {
                    resultbox.setText("");
                } else {
                    FirstValue = Integer.parseInt(resultbox.getText() + "");
                    subtraction = true;
                    resultbox.setText(null);
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox1.setText(resultbox.getText()+ " *");
                if (resultbox == null) {
                    resultbox.setText("");
                } else {
                    FirstValue = Integer.parseInt(resultbox.getText() + "");
                    multiplication = true;
                    resultbox.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox1.setText(resultbox.getText()+ "  /");
                if (resultbox == null) {
                    resultbox.setText("");
                } else {
                    FirstValue = Integer.parseInt(resultbox.getText() + "");
                    division = true;
                    resultbox.setText(null);
                }
            }
        });

        resultbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = resultbox.getText().toString();
                resultbox.setText(result);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "9");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultbox.setText(resultbox.getText() + "0");

            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(Exercise3.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        });
    }
}