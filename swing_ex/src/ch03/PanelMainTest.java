package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	
	// ���� Ŭ����  - static ���� ���� Ŭ����, �͸� ���� Ŭ����
	public void paint (Graphics g) {
		super.paint(g);
//		g.drawString("�ݰ����ϴ�.", 10, 20);
//		g.drawLine(20, 30, 100, 100); // ���� �ߴ� x�� y��
//		g.drawRect(100, 100, 150, 150);
		
		// 800, 800 : x => 0 ~ 800y => 0 ~ 800
		
		g.drawRect(200, 200, 200, 200);
		g.drawLine(300, 100, 200, 200);
		g.drawLine(300, 100, 400, 200);
	}
	
} // end of MyPanel

class MyFrame extends JFrame{
	
	MyPanel panel;
	
	public MyFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("java 2D Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		panel = new MyPanel();
	}
	private void setInitLayout() {
		setVisible(true);
		add(panel);
	}
	
	
} // end of MyFrame

public class PanelMainTest {

	public static void main(String[] args) {
		new MyFrame();
		
	}
	
}



















