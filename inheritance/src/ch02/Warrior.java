package ch02;

public class Warrior extends Hero {
	
	public Warrior(String name, int hp) {
		super(name,hp);
		// �� �θ� ��ü�� ���� �ҷ���.
	}

	public void comboAttack() {
		System.out.println("�̴� ������ �մϴ�.");
	}
}
