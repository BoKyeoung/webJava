package ch02;

import java.awt.BorderLayout;
import java.awt.image.DirectColorModel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame { // <= swing 필수

	private BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "북", "센터", "남", "동", "서" }; // 왜 괄호가 이거냥?
	String[] directions = { BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };

	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("BorderLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		borderLayout = new BorderLayout();

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}

	private void setInitLayout() {
		setVisible(true);
		// for문 이용해서 코드를 수정해봅시다.
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.CENTER);
		add(buttons[2], BorderLayout.SOUTH);
		add(buttons[3], BorderLayout.EAST);
		add(buttons[4], BorderLayout.WEST);
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], directions[i]);
		}
	}

	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
