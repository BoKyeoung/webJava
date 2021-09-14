package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorChangeFrame extends JFrame implements ActionListener{

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	JButton button1;
	JButton button2;
	
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�̺�Ʈ ������ ���� 3");
		setSize(500,500);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel1.setBackground(Color.GRAY);
		panel1.setPreferredSize(new Dimension(500, 400));
		
		panel2 = new JPanel(new FlowLayout());
		
		button1 = new JButton("������");
		button2 = new JButton("�����");
	}
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(borderLayout);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		
		panel2.add(button1);
		panel2.add(button2);
		
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		// if()
		// ��ư 1���� �������ٸ�
		// panel1.setBackground(Color.red);
		// ��ư 2���� �������ٸ�
		// panel1.setBackground(Color.yellow);
		
		//if(clickedButton.getText().equals(this.button1.getText()))
		
		if(targetBtn.getText().equals(this.button1.getText())) {
			panel1.setBackground(Color.red);
		}else{
			panel1.setBackground(Color.yellow);
		}
		
	}
	
	
}

public class EventListenerEx3 {

	public static void main(String[] args) {
		
		// �͸� Ŭ���� => �ν��Ͻ� ������ ���� ������ ���������� �����ؼ� ����� �� ����.
		new ColorChangeFrame();

	}

}
