package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_Calc extends JFrame{
	public Ex01_Calc() {
		super("Calculator");
		
		
		JPanel jp1 = new JPanel();
		
//		JLabel jl1 = new JLabel("수1 : ");
		JTextField jtf1 = new JTextField(5);
		JLabel jl2 = new JLabel("수2 : ");
		JTextField jtf2 = new JTextField(5);
		JLabel jl3 = new JLabel("연산자 : ");
//		JTextField jtf3 = new JTextField(5);
		JRadioButton jrb1 = new JRadioButton(" + ");
		JRadioButton jrb2 = new JRadioButton(" - ");
		JRadioButton jrb3 = new JRadioButton(" / ");
		JRadioButton jrb4 = new JRadioButton(" * ");
//		JRadioButton 반드시 buttongroup
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
	
		jp1.add(new JLabel("수1 : "));
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		
		
//		JPanel jp2 = new JPanel();
		JTextArea jta1 = new JTextArea();
		jta1.setLineWrap(true);
		JScrollPane jsp1 = new JScrollPane(jta1, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
//		편집 불가능하게 만들자
		jta1.setEditable(false);
		
		JPanel jp2 = new JPanel();
		JButton jb1 = new JButton("초기화/ C");
		JButton jb2 = new JButton("전체초기화/ CE");
		JButton jb3 = new JButton("계산하기/ ENTER");
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		
		
		add(jp1,BorderLayout.NORTH);
		add(jsp1,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250,500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Ex01_Calc();
		
	}
	
}
