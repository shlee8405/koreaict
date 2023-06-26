package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ex02_Canvas extends JFrame {
	public Ex02_Canvas() {
		super();
		add(new CanvasTest());

		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private class CanvasTest extends Canvas {
		public CanvasTest() {
		}

		@Override
		public void paint(Graphics g) {
			setBackground(Color.gray);
			
			//drawing lines
			g.setColor(Color.yellow);

			g.drawLine(10, 10, 110, 10);
			g.drawLine(10, 10, 10, 110);
			g.drawLine(110, 10, 110, 110);
			g.drawLine(10, 110, 110, 110);
			
			g.setColor(Color.magenta);
			
			g.drawLine(10, 10, 110, 110);
			g.drawLine(110, 10, 10, 110);
			
			// rectangle : drawRect(시작위치, 넓이,높이)
			g.drawRect(120, 10, 100, 100);
			g.drawRect(130, 20, 80, 80);
			g.drawRect(140, 30, 60, 60);
			g.drawRect(150, 40, 40, 40);
			g.drawRect(160, 50, 20, 20);
			
			// filled rectangle (시작위치, 넓이 높이)
			g.setColor(Color.yellow);
			g.fillRect(230, 10, 100, 100);
			g.setColor(Color.red);
			g.fillRect(240, 20, 80, 80);
			g.setColor(Color.blue);
			g.fillRect(250, 30, 60, 60);
			
			
			
			// 둥근 모서리 사각형 : drawRoundRect(시작위치, 높이, 넓이, 호넓이, 호높이)
			// 둥근 모서리 채워진 사각형 : fillRoundRect(시작위치, 높이, 넓이, 호넓이, 호높이)
			g.setColor(Color.cyan);
			g.drawRoundRect(340, 10, 100, 100, 15, 15);
			g.setColor(Color.red);
			g.drawRoundRect(350, 20, 80, 80, 3000, 80);
			g.setColor(Color.ORANGE);
			g.fillRoundRect(370, 40, 40, 40, 20, 20);
			
			// 원 : drawOval (시작위치, 넓이, 높이)
			// 채워진 : fillOval ('')
			// 색 지정 : color(0~255, 255,255, opacity)
			g.setColor(new Color(55	,55,55,190));
			g.fillOval(10,120,100,100);
			g.setColor(new Color(75,75,180,180));
			g.fillOval(20, 130, 80, 80);
			
			//글자 : drawString("글자" , 시작위치(글자 및 부분))
			g.setColor(Color.black);
			g.drawString("KOREA", 120, 170);
			g.setColor(Color.white);
			g.drawLine(0, 170, 220, 170);
			
			// new Font("글꼴" , style, size)
			// style : bold, italic, plain
			g.setFont(new Font("궁서", Font.PLAIN, 50));
			g.drawString("대한민국", 230, 190);
			
			// 이미지
			Image image1 = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
			g.drawImage(image1, 10, 230 ,this);
			g.drawImage(image1, 120, 230 , 100,100 ,this);
			Image image2 = Toolkit.getDefaultToolkit().getImage("src/images/java2.png");
			g.drawImage(image2, 230,230, rootPane);
			try {
				BufferedImage image2_1;
				image2_1 = ImageIO.read(new File("src/images/java2.png"));
				g.drawImage(image2_1, 340, 230, 100, 100,new Color(152,132,0,150),this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Image image3 = Toolkit.getDefaultToolkit().getImage("src/images/java3.png");
			g.drawImage(image3, 10, 340, this);
			Image image3_1 = new ImageIcon("src/images/java3.png").getImage();
			g.drawImage(image3_1, 110, 340,new Color(255,12,50,150), this);
			
			
		}

	}

	public static void main(String[] args) {
		new Ex02_Canvas();
	}
}
