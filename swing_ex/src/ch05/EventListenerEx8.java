package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFream8 extends JFrame {

	private JTextArea area;

	// ����1, keyAdapter ���� Ŭ������ �����ؼ� ������ּ���.

	public MyFream8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("Ű �̺�Ʈ ����");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(new MyKeyListener()); // �͸� Ŭ���� => �������� ���������� �ʾұ⶧��.
	}

	private void display(KeyEvent e) {
		int KeyCode = e.getKeyCode();
		area.append("KeyCode : " + KeyCode + "\n");
		
		// 38 ����Ű ��
		// 40 ����Ű �Ʒ�
		// static ����
		int temp = KeyEvent.VK_UP;
		if(KeyCode == KeyEvent.VK_UP) {
			System.out.println("����Ű ��");
		}else if(KeyCode == KeyEvent.VK_DOWN) {
			System.out.println("����Ű ��");
		}else if(KeyCode == KeyEvent.VK_LEFT) {
			System.out.println("����Ű ��");
		}else if(KeyCode == KeyEvent.VK_RIGHT) {
			System.out.println("����Ű ��");
		}
	}
	
	// ����Ŭ����
	private class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			display(e);
		}

	}

}

public class EventListenerEx8 {

	public static void main(String[] args) {

		new MyFream8();
		
	}

}
