package day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame {

	
	Ex05_Canvas canvas = new Ex05_Canvas();
	
	
	public Ex05_Main() {
		super("PAINT");
		
		
		
		add(canvas);
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
//		마우스 이벤트
//		ItemListener, ActionListener 처럼 오버라이딩 메서드가 하나가 아니라
//		2개 이상이면 불필요한 메서드까지 오버라이딩 하게 된다
		
		canvas.addMouseListener( new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.x_axis=e.getX();
				canvas.y_axis=e.getY();
				canvas.repaint();
			}
		});
		
		
		//어뎁터
		
//		canvas.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				super.mouseClicked(e);
//			}
//		});
	}
	public static void main(String[] args) {
		new Ex05_Main();
	}
}
