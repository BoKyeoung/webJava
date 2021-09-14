package ch02;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame{

	
	ArrayList<JButton> buttons = new ArrayList <JButton>();
	
	// ��� ����
	// ������
	// �޼���
	
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("No Latout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		for (int i = 0; i < 7; i++) {
			buttons.add(new JButton(i + ""));
		}
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		
		//buttons.get(0).setSize(50,50);
		//buttons.get(0).setLocation(50, 50);
		
//		// ��ġ�����ڰ� ���ٸ� => ��ư�� ũ�⸦ ���� ����
//		button1.setSize(50,50);
//		button1.setLocation(50, 50); // ��ǥ�� ����
//		
//		button2.setSize(100,100);
//		button2.setLocation(150, 150);
//		
//		button3.setSize(150,150);
//		button3.setLocation(250, 250);
//		
//		button4.setSize(50,50);
//		button4.setLocation(0, 250);
//		
//		button5.setSize(50,20);
//		button5.setLocation(150, 0);
//		
//		button6.setSize(150,150);
//		button6.setLocation(0, 100);
//		
//		button7.setSize(150,150);
//		button7.setLocation(100, 300);
		
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setSize(50,50);
			buttons.get(i).setLocation(setupPosition(50, i), setupPosition(50, i));
			add(buttons.get(i));
		}
	}

	private int setupPosition(int size, int index) {
		int result = (index + 1) * size;
		return result;
	}
	

	public static void main(String[] args) {
		
		int a;
		a = 50 * 100;
		
		new NoLayoutEx();

	}

}
