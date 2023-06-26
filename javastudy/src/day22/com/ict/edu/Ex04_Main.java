package day22.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Ex04_Main extends JFrame {

	ButtonGroup bg;
	JRadioButton jrb1, jrb2;
	JPanel headerPanel;
	Ex04_Canvas canvas = new Ex04_Canvas();

	public Ex04_Main() {
		super("라디오 버튼을 이용해서 그림 선택");

		bg = new ButtonGroup();
		jrb1 = new JRadioButton("Image 1");
		jrb2 = new JRadioButton("Image 2");
		headerPanel = new JPanel();
		bg.add(jrb1);
		bg.add(jrb2);
		headerPanel.add(jrb1);
		headerPanel.add(jrb2);
		add(headerPanel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);

		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jrb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					canvas.image = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
					canvas.repaint();
				}
			}
		});
		jrb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					canvas.image = Toolkit.getDefaultToolkit().getImage("src/images/java2.png");
					add(canvas);
				}
			}
		});

	}

	public static void main(String[] args) {
		new Ex04_Main();
	}
}
