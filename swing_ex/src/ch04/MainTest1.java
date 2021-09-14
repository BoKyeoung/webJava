package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	
	private Image image;
	
	public ImagePanel( ) {
		image = new ImageIcon("image.jpg").getImage();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
} // JPanel

class MyFrame extends JFrame{
	
	ImagePanel imagePanel;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}
	private void initData() {
		// 기본코드 작성
		setTitle("기본 패널 연습");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		// ImagePanel 메모리 올리기
	}
	private void setInitLayout() {
		// 기본코드
		// add();
		setVisible(true);
		add(imagePanel);
	}
	
}


public class MainTest1 {

	public static void main(String[] args) {
		new MyFrame();

	}

}
