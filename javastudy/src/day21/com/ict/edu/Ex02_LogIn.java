package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex02_LogIn extends JPanel{
	
//	메인에 있는 cardLayout, jp1를 이용하기 위해서 정보를 받아야한다
//	새로 만들면 정보교류를 할 수 없다.
	JButton logInBtn, createAccBtn;
	CardLayout cardLayout;
	JPanel cardPanel;
	
	public Ex02_LogIn(CardLayout cardLayout, JPanel cardPanel) {
//		생성자에서 받은 인자는 무조건 전역변수로 만들자
		this.cardLayout = cardLayout;
		this.cardPanel = cardPanel;
		
		logInBtn = new JButton("Log In");
		createAccBtn = new JButton("Create Account");
		
		add(logInBtn);
		add(createAccBtn);
		
		logInBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "signIn");
				
			}
		});
		createAccBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardPanel, "okLogIn");
				
			}
		});
		
	}
	
	
}
