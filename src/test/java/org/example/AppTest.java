package org.example;

import static junit.framework.Assert.assertEquals;

public class AppTest{

    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }

    public void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    public void testMultiply() {
        assertEquals(14, calculator.multiply(2, 7));
    }

    public void testDivide() {
        assertEquals(4, calculator.divide(12, 3));
    }


}
