/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author J.D.
 */
public class PracTest {
    
    public PracTest() {
    }
   
    @Test
    public void pracTest(){
        assertNull("This will be null", null);
        assertNotNull("this will not be null", new Object());
        assertTrue("This will be true", true);
        assertFalse("This will be false", false);
        assertArrayEquals("Arrays should be equal", new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
    }
    
}