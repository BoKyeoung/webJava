package ch02;

public class Hero {

	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println("기본공격합니다.");
	}
	
} // end of class
