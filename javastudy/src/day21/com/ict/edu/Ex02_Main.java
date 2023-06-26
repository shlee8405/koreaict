package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame {
	CardLayout cardLayout;
	JPanel cardPanel;
	
	public Ex02_Main() {
		super("카드레이아웃2");
		
		cardPanel = new JPanel();
		cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);

		Ex02_LogIn loginPanel = new Ex02_LogIn(cardLayout, cardPanel);
		Ex02_Join joinPanel = new Ex02_Join(this);
		Ex02_LogIn_Ok okPanel = new Ex02_LogIn_Ok(this);
		
		cardPanel.add("logIn",loginPanel);
		cardPanel.add("signIn",joinPanel);
		cardPanel.add("okLogIn",okPanel);
		add(cardPanel);
		
		cardLayout.show(cardPanel, "logIn");
		
	
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
				
		
	}
	
	public static void main(String[] args) {
		new Ex02_Main();
	}
}
