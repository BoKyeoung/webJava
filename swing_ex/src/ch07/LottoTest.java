package ch07;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyLottoFrame extends JFrame{
	
	JButton btn;
	MyLottoPanel myLottoPanel;
	
	public MyLottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("�ζǹ�ȣ��÷");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn = new JButton("��ȣ��÷");
		myLottoPanel = new MyLottoPanel();
		
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.LIGHT_GRAY);
		add(btn);
		add(myLottoPanel);
	}
	
	private void addEventListener() {
		
		
	}
	
	
	private class MyLottoPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			Font font = new Font("", Font.BOLD, 20);
			g.setFont(font);
			g.drawString("��÷��ư�� Ŭ���ϼ���", 180, 180);
		}
	}
	
}

public class LottoTest {

	public static void main(String[] args) {
		
		new MyLottoFrame();

	}

}
