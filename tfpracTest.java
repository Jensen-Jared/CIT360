/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

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
public class tfpracTest {
    
    public tfpracTest() {
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
     * Test of compareString method, of class tfprac.
     */
    @Test
    public void testCompareString() {
        tfprac tf = new tfprac();
        assertTrue(tf.compareString("hi", "hi"));
        assertFalse(tf.compareString("hi", "bye"));
    }
    
}