package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Acitivity2 extends BaseActivity{
	
	CallbackCheakPosition callbackCheakPosition;
	
	public void setCallbackCheakPosition(CallbackCheakPosition callbackCheakPosition) {
		this.callbackCheakPosition = callbackCheakPosition;
	}

	public Acitivity2(String name) {
		super(name);
		addEventListener();
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
	
	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		super.panel.setBackground(Color.pink);
	}
	
}
