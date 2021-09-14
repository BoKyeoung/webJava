package ch02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayotEx extends JFrame{

	// 반복 : 배열, ArrayList
	// 배열, ArrayList 코드 수정
	// 배열 => 크기를 지정해야한다.
	// ArrayList => 크기를 지정하지 않아도 된다.
	
	JButton[] buttons = new JButton[6];
	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
	
	public FlowLayotEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("Flow Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
		
		// for문 코드 수정
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(i + "");
		}
//		button1 = new JButton("1");
//		button2 = new JButton("2");
//		button3 = new JButton("3");
//		button4 = new JButton("4");
//		button5 = new JButton("5");
//		button6 = new JButton("6");
	}
	
	private void setInitLayout() {
		setVisible(true);
		
		for (int i = 0; i < buttons.length; i++) {
			this.add(buttons[i]);
		}
		
		// for문 코드 수정
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
//		this.add(button6);
		
	}
	
	// 메인 함수
	public static void main(String[] args) {
		FlowLayotEx f1 = new FlowLayotEx();
	}
	
}
























