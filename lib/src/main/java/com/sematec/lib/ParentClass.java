package com.sematec.lib;

public class ParentClass {

    int birthDate;
    String name;
    String family;


    public void calculateAge(int year) {
        int result = year - birthDate;
        System.out.println("Age is " + result);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }
}
