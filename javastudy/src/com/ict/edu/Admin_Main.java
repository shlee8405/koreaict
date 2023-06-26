package com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Admin_Main extends JFrame{
	CardLayout cardLayout;
	JPanel cardPanel;
	JMenuBar jmb;
	JMenu m_travelLocation, m_users;
	
	public Admin_Main() {
		super("관리자");
		
		jmb = new JMenuBar();
		m_travelLocation = new JMenu(" 관광지 ");
		m_users = new JMenu(" 사용자 ");
		
		jmb.add(m_travelLocation);
		jmb.add(m_users);
		setJMenuBar(jmb);
		
		setSize(1000,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
				
		
	}
	
	public static void main(String[] args) {
		new Admin_Main();
	}
}
