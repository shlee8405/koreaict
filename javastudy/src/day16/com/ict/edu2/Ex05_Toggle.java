package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame{

	
	public Ex05_Toggle() {
		super("토글");
		JPanel jp = new JPanel();
		
		JToggleButton jtg1 = new JToggleButton();
		jtg1.setText("첫번째 토글");
		JToggleButton jtg2 = new JToggleButton("두번째 토글");
		JToggleButton jtg3 = new JToggleButton("새번째 토글");
		JToggleButton jtg4 = new JToggleButton("네번째 토글");
		
		jp.add(jtg1);
		jp.add(jtg2);
		jp.add(jtg3);
		jp.add(jtg4);
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-200, 500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	
	}
	public static void main(String[] args) {
		new Ex05_Toggle();
	}
}
