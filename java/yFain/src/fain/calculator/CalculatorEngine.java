package fain.calculator;

import fain.calculator.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    Calculator parent; //Link on calculator

    char selectedAction = ' ';    //+, -, *, /
    double currentResult = 0;


    //Constructor save link on calculator window
    //in variable class window

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e) {
        //get source event
        JButton clickedButton = (JButton) e.getSource();

        //get current text from field ("display")
        //calculator

        String dispFieldText = parent.displayField.getText();

        double displayValue = 0;

        //find Point in textField
        //If points more then one => point move
        int countPoint = dispFieldText.indexOf(".");
        if (0 < countPoint) {
            //replace second point in string
            //.replaceAll("[-+.^:,]","");
        }

        //get number from calculator display
        //if him is not null

        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }

        Object src = e.getSource();

        //for each button arifm action
        //remember him +, -, *, / save current number
        //in variable currentResult, and clear display

        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonUmnoz) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.buttonHalf) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");
        } else if (src == parent.resetCalc) {
            currentResult = 0;
            parent.displayField.setText("");
        } else if (src == parent.buttonEqual) {
            //do arifm action in dependence
            //from selectAction, refresh variable curentResult
            //and desk result on display if (src == parent.buttonEqual) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                //Convert result to string, add him
                //To empty string and desk him
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
                if (0 == displayValue) {
                    parent.displayField.setText("No action with Zero. Please try again");
                    currentResult = 0;
                }
            }
        } else {
            //for each num button join text on button to text on display
            //get name on icon
            String clickedButtonLabel = clickedButton.getText();
            parent.displayField.setText(dispFieldText + clickedButtonLabel);
        }

		/*
        //add text on button to text in widow message
		JOptionPane.showConfirmDialog(null, "You pressed " + clickedButtonLabel, "Just a text",
				JOptionPane.PLAIN_MESSAGE);
				*/
    }
}
