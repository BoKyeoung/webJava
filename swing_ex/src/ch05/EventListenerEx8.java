package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFream8 extends JFrame {

	private JTextArea area;

	// 문제1, keyAdapter 내부 클래스로 정의해서 만들어주세요.

	public MyFream8() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	private void setInitLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(new MyKeyListener()); // 익명 클래스 => 변수명을 지정해주지 않았기때문.
	}

	private void display(KeyEvent e) {
		int KeyCode = e.getKeyCode();
		area.append("KeyCode : " + KeyCode + "\n");
		
		// 38 방향키 위
		// 40 방향키 아래
		// static 변수
		int temp = KeyEvent.VK_UP;
		if(KeyCode == KeyEvent.VK_UP) {
			System.out.println("방향키 ▲");
		}else if(KeyCode == KeyEvent.VK_DOWN) {
			System.out.println("방향키 ▼");
		}else if(KeyCode == KeyEvent.VK_LEFT) {
			System.out.println("방향키 ◀");
		}else if(KeyCode == KeyEvent.VK_RIGHT) {
			System.out.println("방향키 ▶");
		}
	}
	
	// 내부클래스
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
