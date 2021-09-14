package ch00;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SubActivity extends JFrame implements ActionListener{

	JButton btnAdd;
	JButton btnMinus;
	JButton btnPassValue;
	
	CallbackBtnAction callbackBtnAction;
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		this.callbackBtnAction = callbackBtnAction;
		
		initData();
		setInitLayout();
		
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnPassValue = new JButton("�� �����ϱ�");
		
	}

	private void initData() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
	}

	private void setInitLayout() {
		setVisible(true);
		
		add(btnAdd);
		add(btnMinus);
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnPassValue.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn.getText().equals(btnAdd.getText())) {
			this.callbackBtnAction.clickedAddbtn();
			
		}else if(targetBtn.getText().equals(btnMinus.getText())){
			this.callbackBtnAction.clickedMinusbtn();
			
		}else {
			this.callbackBtnAction.passValue(100);
		}
		
	}
	
}
