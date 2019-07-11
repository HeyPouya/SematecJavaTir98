package com.sematec.lib;

import java.util.Scanner;

public class CalculatorClass {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first Number");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second Number");
        int secondNumber = sc.nextInt();

        int sumOfNumbers = sum(firstNumber, secondNumber);
        System.out.println("The sum is " + sumOfNumbers);

        int mulOfNumbers = mul(firstNumber, secondNumber);
        System.out.println("The mul is " + mulOfNumbers);

        int divOfNumbers = div(firstNumber, secondNumber);
        System.out.println("The div is " + divOfNumbers);

        int subOfNumbers = sub(firstNumber, secondNumber);
        System.out.println("The sub is " + subOfNumbers);


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
