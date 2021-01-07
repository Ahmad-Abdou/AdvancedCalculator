package org.example;

import java.util.Scanner;

public interface Calculator {
    Scanner sc = new Scanner(System.in);
    public int addition(int num1 , int num2);
    public int abstraction(int num1 , int num2);
    public int multiplication(int num1 , int num2);
    public int division(int num1 , int num2);
    default void menu() {
        System.out.println("########## welcome to my calculator ##########");
    }
    static String getInput() {
        return sc.nextLine();
    }

}
