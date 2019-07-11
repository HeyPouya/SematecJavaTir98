package com.sematec.lib;


/*
 For learning java
 */
public class MyClass {


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        int result = 0;
        result = sum(10, 1);
        System.out.println(result);

        int resultPower = 0;
        resultPower = power(3);
        System.out.println(resultPower);
    }

    double d = 9.5;
    String name = "Pouya";
    int age = 10;
    boolean b = true;

    long l = 10000;
    short s = 10;
    char c = 'a';
    float f = 9.56666f;  // added f to the end of number to make it float



    /**
     * this function adds x to y
     * @param x this is the first number
     * @param y sadasdas
     * @return the result is x+y
     */
    public static int sum(int x, int y) {
        int result = 0;
        result = x + y;
        return result;
    }


    public static int plusOne(int x) {
        int resultPlus = 0;
        resultPlus = x + 1;
        return resultPlus;
    }

    public static int power(int x) {
        int resultPower = 0;
        int newX = plusOne(x);
        resultPower = newX * newX;
        return resultPower;
    }


    public int getOne() {
        return 1;
    }

    public int getYear() {
        return 2019;
    }

    public void useless() {

    }


    //      /       slash
    //      \       backslash
    //      {}      curly brace
    //      ()      parantez - brace
    //      .       dot
    //      ,       comma
    //      -       dash
    //      #       sharp
    //      '       Single quotation
    //      "       double quotation
    //      &       ampersand
    //      ;       semi colon
    //      :       colon
    //      |       pipe line
}



