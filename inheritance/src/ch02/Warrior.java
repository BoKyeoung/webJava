package ch02;

public class Warrior extends Hero {
	
	public Warrior(String name, int hp) {
		super(name,hp);
		// ▲ 부모 객체의 값을 불러옴.
	}

	public void comboAttack() {
		System.out.println("이단 공격을 합니다.");
	}
}
