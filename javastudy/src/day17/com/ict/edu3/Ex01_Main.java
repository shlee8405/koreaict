package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex01_Main extends JFrame{
	Ex01_Main() {
		super("JTable");
		
		JPanel jp = new JPanel(); 
		
		Ex01_JTable tableModel = new Ex01_JTable();
		JTable table = new JTable(tableModel);
		jp.add(table);
		add(new JScrollPane(table));
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex01_Main();
	}
}
