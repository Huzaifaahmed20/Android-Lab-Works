package com.example.masho.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private Button add,sub,mul,div;
    private EditText number1,number2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        add = (Button)findViewById(R.id.buttonAdd);
        sub = (Button)findViewById(R.id.buttonSub);
        mul = (Button)findViewById(R.id.buttonMul);
        div = (Button)findViewById(R.id.buttonDiv);
        number1 = (EditText)findViewById(R.id.NumberOne);
        number2 = (EditText)findViewById(R.id.NumberTwo);
        result = (TextView) findViewById(R.id.resulttxt);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double answer = num1 + num2 ;
                result.setText(String.valueOf(answer));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double answer = num1 - num2 ;
                result.setText(String.valueOf(answer));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double answer = num1 * num2 ;
                result.setText(String.valueOf(answer));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                double answer = num1 / num2 ;
                result.setText(String.valueOf(answer));

            }
        });
    }
}
