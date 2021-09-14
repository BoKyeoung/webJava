package ch10;

public class Zealot {
	
	private String name;
	private int power;
	private int hp;
	
	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void showInfo() {
		System.out.println("===== ����â (+" + this.name +"+) =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("================");
	}

	
	
	// �޼��� �����ε��� �̿��غ��ô�.
	public void attack(Marine marine) {
		System.out.println(this.name + "�� " + marine.getName() + " �� �����մϴ�");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		System.out.println(this.name + "�� " + zergling.getName() + " �� �����մϴ�");
		zergling.beAttacked(this.power);
	}
	
	
//	// ������ ������ �����մϴ�.
//	public void attackMarine(Marine marine) {
//		System.out.println(this.name + " �� ������ �����մϴ�.");
//		marine.beAttacked(this.power);
//	}
//	
//	// ������ ���۸��� �����մϴ�.
//	public void attackZergling(Zergling zerglig) {
//		System.out.println(this.name + " �� ���۸��� �����մϴ�.");
//		zerglig.beAttacked(this.power);
//	}
//	
	// ������ �޽��ϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
	}


}


















