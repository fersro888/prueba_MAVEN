/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenayd2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fersro
 * @param <E>
 */

/*
*
*Clase publica GreeterIT<E>
*/
public class GreeterIT<E> {
    
    public GreeterIT() {
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
     * Test of sayHello method, of class Greeter.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        Greeter instance = new Greeter();
        String expResult = "Hola mundo";
        String result = instance.sayHello();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!instance.sayHello().equals(expResult)){
            fail("The test case is a prototype.");
        }
            
        
    }
    
}
