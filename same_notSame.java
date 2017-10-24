/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import static java.awt.PageAttributes.MediaType.A;
import static java.awt.PageAttributes.MediaType.B;
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
        assertSame("These will be the same", A, A);
        assertNotSame("These will be the same", A, B);
    }
    
}