package ch10;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	// ������, ���ݷ� : 5, ü�� : 100
	public Zergling(String name) {
		this.name = name;
		this.power = 5;
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

	// showInfo
	public void showInfo() {
		System.out.println("===== ����â (+" + this.name + "+) =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("================");
	}
	
	// �޼��� �����ε��� �̿��� ���ô�.
	// ���� 1. ���۸�
	// ���� 2. ����
	
	public void attack(Marine marine) {
		System.out.println(this.name + "�� " + marine.getName() + " �� �����մϴ�");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zealot zealot) {
		System.out.println(this.name + "�� " + zealot.getName() + " �� �����մϴ�");
		zealot.beAttacked(this.power);
	}
	

//	// ���۸��� ������ �����մϴ�.
//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + " �� ������ �����մϴ�.");
//		zealot.beAttacked(this.power);
//		}
//
//	// ���۸��� ������ �����մϴ�.
//	public void attackMarine(Marine marine) {
//		System.out.println(this.name + " �� ������ �����մϴ�.");
//		marine.beAttacked(this.power);
//	}

	// ���۸��� ������ ���մϴ�.
	public void beAttacked(int power) {
		// ex) hp- 12 --> ���̳ʽ��� �������� ���
		
		if (this.hp <= 0) {
			System.out.println(this.name + "�̹� ����Ͽ����ϴ�.");
		}else if(this.hp > 0){
			this.hp -= power;
		}else {
			
		}
	}

}