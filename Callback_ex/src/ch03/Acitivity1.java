package ch03;

import java.awt.Color;

public class Acitivity1 extends BaseActivity{

	CallbackCheakPosition callbackCheakPosition = new CallbackCheakPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			System.out.println("x : " + x );
			System.out.println("y : " + y );
			
		}
	};
	
	public Acitivity1(String name) {
		super(name);
	}

	@Override
	protected void setInitLayout() {
		super.setInitLayout();
		super.panel.setBackground(Color.CYAN);
		// 부모의 패널에서 설정값을 바꿔라.
	}
	
	
}
