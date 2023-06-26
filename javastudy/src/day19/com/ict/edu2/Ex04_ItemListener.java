package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex04_ItemListener extends JFrame implements ItemListener, ActionListener {
	JPanel jp1, jp2, jp3;
	JCheckBox cb1, cb2, cb3, cb4;
	JButton jb1, jb2;
	JTextArea jta1;
	JScrollPane jsp1;

	public Ex04_ItemListener() {
		super("체크박스 이벤트 처리");

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		cb1 = new JCheckBox("축구");
		cb2 = new JCheckBox("야구");
		cb3 = new JCheckBox("농구");
		cb4 = new JCheckBox("배구");
		jb1 = new JButton("clear");
		jb2 = new JButton("exit");

		jp1.add(cb1);
		jp1.add(cb2);
		jp1.add(cb3);
		jp1.add(cb4);

		jta1 = new JTextArea(10,0);
		jta1.setLineWrap(true);
		jsp1 = new JScrollPane(jta1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta1.setEditable(false);
		jp2.add(jsp1);

		jp3.add(jb1);
		jp3.add(jb2);

		add(jp1, BorderLayout.NORTH);
		add(jsp1, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);


		pack();
		setLocationRelativeTo(jsp1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);

	}
//	ItemListener 해결하는 추상 메소드
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox obj = (JCheckBox) e.getSource();
		if(e.getStateChange()==e.SELECTED) {
			jta1.append(obj.getText()+"를 선택했습니다\n");
		}else if (e.getStateChange()==e.DESELECTED) {
			jta1.append(obj.getText()+"를 해제했습니다\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if(obj == jb1) {
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb4.setSelected(false);
			jta1.setText("");
		} else if (obj == jb2) {
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		new Ex04_ItemListener();
	}


}
