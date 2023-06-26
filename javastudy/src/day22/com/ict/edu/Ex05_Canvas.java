package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas {
	int x_axis = -50;
	int y_axis= -50;
	int size;
	
	
	@Override
	public void paint(Graphics g) {
		setBackground(Color.DARK_GRAY);
		int random1 = (int)(Math.random()*256);
		int random2 = (int)(Math.random()*256);
		int random3 = (int)(Math.random()*256);
		g.setColor(new Color(random1, random2, random3));
		g.fillOval(x_axis-15,y_axis-15, 30, 30);
	}
	
	//기존 내용을 그대로 따로 남겨 두고 추가하자
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
