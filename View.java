/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class View extends JFrame {
    private static final String INITIAL_VALUE = "1";
    private JTextField userInput = new JTextField(5);
    private JTextField total     = new JTextField(20);
    private JButton    multiply = new JButton("Multi");
    private JButton    clear    = new JButton("CE");
    private Model m_model;

    View(Model model) {
        m_model = model;
        m_model.setValue(INITIAL_VALUE);
        total.setText(m_model.getValue());
        total.setEditable(false);
             
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(userInput);
        content.add(multiply);
        content.add(new JLabel("Total"));
        content.add(total);
        content.add(clear);
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Simple Calc - MVC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void reset() {total.setText(INITIAL_VALUE);
    }
    String getUserInput() {return userInput.getText();
    }
    void setTotal(String newTotal) { total.setText(newTotal);
    }
    void showError(String errMessage) {JOptionPane.showMessageDialog(this, errMessage);
    }
    void addMultiplyListener(ActionListener mal) { multiply.addActionListener(mal);
    }
    void addClearListener(ActionListener cal) {clear.addActionListener(cal);
    }
}