package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex02_LogIn_Ok extends JPanel {

	Ex02_Main main;
	JButton jb1;

	public Ex02_LogIn_Ok(Ex02_Main main) {
		this.main = main;
		jb1 = new JButton("뒤로가기");

		add(new JLabel("Hello"));
		add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.cardPanel,"logIn");
				
			}
		});
	}
}
