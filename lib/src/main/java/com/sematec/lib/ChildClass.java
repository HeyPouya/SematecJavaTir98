package com.sematec.lib;

public class ChildClass extends ParentClass {


    public void checkName() {
        name = "Qoli";

        String returnName = getName();


        calculateAge(2019);

        getFamily();
    }


    @Override
    public String getFamily() {
        family = "Mr / Ms " + family;
        return super.getFamily();
    }

    @Override
    public String getName() {
        return "Pouya";
    }
}
