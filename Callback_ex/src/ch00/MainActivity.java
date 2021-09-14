package ch00;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainActivity  extends JFrame implements CallbackBtnAction{

	int count;
	JLabel label;
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		
		setVisible(true);
		
	}

	private void addEventListener() {
		
	}

	@Override
	public void clickedAddbtn() {
		System.out.println(" + ��ư �ݹ� �޾ҽ��ϴ�.");
		count ++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusbtn() {
		System.out.println(" - ��ư �ݹ� �޾ҽ��ϴ�.");
		count --;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
		label.setText("�Ű������� �� ���� ���� : " + value);
		
	}
	
	
}
