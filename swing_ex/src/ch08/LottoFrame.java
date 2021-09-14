package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LottoFrame extends JFrame implements ActionListener{

	JButton button;
	LottoPanel lottoPanel;
	LottoNumber lottoNumber;
	// ���� ����, �ʱ�ȭ
	int[] lotto = new int[LottoNumber.LOTTO_NUMBER_SIZE];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("�ζ� ��÷");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("�� ��÷ ��ư ��");
		lottoPanel = new LottoPanel();
		lottoNumber = new LottoNumber();
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.lightGray);
		add(button, BorderLayout.NORTH);
		add(lottoPanel, BorderLayout.CENTER);
		// BorderLayout���� ��ġ ����
	}

	private void addEventListener() {
		button.addActionListener(this);
		// �̺�Ʈ �����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lotto = lottoNumber.getLottoNumber();
		// ��ȣ ���
		repaint();
		// ��ȣ�� ��� ���� �׷ȴٸ�, �׸��� �ٽ� �׷���
	}
	
	private class LottoPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			Font font = new Font("", Font.BOLD, 20);
			g.setFont(font);
			
			if(lotto[0] == 0) {
				g.drawString("��÷ ��ư�� Ŭ���ϼ���.", 180, 160);
				return;
			}
			
			int xPosition = 150;
			for(int i = 0; i < lotto.length; i++) {
				g.drawString(lotto[i] + "", xPosition, 140);
				xPosition += 50;
			}	
		}	
	}
	
}














