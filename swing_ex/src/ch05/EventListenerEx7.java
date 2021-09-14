package ch05;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;


class MyFrame7 extends JFrame implements KeyListener{

	private JTextArea area;
	
	public MyFrame7() {
	
		initData();
		setInitLayout();
		addEventLitener();
		
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


	private void addEventLitener() {
		area.addKeyListener(this);
	}

	private void display(KeyEvent e) {
		int KeyCode = e.getKeyCode();
		area.append("KeyCode : " + KeyCode + "\n");
	}

	// 키보드를 눌렀을 때. 즉, 모든 키에 반응
	@Override
	public void keyPressed(KeyEvent e) {
		
		display(e);
	
//		char c = e.getKeyChar();
//		int keyCode = e.getKeyCode();
//		
//		System.out.println("C : " + c);
//		System.out.println("keyCode : " + keyCode);
//		
//		// area.setText(getWarningString()); // 주소값이 나온다요?
//		// area.setText(keyCode + "");
//		area.append("KeyCode : " + keyCode + "\n");
	}

	// 키보드를 뗏을 때 호출. 즉, 모든 키에 반응
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	// 문자를 눌렀을 때 호출. 즉, 문자 키에만 반응
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	
	
}
public class EventListenerEx7 {
	


	public static void main(String[] args) {
		
		new MyFrame7();
		
	}

}
