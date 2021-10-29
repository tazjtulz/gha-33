package com.mycompany;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSuma()
    {
        System.out.println("suma");
        App instance = new App();
        int result = instance.sumafunc(4, 5);
        assertEquals(9, result);
    }
}
