package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Lotto extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] images = new Image[45];
	CanvasTest canvas;
	TreeSet<Integer> set;

	public Ex03_Lotto() {
		super("로또 자동 생성기");

		canvas = new CanvasTest();

		jp = new JPanel();
		jb = new JButton("번호 생성");
		jp.add(jb);
		add(jp, BorderLayout.EAST);
		add(canvas, BorderLayout.CENTER);

		setSize(900, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.repaint();
			}
		});

	}

	private class CanvasTest extends Canvas {
		public CanvasTest() {
			for (int i = 0; i < images.length; i++) {
				images[i] = Toolkit.getDefaultToolkit().getImage("src/images/lotto_img/" + (i + 1) + ".gif");
			}
		}

		@Override
		public void paint(Graphics g) {
			int[] su = new int[6];
			set = new TreeSet<>();
			System.out.println("Size is "+set.size());
			if (set.size() != 6) {
				for (int j = 0; j < 6; j++) {
					set.add((int) (Math.random() * 45 + 1));
				}
			}
			
			System.out.println(set);
			System.out.println("Size is "+set.size());
			int num = 0;
			for (Integer k : set) {
				System.out.println(k);
				g.drawImage(images[k - 1], num++ * 100, getHeight() / 2 - 50, 100, 100, this);
			}
		}

	}

	public static void main(String[] args) {
		new Ex03_Lotto();
	}
}
