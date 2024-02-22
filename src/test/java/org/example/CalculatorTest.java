package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void SetUpForAllTest() {
        System.out.println("Setting up All");
    }
    @AfterAll
    static void tearDownAllTest(){
        System.out.println("Closing up All");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up calculator object for new test");
    }

    @AfterEach
    void setDown() {
        calculator = new Calculator();
        System.out.println("This is execution of post condition after each test");
    }

    @Test
    public void testAdditionOfTwoPositiveNumbers() {
 //      Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(
                8, result);
    }

    @Test
    public void testAdditionOfTwoNegativeNumbers(){
 //       Calculator calculator = new Calculator();
        int result = calculator.add(-3, -5);
        assertEquals(-8, result);
    }

    @Test
    public void testAdditionOfPositiveAndNegativeNumber() {
//       Calculator calculator = new Calculator();
        int result = calculator.add(3, -5);
        assertEquals(-2,result);
    }

    @Test
    public void testAdditionWithZero() {
//        Calculator calculator = new Calculator();
        int result1 = calculator.add(0, 5);
        assertEquals(5, result1);

        int result2 = calculator.add(3, 0);
        assertEquals(3, result2);
    }

    @Test
    public void testSubtractionOfTwoPositiveNumbers() {
 //       Calculator calculator = new Calculator();
        int result = calculator.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractionOfTwoNegativeNumbers() {
//        Calculator calculator = new Calculator();
        int result = calculator.subtract(-3, -5);
        assertEquals(2, result);
    }

    @Test
    public void testSubtractionOfPositiveFromNegativeNumber() {
//        Calculator calculator = new Calculator();
        int result = calculator.subtract(-3, -3);
        assertEquals(0, result);
    }

    @Test
    public void testFirstArgumentIsNotNull() {
//        Calculator calculator = new Calculator();
        int result = calculator.add(9, 0);
        assertNotNull(result);
    }

    @Test
    public void testSecondArgumentIsNotNull() {
//        Calculator calculator = new Calculator();
        int result = calculator.subtract(0, -3);
        assertNotNull(result);
    }

    @Test
    public void testTheFirstArgumentIsGreaterThemTheSecond(){
//        Calculator calculator = new Calculator();
        boolean compare = calculator.compare( 0, -3);
        assertTrue(0 > -3);
    }

}
