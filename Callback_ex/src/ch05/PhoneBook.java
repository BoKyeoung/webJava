package ch05;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class PhoneBook extends JFrame{

	// 포함관계
	InputPhoneNumber inputPhoneNumber;
	
	public PhoneBook() {
		inputPhoneNumber = new InputPhoneNumber();
		inputPhoneNumber.savePhoneNumber();
		
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("phone book");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		
		ArrayList<String> name = inputPhoneNumber.getUserName();
		ArrayList<String> tel = inputPhoneNumber.getTelNumber();
		setLayout(new GridLayout(name.size(),2));
		
		for (int i = 0; i < name.size(); i++) {
			JTextField field1 = new JTextField(name.get(i), 10);
			JTextField field2 = new JTextField(tel.get(i), 10);
			add(field1);
			add(field2);
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PhoneBook();
		new InputPhoneNumber();
	}
	
}



















