package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame{
	
	JButton button;
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		// 초기 세팅 공간
		setTitle("익명구현개체사용연습");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("버튼1");
	}
	
	private void setInitLayout() {
		// 배치 공간
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}
	
	private void addEventListener() {
		// 이벤트 공간
		
		// 익명구현객체
		// => 일회성의 인터페이스를 익명객체로 만들어서 사용.
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭됨.");
				
			}
		
		});
		
	}
	
}

public class EventListenerEx4 {

	public static void main(String[] args) {
		
		new MyFrame4();

	}

}
