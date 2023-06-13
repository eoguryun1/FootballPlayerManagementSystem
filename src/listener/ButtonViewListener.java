package listener;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

import gui.PlayerViewer;
import gui.WindowFrame;

import java.awt.event.ActionListener;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame=frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b= (JButton) e.getSource();
		PlayerViewer v = frame.getV();
		frame.setupPanel(v);

	}

}
