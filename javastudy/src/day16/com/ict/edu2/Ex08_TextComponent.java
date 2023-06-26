package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.JTextComponent;

public class Ex08_TextComponent extends JFrame{
	public Ex08_TextComponent() {
		super("JTextComponent");
		
		JPanel jp = new JPanel();
		
//		JLabel	:	글자를 표시한다. 수정불가
		JLabel jLabel1 = new JLabel("ID:");
		JLabel jLabel2 = new JLabel();
		JLabel jLabel3 = new JLabel("자기소개");
		jLabel2.setText("PW: ");
		
//		JTextField	:	한줄 글자 입력
		JTextField jTxtF1 = new JTextField("아이디 입력하세요");
		jTxtF1.setColumns(20);//보이는 글자 길이
		JPasswordField jTxtF2 = new JPasswordField();
		jTxtF2.setText("");
		jTxtF2.setColumns(10);
		
//		jTextArea	:	메모장과 같이 여려 줄 글자 입력. jTextArea(행row,열columns);
		JTextArea jTxtA1 = new JTextArea(5,20);
		
//		jTextArea는 두가지 옵션을 생각해야 된다.
//		자동 줄바꿈
		jTxtA1.setLineWrap(true);
		
//		스크롤기능
		JScrollPane jSP = new JScrollPane(jTxtA1,
					ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jp.add(jLabel1);
		jp.add(jTxtF1);
		jp.add(jLabel2);
		jp.add(jTxtF2);
		jp.add(jLabel3);
		jp.add(jSP);
		add(jp);
		
		
//		JTextComponent jtxt = new J

		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new Ex08_TextComponent();
	}
}
