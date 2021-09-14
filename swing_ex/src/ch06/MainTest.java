package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame{
	
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel;
	
	int among1XPoint = 0;
	int among1YPoint = 370;
	int among2XPoint = 200;
	int among2YPoint = 200;
	
	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();
		
		Thread thread = new Thread(customJPanel);
		thread.start();
	}

	private void initData() {
		setTitle("미니 어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File ("among1.png"));
			amongImage2 = ImageIO.read(new File ("among2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("파일이 없습니다.");
			e.printStackTrace();
		}

		customJPanel = new CustomJPanel();
		
		
	}

	private void setInitLayout() {
		setVisible(true);
		add(customJPanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch(code) {
				case KeyEvent.VK_UP : 
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN :
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT :
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT :
					among2XPoint += 10;
					break;
				}
				// 그림을 다시 그려라.
				repaint();
			}
		});
		
	}
	
	private class CustomJPanel extends JPanel implements Runnable {
		@Override
		public void paint(Graphics g) {
			g.drawImage(backgroundImage, 0, 0, 600, 600, null );
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null );
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null );
		}
		
		
		@Override
		public void run() {
			
			boolean flag = true;
			boolean direction = true;
			while(flag) {
				
				if(direction) {
					among1XPoint = among1XPoint + 10;
				}else {
					among1XPoint = among1XPoint - 10;
				}
				
				if(among1XPoint == 400) {
					direction = false;
				}
				
				if(among1XPoint == 0) {
					direction = true;
				}
				
				if(among1XPoint == among2XPoint && among1YPoint == among2YPoint) {
					amongImage2 = null;
					flag = false;
				}
				
				repaint();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		}
		
	} // end of inner class
	
}



public class MainTest {

	public static void main(String[] args) {
		
		new MiniAmongUs();

	}

}
