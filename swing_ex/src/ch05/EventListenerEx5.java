package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 class MyFrame5 extends JFrame{
	
	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(50, 50);
		label.setOpaque(true);
		// label은 기본값이 투명이기 때문에 불투명으로 바꿔줘야함.
		label.setBackground(Color.pink);
		System.out.println(label.getBounds());
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
		
	}
	private void addEventListener() {
		// 익명 구현객체로 코드 변경해주세요.
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 눌렀다가 뗐습니다.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// System.out.println("마우스 버튼이 눌러졌습니다.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("마우스가 나갔습니다.");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("마우스가 들어왔습니다.");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setBackground(Color.yellow);
			}
		});
		
	}

//	// 마우스가 클릭되었을 때 실행되는 메서드
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + " => x 좌표값");
//		System.out.println(e.getY() + " => y 좌표값");
//		System.out.println(getHeight() + " => getHeight()");
//		System.out.println(getWidth() + " => getWidth()");
//		
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//	}

//	// 마우스가 영역 안으로 들어왔을 때 실행되는 메서드
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//	}
//
//	// 마우스가 영역 밖으로 나갔을 때 실행되는 메서드
//	@Override
//	public void mouseExited(MouseEvent e) {
//		
//	}
//
//	// 마우스가 눌러졌을 때 실행되는 메서드
//	@Override
//	public void mousePressed(MouseEvent e) {
//		
//	}
//
//	// 마우스를 눌렀다가 떨어졌을 때 실행되는 메서드
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		
//	}
	
}

public class EventListenerEx5 {

	public static void main(String[] args) {
		new MyFrame5();

	}

}
