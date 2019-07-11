package com.sematec.lib;

public class TestMethods {


    public static void main(String[] args) {

        String name = "Pouya";
        int age = 30;
        int score = 99;
        int stdId = 0;

        checkAdult(age);
        checkScore(score);
        stdId = getId();
    }


    public static void checkAdult(int a) {
        if (a > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Kid");
        }
    }


    public static void checkScore(int score) {
        if (score <= 60) {
            System.out.println("Failed");
        } else {
            System.out.println("Passed");

        }
    }

    public static int getId() {
        //this is random number
        return 20;
    }

}
