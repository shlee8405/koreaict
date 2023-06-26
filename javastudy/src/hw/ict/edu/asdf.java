package hw.ict.edu;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class asdf extends JFrame {
	JPanel jPHeader, jPFooter, jPCustomer, jPName,jPAddress,jPPhone;
	JTextField jTCustomer, jTName, jTAddress, jTPhone;
	JLabel jLCustomer, jLName, jLAddress, jLPhone;
	JTextArea jTA; 
	JButton jB1, jB2, jB3,jB4,jB5,jB6;
	GridLayout gridLayout ;
	public asdf() {
		super("DB 연동 정보");
		gridLayout = new GridLayout(1,0);
		
		jPHeader = new JPanel();
		jPFooter = new JPanel();
		jPCustomer = new JPanel();
		jPName = new JPanel();
		jPAddress = new JPanel();
		jPPhone = new JPanel();
		
		
		jTCustomer = new JTextField(30);
		jTName = new JTextField(30);
		jTAddress = new JTextField(30);
		jTPhone = new JTextField(30);
		jLCustomer = new JLabel("CUSTARD : ");
		jLName = new JLabel("RAMEN : ");
		jLAddress = new JLabel("ANDRES : ");
		jLPhone = new JLabel("PONNY : ");
		jLCustomer.setHorizontalAlignment(JLabel.CENTER);
		jLName.setHorizontalAlignment(JLabel.CENTER);
		jLAddress.setHorizontalAlignment(JLabel.CENTER);
		jLPhone.setHorizontalAlignment(JLabel.CENTER);
		jPCustomer.add(jLCustomer);
		jPCustomer.add(jTCustomer);
		jPName.add(jLName);
		jPName.add(jTName);
		jPAddress.add(jLAddress);
		jPAddress.add(jTAddress);
		jPPhone.add(jLPhone);
		jPPhone.add(jTPhone);
		
		
		
		jPHeader.add(jPCustomer);
		jPHeader.add(jPName);
		jPHeader.add(jPAddress);
		jPHeader.add(jPPhone);
		jPCustomer.setLayout(gridLayout);
		jPName.setLayout(gridLayout);
		jPAddress.setLayout(gridLayout);
		jPPhone.setLayout(gridLayout);
		jPHeader.setLayout(new GridLayout(4,0));
		
		//footer
		jB1 = new JButton("전체보기");
		jB2 = new JButton("삽입");
		jB3 = new JButton("삭제");
		jB4 = new JButton("검색");
		jB5 = new JButton("불러오기");
		jB6 = new JButton("고치기");
		jPFooter.add(jB1);
		jPFooter.add(jB2);
		jPFooter.add(jB3);
		jPFooter.add(jB4);
		jPFooter.add(jB5);
		jPFooter.add(jB6);
		jB6.setEnabled(false);
		jTA = new JTextArea();
		
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		add(jPHeader, BorderLayout.NORTH);
		add(jTA, BorderLayout.CENTER);
		add(jPFooter, BorderLayout.SOUTH);
		
		
	}

	public static void main(String[] args) {
		new asdf();
	}

}
