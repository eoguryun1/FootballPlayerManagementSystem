package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerAdder extends JPanel{
	
	WindowFrame frame;
	
	public PlayerAdder(WindowFrame frame) {
		
		this.frame=frame;
		
		JPanel panel=new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName=new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldName=new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelBackNumber=new JLabel("BackNumber: ",JLabel.TRAILING);
		JTextField fieldBackNumber=new JTextField(10);
		labelBackNumber.setLabelFor(fieldBackNumber);
		panel.add(labelBackNumber);
		panel.add(fieldBackNumber);
		
		JLabel labelPosition=new JLabel("Position: ",JLabel.TRAILING);
		JTextField fieldPosition=new JTextField(10);
		labelPosition.setLabelFor(fieldPosition);
		panel.add(labelPosition);
		panel.add(fieldPosition);
		
		JLabel labelPhoneNumber=new JLabel("PhoneNumber: ",JLabel.TRAILING);
		JTextField fieldPhoneNumber=new JTextField(10);
		labelPhoneNumber.setLabelFor(fieldPhoneNumber);
		panel.add(labelPhoneNumber);
		panel.add(fieldPhoneNumber);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6,6,6,6);
		

		this.add(panel);
		this.setVisible(true);
	}

}
