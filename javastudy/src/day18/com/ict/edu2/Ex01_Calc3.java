package day18.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex01_Calc3 extends JFrame{
	public Ex01_Calc3() {
		super("계산기");
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(5);
		JTextField jtf2 = new JTextField(5);
		String[] items = {"선택하세요"," + ", " - ", " * ", " / "};
		
		JComboBox<String> jcb = new JComboBox<>(items);
		
		
		
		
		
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Ex01_Calc3();
		
	}
}
