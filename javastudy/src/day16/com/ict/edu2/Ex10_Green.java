package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel {
	public Ex10_Green() {
		setBackground(Color.green);
		JCheckBox jCB1 = new JCheckBox("가");
		JCheckBox jCB2 = new JCheckBox("나");
		JCheckBox jCB3 = new JCheckBox("다");
		JCheckBox jCB4 = new JCheckBox("라");
		jCB1.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB2.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB3.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB4.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		add(jCB1);
		add(jCB2);
		add(jCB3);
		add(jCB4);
	
	}
}
