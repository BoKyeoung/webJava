package ch03;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseActivity extends JFrame{

	String name;
	JPanel panel;
	
	public BaseActivity(String name) {
		this.name = name;
		initData();
		setInitLayout();
	}
	
	protected void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	protected void setInitLayout() {
		setVisible(true);
		add(panel);
		// panel.setBackground(Color.green);
	}

}
