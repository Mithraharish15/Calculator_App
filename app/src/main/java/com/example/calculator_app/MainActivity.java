package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import  android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity  {
    TextView textViewExpression, histxt;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, minus, times, division, equal, clr, histroy;
    Calculator calculator;
    private boolean expectingDigit = true;
    boolean isAlternateText = false;
    private List<String> historyList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        textViewExpression = findViewById(R.id.resultview);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b0 = findViewById(R.id.buttonzero);
        clr = findViewById(R.id.buttonclear);
        plus = findViewById(R.id.buttonplus);
        minus = findViewById(R.id.buttonminuus);
        times = findViewById(R.id.buttontimes);
        division = findViewById(R.id.buttondivision);
        equal = findViewById(R.id.buttonequal);
        histroy = findViewById(R.id.withhistorywithouthistory);
        histxt = findViewById(R.id.historytext);


        histroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isAlternateText) {
                    histroy.setText("Standard-NoHistory");
                    textViewExpression.setText("");
                    histxt.setVisibility(View.INVISIBLE);
                    expectingDigit = true;
                } else {
                    histroy.setText("Advance-WithHistory");
                    textViewExpression.setText("");
                    histxt.setVisibility(View.VISIBLE);
                    calculator.inputList.clear();
                    expectingDigit = true;
                    //  histxt.setText("i am visible");
                }
                isAlternateText = !isAlternateText; // Toggle the state


            }


        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!expectingDigit) {

                    // Calculate the result using the Calculator class
                    int result = calculator.cal();


                    // Add the result to the inputList
                    calculator.push("=");
                    calculator.push(String.valueOf(result));

                    // Display the entire inputList on the textViewExpression
                    StringBuilder expressionText = new StringBuilder();
                    for (String input : calculator.inputList) {
                        expressionText.append(input).append(" ");
                    }
                    textViewExpression.setText(expressionText.toString());

                    // Add the expression with result to the advanceHistoryList
                    historyList.add(expressionText.toString());

                    // Update the historyText for the advanced history
                    StringBuilder advanceHistoryText = new StringBuilder();
                    for (String historyItem : historyList) {
                        advanceHistoryText.append(historyItem).append("\n");
                    }
                    histxt.setText(advanceHistoryText.toString());

                } else {
//
                    Toast.makeText(equal.getContext(), "Warning:expected digit or operator", Toast.LENGTH_LONG).show();
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewExpression.setText("");
                calculator.inputList.clear();
                expectingDigit = true;
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "1";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;

                } else {
                    Toast.makeText(b1.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "2";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b2.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "3";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b3.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "4";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b4.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "5";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b5.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "6";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b6.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "7";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b7.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "8";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b8.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "9";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b9.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expectingDigit) {
                    String DIGIT = "0";
                    textViewExpression.append(DIGIT);
                    calculator.push(DIGIT);
                    expectingDigit = false;
                } else {
                    Toast.makeText(b0.getContext(), "Warning: Expected operator", Toast.LENGTH_LONG).show();
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!expectingDigit) {
                    String OPERATOR = "+";
                    textViewExpression.append(OPERATOR);
                    calculator.push(OPERATOR);
                    expectingDigit = true;
                } else {
                    Toast.makeText(plus.getContext(), "Warning: Expected digit", Toast.LENGTH_LONG).show();
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!expectingDigit) {
                    String OPERATOR = "-";
                    textViewExpression.append(OPERATOR);
                    calculator.push(OPERATOR);
                    expectingDigit = true;
                } else {
                    Toast.makeText(minus.getContext(), "Warning: Expected digit", Toast.LENGTH_LONG).show();
                }
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!expectingDigit) {
                    String OPERATOR = "*";
                    textViewExpression.append(OPERATOR);
                    calculator.push(OPERATOR);
                    expectingDigit = true;
                } else {
                    Toast.makeText(times.getContext(), "Warning: Expected digit", Toast.LENGTH_LONG).show();
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!expectingDigit) {
                    String OPERATOR = "/";
                    textViewExpression.append(OPERATOR);
                    calculator.push(OPERATOR);
                    expectingDigit = true;
                } else {
                    Toast.makeText(division.getContext(), "Warning: Expected digit", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}