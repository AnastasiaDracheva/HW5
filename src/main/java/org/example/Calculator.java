package org.example;


public class Calculator {

    public int  add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public boolean compare(int a, int b) {

        boolean theyAreEqual;
        if (a > b) theyAreEqual = true;
        else theyAreEqual = false;
        return theyAreEqual;

    }

}