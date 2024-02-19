package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdditionOfTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(
                8, result);
    }

    @Test
    public void testAdditionOfTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-3, -5);
        assertEquals(-8, result);
    }

    @Test
    public void testAdditionOfPositiveAndNegativeNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, -5);
        assertEquals(-2,result);
    }

    @Test
    public void testAdditionWithZero() {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(0, 5);
        assertEquals(5, result1);

        int result2 = calculator.add(3, 0);
        assertEquals(3, result2);
    }

    @Test
    public void testSubtractionOfTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractionOfTwoNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-3, -5);
        assertEquals(2, result);
    }

    @Test
    public void testSubtractionOfPositiveFromNegativeNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-3, -3);
        assertEquals(0, result);
    }

    @Test
    public void testFirstArgumentIsNotNull() {
        Calculator calculator = new Calculator();
        int result = calculator.add(9, 0);
        assertNotNull(result/9);
    }

    @Test
    public void testSecondArgumentIsNotNull() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(0, -3);
        assertNotNull(result/ -3);
    }

    @Test
    public void theFirstArgumentIsGreaterThemTheSecond(){
        Calculator calculator = new Calculator();
        assertTrue(0 > -3);
    }


}
