package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Ex09_JTab extends JFrame{
	
	public Ex09_JTab() {
		super("JTab");
		
		
//		XXXPane = 컨테이너 = 다른 컨테이너를 가질 수 있고, 컴포넌트도 가질 수 있다
		
		JTabbedPane jTab1 = new JTabbedPane();
		

		
		JPanel jP1 = new JPanel();
		
//		배경색
		jP1.setBackground(Color.cyan);
		JButton jB1 = new JButton(" + ");
		JButton jB2 = new JButton(" - ");
		JButton jB3 = new JButton(" * ");
		JButton jB4 = new JButton(" / ");
		jP1.add(jB1);
		jP1.add(jB2);
		jP1.add(jB3);
		jP1.add(jB4);
		jTab1.addTab("블루 탭", jP1);
		
		JPanel jP2 = new JPanel();
		jP2.setBackground(Color.YELLOW);
		JRadioButton jRB1 = new JRadioButton(" + ");
		JRadioButton jRB2 = new JRadioButton(" - ");
		JRadioButton jRB3 = new JRadioButton(" * ");
		JRadioButton jRB4 = new JRadioButton(" / ");
		jRB1.setBackground(Color.gray);
		jRB2.setBackground(Color.gray);
		jRB3.setBackground(Color.gray);
		jRB4.setBackground(Color.darkGray);
		ButtonGroup bG = new ButtonGroup();
		bG.add(jRB1);
		bG.add(jRB2);
		bG.add(jRB3);
		bG.add(jRB4);		
		jP2.add(jRB1);
		jP2.add(jRB2);
		jP2.add(jRB3);
		jP2.add(jRB4);
		jTab1.addTab("옐로 탭",jP2);
		
		JPanel jP3 = new JPanel();
		jP3.setBackground(Color.gray);
		JCheckBox jCB1 = new JCheckBox("가");
		JCheckBox jCB2 = new JCheckBox("나");
		JCheckBox jCB3 = new JCheckBox("다");
		JCheckBox jCB4 = new JCheckBox("라");
		jCB1.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB2.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB3.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jCB4.setBackground(Color.getHSBColor((float) 30.4, (float)44.6, (float)63.9));
		jP3.add(jCB1);
		jP3.add(jCB2);
		jP3.add(jCB3);
		jP3.add(jCB4);
		jTab1.addTab("블랙 탭", jP3);
		
		add(jTab1);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex09_JTab();
	}
}
