package com.example.calculator_app;


import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public List<String> inputList;

    public Calculator()
    {
        inputList = new ArrayList<>();
    }

    public void push(String value)
    {
        inputList.add(value);
    }

    public int cal() {
        int result = Integer.parseInt(inputList.get(0));
            for (int i = 1; i < inputList.size(); i += 2) {
                String operator = inputList.get(i);
                int operand = Integer.parseInt(inputList.get(i + 1));

                if (operator.equals("+")) {
                    result += operand;
                } else if (operator.equals("-")) {
                    result -= operand;
                } else if (operator.equals("*")) {
                    result *= operand;
                } else if (operator.equals("/")) {
                    if (operand == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result /= operand;
                }
            }
            return result;
        }




    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private boolean isOperator(String str) {
        // Check if the string is one of the recognized operators
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

}