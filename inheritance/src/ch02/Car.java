package ch02;

public class Car {

	String name;
	int price;
	
	// 포함관계로 설계해야한다.
	Engine engine;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		this.engine = new Engine("GDI", 400);
	}
}
