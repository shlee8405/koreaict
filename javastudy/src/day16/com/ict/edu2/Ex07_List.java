package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex07_List extends JFrame {
	public Ex07_List() {
		super("빅맥세트메뉴콜라제로");
		
		JPanel jp = new JPanel();
		String country[] = {"McDonalds","BurgerKing","Lotteria","Mom'sTouch"};
		JList<String> jl1 = new JList<>(country); 		
		JList<String> jl2 = new JList<>(country);
//		특정항목을 먼저 나오게 하는 방법
		
//		j.setLocation(1000, 100);
		jp.add(jl1);
		jp.add(jl2);
		add(jp);
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	}
	
	public static void main(String[] args) {
		new Ex07_List();
	}
}
