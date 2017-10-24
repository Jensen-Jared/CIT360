/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J.D.
 */
public class aJunitTest {
    
    public aJunitTest() {
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
     * Test of add method, of class aJunit.
     */
    @Test
    public void testAddA() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        aJunit instance = new aJunit();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddB() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "3";
        aJunit instance = new aJunit();
        int expResult = 5;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
    }
    
}