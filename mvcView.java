/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javax.swing.*;
import java.awt.BorderLayout;

/**
 *
 * @author J.D.
 */
public class View {
    private final JFrame frame;
    private final JButton button;
    private final JLabel label;

    public View(String text){
        frame = new JFrame("View");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(300,150);        
        frame.setVisible(true);
        
        button = new JButton("Multiply by 2");        
        frame.getContentPane().add(button, BorderLayout.NORTH);        
        
        label = new JLabel(text);
        frame.getContentPane().add(label, BorderLayout.LINE_START);
    }    
    public JButton getButton(){
        return button;
    }
    public void setText(String text){
        label.setText(text);
    }
}