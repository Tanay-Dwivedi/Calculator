// building......

import javax.swing.*;
import java.awt.*;
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

    // font for our calculator;
    Font newFont = new Font("Ink Free", Font.BOLD, 40);

    // values for the initial calc value
    double numFirst = 0, numSecond = 0, result = 0;
    char operator;

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