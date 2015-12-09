package calculator;

import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculator {
	public static void main (String [] args) {
		//create panel

		
		JPanel windowContent= new JPanel();

		//create manager describer for this panel
		GridLayout gr = new GridLayout(4, 2);
		windowContent.setLayout(gr);
		
		//create component in memory
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Sum:");
		JTextField result = new JTextField(10);
		JButton go = new JButton("Add");
		
		//add component on panel
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(result);
		windowContent.add(go);
		
		//Create frame and set panel for him
		JFrame frame = new JFrame("My First Calculator");
		frame.setContentPane(windowContent);
		
		//set size and set frame visible
		frame.setSize(400, 100);
		frame.setVisible(true);
	}
}
