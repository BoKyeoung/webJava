package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame{
	
	BufferedImage backgroudImage;
	BufferedImage imageIcon;
	MyImagePanel ImagePanel;
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 이미지를 가지고 와서 사용하기
		try {
			backgroudImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다!");
			e.printStackTrace();
		}
		
		ImagePanel = new MyImagePanel();
		
	}
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(ImagePanel);
	}
	
	// 내부 클래스 생성
	class MyImagePanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroudImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 100, 100, null);
		}
	}// end of MyImagePanel(내부클래스)
	
	 
	
}

public class MainTest2 {

	public static void main(String[] args) {
		
		new MyFrame2();
	}

}
