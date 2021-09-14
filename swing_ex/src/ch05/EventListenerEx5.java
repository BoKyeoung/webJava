package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

 class MyFrame5 extends JFrame{
	
	JLabel label;
	
	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(50, 50);
		label.setOpaque(true);
		// label�� �⺻���� �����̱� ������ ���������� �ٲ������.
		label.setBackground(Color.pink);
		System.out.println(label.getBounds());
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
		
	}
	private void addEventListener() {
		// �͸� ������ü�� �ڵ� �������ּ���.
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("���콺 ��ư�� �����ٰ� �ý��ϴ�.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// System.out.println("���콺 ��ư�� ���������ϴ�.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("���콺�� �������ϴ�.");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("���콺�� ���Խ��ϴ�.");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setBackground(Color.yellow);
			}
		});
		
	}

//	// ���콺�� Ŭ���Ǿ��� �� ����Ǵ� �޼���
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getX() + " => x ��ǥ��");
//		System.out.println(e.getY() + " => y ��ǥ��");
//		System.out.println(getHeight() + " => getHeight()");
//		System.out.println(getWidth() + " => getWidth()");
//		
//		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
//	}

//	// ���콺�� ���� ������ ������ �� ����Ǵ� �޼���
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		
//	}
//
//	// ���콺�� ���� ������ ������ �� ����Ǵ� �޼���
//	@Override
//	public void mouseExited(MouseEvent e) {
//		
//	}
//
//	// ���콺�� �������� �� ����Ǵ� �޼���
//	@Override
//	public void mousePressed(MouseEvent e) {
//		
//	}
//
//	// ���콺�� �����ٰ� �������� �� ����Ǵ� �޼���
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		
//	}
	
}

public class EventListenerEx5 {

	public static void main(String[] args) {
		new MyFrame5();

	}

}
