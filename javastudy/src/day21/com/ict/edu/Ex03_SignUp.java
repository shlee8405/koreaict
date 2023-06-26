package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex03_SignUp extends JFrame{
	Ex03_Main main;
	JPanel jp1;
	JButton jb1;
	public Ex03_SignUp(Ex03_Main main) {
		this.main = main;
		jp1 = new JPanel();
		jb1 = new JButton("뒤로가기");
		
		jp1.add(new JLabel("회원가입 완료"));
		jp1.add(jb1);
		add(jp1);
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				main.setVisible(true);
//				System.exit(0);
				setVisible(false);
				main.setLocationRelativeTo(null);
				
				
			}
		});
		
	}
}
