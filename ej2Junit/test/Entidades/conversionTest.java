/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Usuario
 */
public class conversionTest {
    conversion c = new conversion();
    public conversionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertirFarenheit method, of class conversion.
     */
    /*@Test
    public void testConvertirFarenheit() {
        System.out.println("convertirFarenheit");
        double celsius = 0.0;
        conversion instance = new conversion();
        double expResult = 0.0;
        double result = instance.convertirFarenheit(celsius);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirCelsius method, of class conversion.
     */
    /*@Test
    public void testConvertirCelsius() {
        System.out.println("convertirCelsius");
        double farenheit = 0.0;
        conversion instance = new conversion();
        double expResult = 0.0;
        double result = instance.convertirCelsius(farenheit);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
     @Test
    public void testConvertirFarenheit() {
        
        assertEquals(86, c.convertirFarenheit(30), 0);
    }
    
     @Test
    public void testConvertirCelsius() {
        
        assertEquals(30, c.convertirCelsius(86),0);
    }

}

