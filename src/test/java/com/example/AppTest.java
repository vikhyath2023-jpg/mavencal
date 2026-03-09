package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    App calc = new App();

    @Test
    public void testAddition(){
        assertEquals(10, calc.add(5,5));
    }

    @Test
    public void testSubtraction(){
        assertEquals(2, calc.subtract(5,3));
    }

    @Test
    public void testMultiplication(){
        assertEquals(15, calc.multiply(5,3));
    }

}
