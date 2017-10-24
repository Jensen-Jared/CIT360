/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        Model      model      = new Model();
        View       view       = new View(model);
        Controller controller = new Controller(model, view);
        
        view.setVisible(true);
    }
}