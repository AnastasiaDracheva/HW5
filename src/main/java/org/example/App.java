package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {


        Calculator calculator = new Calculator();

        int add;
        System.out.println("Summa = " + calculator.add(4, 9));

        int difference = calculator.subtract(12, 36);
        System.out.println("Difference = " + difference);

        boolean compare = calculator.compare(36, 12);
        System.out.println("They are equal if a > b - " + compare);

        double  divide = calculator.divide(20, 5);
        System.out.println("Result of division = " + divide );

        double multiply = calculator.multiply(5,5);
        System.out.println("Result of multiplication = " + multiply );

    }

}
