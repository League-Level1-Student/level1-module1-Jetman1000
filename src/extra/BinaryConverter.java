package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	
	JButton button=new JButton("Convert");
	JTextField text=new JTextField(20);
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JLabel label=new JLabel();
	
	
	public BinaryConverter() {
		frame.add(panel);
		panel.add(text);
		panel.add(label);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	public void setUp() {
		
	}
		
	public static void main(String[] args) {
	BinaryConverter converter=new BinaryConverter();
	


	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed=(JButton) arg0.getSource();
	if(buttonPressed==button) {
		String input=text.getText();
		convert(input);
	}
}

String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}
