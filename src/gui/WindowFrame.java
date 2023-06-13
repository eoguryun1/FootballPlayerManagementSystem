package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{

	MenuSelection menuselection;	
	PlayerAdder pa;
	PlayerViewer v;
	
	public WindowFrame() {
		
		this.menuselection=new MenuSelection(this);
		this.pa=new PlayerAdder(this);
		this.v=new PlayerViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PlayerAdder getPa() {
		return pa;
	}

	public void setPa(PlayerAdder pa) {
		this.pa = pa;
	}

	public PlayerViewer getV() {
		return v;
	}

	public void setV(PlayerViewer v) {
		this.v = v;
	}


}
