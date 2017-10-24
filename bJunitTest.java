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
public class bJunitTest {
    
    public bJunitTest() {
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
     * Test of main method, of class bJunit.
     */

    /**
     * Test of multi method, of class bJunit.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        String s1 = "1";
        String s2 = "1";
        String s3 = "1";
        bJunit instance = new bJunit();
        int expResult = 1;
        int result = instance.multi(s1, s2, s3);
        assertEquals(expResult, result);
    }
    
}