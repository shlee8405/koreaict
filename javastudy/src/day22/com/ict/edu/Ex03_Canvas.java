package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ex03_Canvas extends Canvas{

	@Override
	public void paint(Graphics g) {
	
		
		Image image1 = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
		g.drawImage(image1, 10, 230 ,this);
		g.drawImage(image1, 120, 230 , 100,100 ,this);
		Image image2 = Toolkit.getDefaultToolkit().getImage("src/images/java2.png");
		g.drawImage(image2, 230,230, this);
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
