package fain.calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    //Initialization all components of Calculator
    JPanel windowContent;
    JTextField displayField;

    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    JButton buttonPoint;
    JButton buttonEqual;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonHalf;
    JButton buttonUmnoz;

    JButton resetCalc;

    JPanel p1;
    JPanel p2;

    //In constructor creates all component
    //And add on frame with combination
    //BorderLayout and GridLayout

    Calculator() {
        windowContent = new JPanel();

        //set schema for panel
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        //Create and describe field
        //add him in to north state of window
        displayField = new JTextField(30);
        windowContent.add("North", displayField);


        //Create button use constructor
        //Who have 12 buttons, 10 button - num
        //and button "." and "="

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonHalf = new JButton("/");
        buttonUmnoz = new JButton("*");

        resetCalc = new JButton("C");

        //Create panel with GridLayout
        //Who have 12buttons, 10 - num
        //and "." and "="
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        p2 = new JPanel();
        GridLayout gr = new GridLayout(4, 2);
        p2.setLayout(gr);

        //add buttons on panel
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonUmnoz);
        p2.add(buttonHalf);
        p2.add(buttonPoint);
        p2.add(buttonEqual);
        p2.add(resetCalc);


        //Set panel p1 in center state of Window
        windowContent.add("Center", p1);
        windowContent.add("East", p2);

        //Create frame and set his main panel
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        //Set window size enough for input all components
        frame.pack();

        //Set window is visible
        frame.setVisible(true);


        //add listener for all buttons:
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonHalf.addActionListener(calcEngine);
        buttonUmnoz.addActionListener(calcEngine);

        resetCalc.addActionListener(calcEngine);
    }
}
