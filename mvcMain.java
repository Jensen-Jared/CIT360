/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javax.swing.SwingUtilities;


/**
 *
 * @author J.D.
 */
public class Main {
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(() -> {
            Model model = new Model(1);
            View view = new View("1");
            Controller controller = new Controller(model,view);
            controller.contol();
        });  
    }
}