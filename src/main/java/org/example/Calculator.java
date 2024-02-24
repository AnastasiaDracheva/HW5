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

    public double divide (double a, double b){
        if (b == 0){
            throw new IllegalArgumentException();
        }
        return a/b;

    }
    public double multiply(double a, double b) {
        return a * b;
    }

}