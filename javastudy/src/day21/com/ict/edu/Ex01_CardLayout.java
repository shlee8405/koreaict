package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*	카드 레이아웃 : 카드가 뒤집혀 진 상태에서 이벤트가 발생하면 하나씩 보여주는 형태의 레이아웃
 * 				(여기서 카드란 JPANEL 이다) 
 * */ 

public class Ex01_CardLayout extends JFrame{
	JPanel card1, card2, card3, card4, card5, jp1, jp2;
	JButton jb1, jb2, jb3, jb4;
	CardLayout cardLayout;
	
	public Ex01_CardLayout() {
		super("카드레이아웃");
		
		cardLayout = new CardLayout();
		jp1 = new JPanel(cardLayout);
		jp2 = new JPanel();
	
		card1 = new JPanel();
		card1.setLayout(new BorderLayout());
		card1.add(new JLabel("첫번째 카드", JLabel.CENTER));
		card1.setBackground(Color.pink);
		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.add(new JLabel("두번째 카드", JLabel.CENTER));
		card2.setBackground(Color.blue);
		card3 = new JPanel();
		card3.setLayout(new BorderLayout());
		card3.add(new JLabel("세번째 카드", JLabel.CENTER));
		card3.setBackground(Color.cyan);
		card4 = new JPanel();
		card4.setLayout(new BorderLayout());
		card4.add(new JLabel("네번째 카드", JLabel.CENTER));
		card4.setBackground(Color.green);
		card5 = new JPanel();
		card5.setLayout(new BorderLayout());
		card5.add(new JLabel("다섯번째 카드", JLabel.CENTER));
		card5.setBackground(Color.magenta);
		
		jb1 = new JButton("<<");
		jb2 = new JButton("<");
		jb3 = new JButton(">");
		jb4 = new JButton(">>");
		
//		jp1 is CardLayout
//		jp1.add("호출이름", 해당 컨테이너)
//		해당 카드를 호출할때는 show(cardLayout,"호출이름")
		jp1.add("1",card1);
		jp1.add("2",card2);
		jp1.add("3",card3);
		jp1.add("4",card4);
		jp1.add("5",card5);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		
		
		add(jp1,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);

		pack();
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		
		jb1.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				cardLayout.show(jp1, "1");
				cardLayout.first(jp1);
				
			}
		});
		jb2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(jp1);
				
			}
		});
		jb3.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(jp1);
			}
		});
		jb4.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(jp1);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex01_CardLayout();
	}
}
