package ch09;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Play1945 extends JFrame{

	BufferedImage bgImage1; 
	BufferedImage bgImage2; 
	BufferedImage hero; 
	ImagePanel imagePanel; 
	
	final int WIDTH_SIZE = 600; 
	int bgX1; 
	int bgX2; 
	
	int heroX; 
	int heroY; 
	
	public Play1945() {
		initData(); 
		setInitLayout(); 
		addEventListener(); 
		
		// 쓰레드 생성 3번째 방법 
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
						
					bgX1--; 
					bgX2--; 
					
					if(bgX1 < -WIDTH_SIZE) {
						bgX1 = WIDTH_SIZE;
					}
					
					if (bgX2 < -WIDTH_SIZE) {
						bgX2 = WIDTH_SIZE;
					}
					repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
	}
	private void initData() {
		setSize(WIDTH_SIZE, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			bgImage1 = ImageIO.read(new File("background1.jpg"));
			bgImage2 = ImageIO.read(new File("background2.jpg"));
			hero = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.err.println("파일이 없습니다.");
		}
		imagePanel = new ImagePanel(); 
	}
	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if(code == KeyEvent.VK_LEFT) {
					heroX -= 10; 
				} else if(code == KeyEvent.VK_RIGHT) {
					heroX += 10; 
				}
				repaint();
			}
		});
	}

	private class ImagePanel extends JPanel {
		
		public ImagePanel() {
			bgX1 = 0;
			bgX2 = WIDTH_SIZE;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 캔버스를 비워주는 메서드 
			g.drawImage(bgImage1, bgX1, 0, WIDTH_SIZE, 600, null);
			g.drawImage(bgImage2, bgX2, 0, WIDTH_SIZE, 600, null);
			g.drawImage(hero, heroX, heroY, 100, 100, null);
			
		}
	}
	
	public static void main(String[] args) {
		new Play1945();
	}
	
}
