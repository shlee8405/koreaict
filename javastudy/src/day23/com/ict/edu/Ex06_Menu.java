package day23.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex06_Menu extends JFrame{

	
//	메뉴	: 메뉴바, 메뉴, 메뉴아이템
//	메뉴바에 메뉴를 붙인다. 메뉴에 메뉴아이템을 붙인다.
//	메뉴아이템 -> 메뉴 -> 메뉴바 -> 프레임
//	메뉴바는 프레임에 붙인다. (setJMenuBar)
	
	
	JTextArea jta ;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu m_file, m_form, font_form, m_help ;
	JMenuItem i_newFile, i_openFile, i_saveFile, i_exitFile, 
				i_item1, i_item2, i_item3,
				i_help, i_info;
	
	public Ex06_Menu() {
		super("메뉴");

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		//메뉴바
		jmb = new JMenuBar();
		
		//메뉴
		m_file = new JMenu(" 파 일 ");
		m_form = new JMenu(" 서 식");
		font_form = new JMenu(" 글자 서식 ");
		m_help = new JMenu(" 도 움 말 ");
		
		//메뉴아이템
		i_newFile = new JMenuItem("새 파일");
		i_openFile = new JMenuItem("파일 열기");
		i_saveFile = new JMenuItem("저장 하기");
		i_exitFile = new JMenuItem("종료");
		i_item1 = new JMenuItem("Times New Roman");
		i_item2 = new JMenuItem("Courtier");
		i_item3 = new JMenuItem("Helveta");
		i_help = new JMenuItem("도움!");
		i_info = new JMenuItem("정보");
		
		
		
		m_file.add(i_newFile);
		m_file.add(i_openFile);
		m_file.add(i_saveFile);
		m_file.add(i_exitFile);
		m_form.add(font_form);
		font_form.add(i_item1);
		font_form.add(i_item2);
		font_form.add(i_item3);
		
		m_help.add(i_help);
		m_help.add(i_info);
		
		jmb.add(m_file);
		jmb.add(m_form);
		jmb.add(m_help);
		
		
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setJMenuBar(jmb);
		add(jsp);
		
		
		i_newFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//메모장 안에 글자 존재 여부
				int size = jta.getText().length();
				if(size == 0 ) {
					jta.setText("");
				} else {
					int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 제목 없음에 저장하시겠습니까?", "간단 메모장", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
					
				}
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Ex06_Menu();
	}
}
