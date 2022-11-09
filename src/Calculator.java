// building......

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame calcFrame;
    JTextField calcTextField;
    JButton [] calcNumberButtons = new JButton[10];
    JButton [] calcFunctionButtons = new JButton[8];
    // function buttons
    JButton addition, subtraction, multiplication, division;
    JButton decimals, equals, delete, allClear;
    // panel to hold all the buttons
    JPanel btnPanel;

    public static void main(String[] args) {

        // creating instance of calculator class
        Calculator calc = new Calculator();

    }

    // creating a constructor
    Calculator() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}