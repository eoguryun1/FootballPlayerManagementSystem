package listener;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

import gui.PlayerAdder;
import gui.PlayerViewer;
import gui.WindowFrame;

import java.awt.event.ActionListener;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton) e.getSource();
		PlayerAdder pa = frame.getPa();
		frame.setupPanel(pa);

	}

}
