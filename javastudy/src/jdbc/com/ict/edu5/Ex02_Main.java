package jdbc.com.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex02_Main extends JFrame{
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
    JTextField jtf1, jtf2, jtf3, jtf4;
    JButton jb1, jb2, jb3, jb4, jb5;//jb6
    JTextArea jta;
    JScrollPane jsp;

	public Ex02_Main() {
		super("DB 연동 정보");
        jp1 = new JPanel(new GridLayout(0, 2));
        jp2 = new JPanel(new GridLayout(0, 2));
        jp3 = new JPanel(new GridLayout(0, 2));
        jp4 = new JPanel(new GridLayout(0, 2));
        jp5 = new JPanel(new GridLayout(4, 0));
        jp6 = new JPanel();

        jtf1 = new JTextField();
        jtf2 = new JTextField();
        jtf3 = new JTextField();
        jtf4 = new JTextField();

        jb1 = new JButton("전체보기");
        jb2 = new JButton("삽입");
        jb3 = new JButton("삭제");
//        jb4 = new JButton("검색");
        jb5 = new JButton("검색");
//        jb6 = new JButton("고치기");
//        jb6.setEnabled(false);

        jp1.add(new JLabel("CUSTID  :  ", JLabel.CENTER));
        jp1.add(jtf1);

        jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
        jp2.add(jtf2);

        jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
        jp3.add(jtf3);

        jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
        jp4.add(jtf4);

        jp5.add(jp1);
        jp5.add(jp2);
        jp5.add(jp3);
        jp5.add(jp4);

        jta = new JTextArea();
        jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jta.setLineWrap(true);
        jta.setEditable(false);

        jp6.add(jb1);
        jp6.add(jb2);
        jp6.add(jb3);
//        jp6.add(jb4);
        jp6.add(jb5);
//        jp6.add(jb6);

        add(jp5, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        add(jp6, BorderLayout.SOUTH);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jta.setFont(new Font("굴림", Font.PLAIN, 10));
        jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				printJTA();
			}
        	
        });
        
        jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				
				//custid 중복이면 삽입불가
				//custid가 null이면 삽입불가
				//and 조건
				if (custid.length() > 0) {
					
					boolean idchk = Ex02_DAO.getInstance().getIdCheck(custid);
					if(idchk) {
						jta.setText("");
						Ex02_VO vo = new Ex02_VO();
						vo.setCustId(custid);
						vo.setName(name);
						vo.setAddress(address);
						vo.setPhone(phone);
						int res = Ex02_DAO.getInstance().getInsert(vo);
						if (res > 0) {
							printJTA();
						} else {
							JOptionPane.showMessageDialog(getParent(), "삽입실패");
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "같은 custid가 존재합니다");
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
        
        jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
			
				//custid 중복이면 삭제불가
				//custid가 null이면 삭제불가
				//and 조건
				if (custid.length() > 0) {
					boolean idchk = Ex02_DAO.getInstance().getIdCheck(custid);
					jta.setText("");
					
					if(idchk) {
						JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						printJTA();
					} else {
						Ex02_VO vo = new Ex02_VO();
						vo.setCustId(custid);
						int result = Ex02_DAO.getInstance().getDelete(vo);
						if(result >0) {
							printJTA();
						}else {
							JOptionPane.showMessageDialog(getParent(), "삭제실패");
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});
        
        jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) (e.getSource());
				String msg = obj.getText();
				if(msg.equals("고치기")) {
					jb5.setText("검색");
				}else if (msg.equals("검색")) {
					String custid = jtf1.getText().trim();
					if (custid.length() > 0) {
						boolean idchk = Ex02_DAO.getInstance().getIdCheck(custid);
						jta.setText("");
						if(idchk) {
							JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
							jtf2.setText("");
							jtf3.setText("");
							jtf4.setText("");
						}else {
							Ex02_VO vo = new Ex02_VO();
							vo.setCustId(custid);
							Ex02_VO vo2 = Ex02_DAO.getInstance().getSelectOne(vo);
							jta.setText("");
							jtf2.setText(vo2.getName());
							jtf3.setText(vo2.getAddress());
							jtf4.setText(vo2.getPhone());
							jb5.setText("고치기");
						}
					} else {
						JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요");
						jtf2.setText("");
						jtf3.setText("");
						jtf4.setText("");
					}
				}
				
				
				
				
				
				
			}
		});

	}
	public static void main(String[] args) {
		new Ex02_Main();
	}
	
	public void printJTA() {
		ArrayList<Ex02_VO> list = Ex02_DAO.getInstance().getSelectAll();
		jta.append("\n\t\t 회원 전체 정보 \n \n \n");
		jta.append("\t 번호 \t 이름 \t주소 \t\t전화번호\n");
		for (Ex02_VO k : list) {
			jta.append("\t"+k.getCustId()+"\t");
			jta.append(k.getName()+"\t");
			jta.append(k.getAddress()+"        \t");
			jta.append(k.getPhone()+"\n");
		}
	}
}
