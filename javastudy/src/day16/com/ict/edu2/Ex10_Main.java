package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame{
	public Ex10_Main() {
		super("Main Execution");
		Ex10_Blue jp1 = new Ex10_Blue();
		Ex10_Cyan jp2 = new Ex10_Cyan();
		Ex10_Green jp3 = new Ex10_Green();
		
		JTabbedPane jtp1 = new JTabbedPane();
		
		jtp1.addTab("블루 탭",jp1);
		jtp1.addTab("씨안 탭",jp2);
		jtp1.addTab("그린 탭",jp3);
		

		add(jtp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		new Ex10_Main();
		
	}
}
