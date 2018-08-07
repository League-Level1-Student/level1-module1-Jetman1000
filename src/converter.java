import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class converter implements ActionListener {
	//objects here---->
	JFrame window=new JFrame();
	JButton button= new JButton("convert");
	JPanel panel= new JPanel();
	JTextField text = new JTextField("     ");
	JLabel label = new JLabel();
	
	
public static void main(String[] args) {
	converter tc=new converter();

	}
converter(){
	
	window.setVisible(true);
	window.add(panel);
	panel.add(label);
	panel.add(button);
	panel.add(text);
	window.pack();
	button.addActionListener(this);

		
		
		
		
		
		
		
		
	
	}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton buttonPressed= (JButton) arg0.getSource();
	if(buttonPressed==button) {
		
		
	
	String answer= text.getText();
	int answer2= Integer.parseInt(answer); 
	double celi=((5.0/9.0)*answer2)-32;
JOptionPane.showMessageDialog(null, celi);		
	}
}
}
