package ch01;

// HomeAppliances 클래스를 직접 new 해서 사용할 필요 x
// => 추상클래스로 제작

public abstract class HomeAppliances {

	int width;
	int height;
	String color;
	
	public abstract void turnOn();
	
	public abstract void turnOff();

	
}
