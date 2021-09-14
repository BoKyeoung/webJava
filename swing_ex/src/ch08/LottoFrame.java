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
	// 변수 선언, 초기화
	int[] lotto = new int[LottoNumber.LOTTO_NUMBER_SIZE];
	
	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("로또 추첨");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("★ 추첨 버튼 ★");
		lottoPanel = new LottoPanel();
		lottoNumber = new LottoNumber();
	}

	private void setInitLayout() {
		setVisible(true);
		setBackground(Color.lightGray);
		add(button, BorderLayout.NORTH);
		add(lottoPanel, BorderLayout.CENTER);
		// BorderLayout으로 위치 지정
	}

	private void addEventListener() {
		button.addActionListener(this);
		// 이벤트 대기중
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lotto = lottoNumber.getLottoNumber();
		// 번호 담기
		repaint();
		// 번호를 담고 글을 그렸다면, 그림을 다시 그려라
	}
	
	private class LottoPanel extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			Font font = new Font("", Font.BOLD, 20);
			g.setFont(font);
			
			if(lotto[0] == 0) {
				g.drawString("추첨 버튼을 클릭하세요.", 180, 160);
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














