package org.example;

import java.util.Scanner;

public class CalculatorClass implements Calculator{
    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int abstraction(int num1, int num2) {

        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }

}
