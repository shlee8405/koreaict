package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_Layout extends JFrame{
	public Ex07_Layout() {
		super("절대좌표 : null");
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		jb1.setBounds(10, 10, 200, 400);
		jb2.setBounds(220,10,50,50);
		jb3.setBounds(280, 10, 70, 70);
		jb4.setBounds(220,70,50,340);
		jb5.setBounds(10, 420, 460, 20);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex07_Layout();
	}
}
