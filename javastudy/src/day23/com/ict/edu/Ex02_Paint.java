package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame{
	
//	다른 클래스에서는 내부클래스를 별도로 생성할 수 없다.
//	내부클래스를 포함하고 있는 클래스에서는 내부클래스를 생성할 수 있다
	
	CanvasTest canvas = new CanvasTest();
	JPanel headerPanel;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	String[] items = {"5","10","15","20","25","30"};
	JComboBox<String> jCom ;
	Color color;
	int x = -5, y=-5, wh =5;
	
	public Ex02_Paint() {
		super("그림판 ver0.01");
		headerPanel = new JPanel();
		jb1 = new JButton(" ");
		jb1.setBackground(Color.red);
		jb2 = new JButton(" ");
		jb2.setBackground(Color.green);
		jb3 = new JButton(" ");
		jb3.setBackground(Color.blue);
		jb4 = new JButton(" ");
		jb4.setBackground(Color.cyan);
		jb5 = new JButton(" ");
		jb5.setBackground(Color.yellow);
		jb6 = new JButton(" ");
		jb6.setBackground(Color.magenta);
		
		jCom = new JComboBox<String>(items); 

		jb7 = new JButton("CLEAR");
		
		headerPanel.add(jb1);
		headerPanel.add(jb2);
		headerPanel.add(jb3);
		headerPanel.add(jb4);
		headerPanel.add(jb5);
		headerPanel.add(jb6);
		headerPanel.add(jCom);
		headerPanel.add(jb7);
		
		add(headerPanel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		setSize(600,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton) e.getSource();
				color = obj.getBackground();
				
			}
		});
		jb7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				x = -5;
				y = -5;
				wh = 5 ;
				jCom.setSelectedIndex(0);
				// 삭제
				canvas.removeNotify();
				canvas.addNotify();
				
				
			}
		});
		
		
		
		jCom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
					case "5":
						wh = 5;
						break;
					case "10":
						wh = 10;
						break;
					case "15":
						wh = 15;
						break;
					case "20":
						wh = 20;
						break;
					case "25":
						wh = 25;
						break;
					case "30":
						wh = 30;
						break;
					default:
						break;
					}
				}
				
			}
		});
		
		canvas.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				canvas.repaint();
			}
		});
		
		
	}

	
	
	
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
			
		}
		
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}
	
	public static void main(String[] args) {
		new Ex02_Paint();
	}
	
}
