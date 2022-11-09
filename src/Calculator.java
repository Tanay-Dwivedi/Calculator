// building......

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame calcFrame;
    JTextField calcTextField;
    JButton[] calcNumberButtons = new JButton[10];
    JButton[] calcFunctionButtons = new JButton[8];
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
        addition = new JButton("+");
        subtraction = new JButton("-");
        multiplication = new JButton("x");
        division = new JButton("/");
        decimals = new JButton(".");
        delete = new JButton("del");
        allClear = new JButton("AC");
        equals = new JButton("=");

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
        for (int i = 0; i < 8; i++) {
            calcFunctionButtons[i].addActionListener(this);
            calcFunctionButtons[i].setFont(newFont);
            calcFunctionButtons[i].setFocusable(false);
        }

        //  adding and giving the properties to the number buttons
        for (int i = 0; i < 10; i++) {
            calcNumberButtons[i] = new JButton(String.valueOf(i));
            calcNumberButtons[i].addActionListener(this);
            calcNumberButtons[i].setFont(newFont);
            calcNumberButtons[i].setFocusable(false);
        }

        // adding the delete button
        delete.setBounds(45, 430, 145, 45);

        // adding the all clear button
        allClear.setBounds(200, 430, 145, 45);

        // instantiating the calculator panel
        btnPanel = new JPanel();
        btnPanel.setBounds(45, 100, 325, 325);
        btnPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // adding the buttons to the calculator panel
        btnPanel.add(calcNumberButtons[1]);
        btnPanel.add(calcNumberButtons[2]);
        btnPanel.add(calcNumberButtons[3]);
        btnPanel.add(addition);
        btnPanel.add(calcNumberButtons[4]);
        btnPanel.add(calcNumberButtons[5]);
        btnPanel.add(calcNumberButtons[6]);
        btnPanel.add(subtraction);
        btnPanel.add(calcNumberButtons[7]);
        btnPanel.add(calcNumberButtons[8]);
        btnPanel.add(calcNumberButtons[9]);
        btnPanel.add(multiplication);
        btnPanel.add(decimals);
        btnPanel.add(calcNumberButtons[0]);
        btnPanel.add(equals);
        btnPanel.add(division);

        // adding the button panel to the frame
        calcFrame.add(btnPanel);
        // adding delete and all clear button to the frame
        calcFrame.add(delete);
        calcFrame.add(allClear);
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

        // getting text when clicked on number button
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == calcNumberButtons[i]) {
                calcTextField.setText(calcTextField.getText().concat(String.valueOf(i)));
            }
        }

        //  getting text when clicked on decimal button
        if(e.getSource()==decimals) {
            calcTextField.setText(calcTextField.getText().concat("."));
        }

        //  getting text when clicked on addition button
        if(e.getSource()==addition) {
            numFirst = Double.parseDouble(calcTextField.getText());
            operator ='+';
            calcTextField.setText("");
        }

        //  getting text when clicked on subtraction button
        if(e.getSource()==subtraction) {
            numFirst = Double.parseDouble(calcTextField.getText());
            operator ='-';
            calcTextField.setText("");
        }

        //  getting text when clicked on multiplication button
        if(e.getSource()==multiplication) {
            numFirst = Double.parseDouble(calcTextField.getText());
            operator ='*';
            calcTextField.setText("");
        }

        //  getting text when clicked on division button
        if(e.getSource()==division) {
            numFirst = Double.parseDouble(calcTextField.getText());
            operator ='/';
            calcTextField.setText("");
        }

        if(e.getSource()==equals) {
            numSecond=Double.parseDouble(calcTextField.getText());

            // giving the logic to add, subtract, multiply and divide buttons
            switch (operator) {

                //logic for addition
                case '+' -> result = numFirst + numSecond;

                //logic for subtraction
                case '-' -> result = numFirst - numSecond;

                //logic for multiplication
                case '*' -> result = numFirst * numSecond;

                //logic for division
                case '/' -> result = numFirst / numSecond;
            }
            calcTextField.setText(String.valueOf(result));
            numFirst=result;
        }

    }

}