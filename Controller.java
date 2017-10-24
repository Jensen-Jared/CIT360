/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author J.D.
 */
public class Controller {
    private final Model model;
    private final View view;
    private ActionListener actionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;                      
    }
    public void contol(){        
        actionListener = (ActionEvent actionEvent) -> {
            linkBtnAndLabel();
        };                
        view.getButton().addActionListener(actionListener);   
    }
    private void linkBtnAndLabel(){
        model.incX();                
        view.setText(Integer.toString(model.getX()));
    }    
}