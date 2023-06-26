package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex10_Blue extends JPanel {
	public Ex10_Blue() {
		setBackground(Color.blue);
		JButton jb1 = new JButton("BUTTON 1");
		JButton jb2 = new JButton("BUTTON 2");
		JButton jb3 = new JButton("BUTTON 3");
		JButton jb4 = new JButton("BUTTON 4");
		
		jb1.setBackground(Color.red);
		jb2.setBackground(Color.red);
		jb3.setBackground(Color.red);
		jb4.setBackground(Color.red);
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
	
	}
	
}
