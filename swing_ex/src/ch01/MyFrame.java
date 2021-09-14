package ch01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("MyFrame 연습");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// 메인함수
	public static void main(String[] args) {
		
		new MyFrame();
		
	} // end of main
	
}
