package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*	대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 지정시키고
 * 	원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
 * 	출력되는 프로그램 작성
 * */

public class Ex02_Main extends JFrame implements ActionListener {

	JPanel jp1, jp2;
	JLabel jl1;
	JTextField jtf1;
	JButton jb1, jb2;
	JTextArea jta1;
	HashMap<String, String> map = new HashMap<>();

	public Ex02_Main() {
		super("수도 알아내기");

		jp1 = new JPanel();
		jl1 = new JLabel("나라 입력");
		jtf1 = new JTextField(20);
		jb1 = new JButton("선택");
		jb2 = new JButton("취소");
		jp2 = new JPanel();
		jta1 = new JTextArea(20, 40);
//		jta1.set

		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jb1);
		jp1.add(jb2);

		jp2.add(jta1);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jtf1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}

		});
		jb2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		if (obj == jb2) {
			jtf1.setText("");
			jta1.setText("");
//			커서 위치 지정
			jtf1.requestFocus();

		}

	}

//	위에 중복된 코드가 있으므로 메소드를 만들자
	public void dataPrn() {
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		Set<String> keys = map.keySet();

		if (jtf1.getText().length() == 0)
			jta1.append("데이터를 입력하세요\n");
		else {
			String str = jtf1.getText().trim();
			if (keys.contains(str)) {
				String city = map.get(str);
				jta1.append(str + "의 수도는 " + city + " 입니다\n");

			} else {
				jta1.append("데이터에 없는 나라입니다\n");
			}
			jtf1.setText("");
			jtf1.requestFocus();

		}
	}

	public static void main(String[] args) {
		new Ex02_Main();
	}
}
