package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex02_Join extends JPanel{
	Ex02_Main main;
	JButton jb1;
	JLabel jl1;
	public Ex02_Join(Ex02_Main main) {
		this.main = main;
		
		jb1 = new JButton("회원가입");
		add(new JLabel("회원가입 창입니다"));
		add(jb1);
//		jb1.setLayout(BorderLayout.CENTER);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.cardPanel,"logIn");
				
			}
		});
		
	}
}
