package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PlayerViewer extends JPanel{
	
	WindowFrame frame;
	
	public PlayerViewer(WindowFrame frame) {
		
		this.frame=frame;
		
		String column[]= {"Name", "BackNumber","Position", "PhoneNumber"};
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("BackNumber");
		model.addColumn("Position");
		model.addColumn("PhoneNumber");
		
		
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);;
		
		this.add(sp);
	}

}
