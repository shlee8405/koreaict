package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_Cyan extends JPanel {

	public Ex10_Cyan() {
		setBackground(Color.cyan);
		JRadioButton jrb1 = new JRadioButton("BUTTON 1");
		JRadioButton jrb2 = new JRadioButton("BUTTON 2");
		JRadioButton jrb3 = new JRadioButton("BUTTON 3");
		JRadioButton jrb4 = new JRadioButton("BUTTON 4");
		ButtonGroup bg = new ButtonGroup();

		jrb1.setBackground(Color.gray);
		jrb2.setBackground(Color.gray);
		jrb3.setBackground(Color.gray);
		jrb4.setBackground(Color.gray);
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		add(jrb1);
		add(jrb2);
		add(jrb3);
		add(jrb4);

	}
}
