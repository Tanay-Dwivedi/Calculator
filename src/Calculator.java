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

    // creating a constructor
    Calculator() {

        // adding the frame properties
        calcFrame = new JFrame("Calculator");
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calcFrame.setSize(450, 550);
        calcFrame.setLayout(null);
        calcFrame.setLocationRelativeTo(null);

        // instantiating the text field of the calculator
        calcTextField = new JTextField();
        // adding the location of our text field
        calcTextField.setBounds(45, 25, 350, 50);
        calcTextField.setFont(newFont);
        calcTextField.setEditable(false);

        // instantiating the buttons for the calculator
        addition = new JButton("➕");
        subtraction = new JButton("➖");
        multiplication = new JButton("❌");
        division = new JButton("➗");
        decimals = new JButton("•");
        delete = new JButton("del");
        allClear = new JButton("AC");
        // ×+-÷

        // adding the buttons to the function button array
        calcFunctionButtons[0] = addition;
        calcFunctionButtons[1] = subtraction;
        calcFunctionButtons[2] = multiplication;
        calcFunctionButtons[3] = division;
        calcFunctionButtons[4] = decimals;
        calcFunctionButtons[5] = equals;
        calcFunctionButtons[6] = delete;
        calcFunctionButtons[7] = allClear;

        //  giving the properties to the function buttons
        for (int i=0; i<=7; i++) {
            calcFunctionButtons[i].addActionListener(this);
            calcFunctionButtons[i].setFont(newFont);
            calcFunctionButtons[i].setFocusable(false);
        }

        // adding the text field to the calculator frame
        calcFrame.add(calcTextField);
        calcFrame.setVisible(true);

    }

    public static void main(String[] args) {

        // creating instance of calculator class
        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}