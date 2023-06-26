package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_ComboBox extends JFrame {
	public Ex06_ComboBox() {
		super("빅맥세트메뉴콜라제로");
		
		JPanel jp = new JPanel();
		String country[] = {"McDonalds","BurgerKing","Lotteria","Mom'sTouch"};
		JComboBox<String> jcb = new JComboBox<>(country); 		
		JComboBox<String> jcb2 = new JComboBox<>(country);
//		특정항목을 먼저 나오게 하는 방법
//		jcb.setSelectedIndex(3);
		jp.add(jcb);
		jp.add(jcb2);
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-100, ds.height/2-100, 200, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
	}
	
	public static void main(String[] args) {
		new Ex06_ComboBox();
	}
}
