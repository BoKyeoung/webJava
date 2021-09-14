package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 호출자 (콜리)
public class Activaity2 extends JFrame{
	
	String name;
	JPanel panel;
	// 주소값을 담아 둔다.
	CallbackCheakPosition callbackCheakPosition;
	
	public void setCallbackCheakPosition(CallbackCheakPosition callbackCheakPosition) {
		this.callbackCheakPosition = callbackCheakPosition;
	}
	
	public Activaity2(String name) {
		this.name = name;
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.green);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				callbackCheakPosition.checkPosition(x, y);
			}
		});
	}

}









