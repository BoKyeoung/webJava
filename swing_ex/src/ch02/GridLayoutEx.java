package ch02;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	
	// ArrayList 변경
	
	// 선언방법
	ArrayList<JButton> buttons = new ArrayList<>();
	
	private final int MAX_COUNT = 6;
	
	public GridLayoutEx() {
		iniData();
		setInitLayout();
	}
	
	private void iniData() {
		setTitle("GridLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton(i + ""));
		}
	
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2, 3));
		
		for(int i = 0; i < MAX_COUNT; i ++) {
			this.add(buttons.get(i));
		}
	}

	public static void main(String[] args) {
		
		new GridLayoutEx();

	}

}
