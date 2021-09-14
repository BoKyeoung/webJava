package ch10;

public class Marine {

	private String name; // <-- �Ű�����
	private int power;
	private int hp;
	
	// ������, ���ݷ� : 5, ü�� : 100
	public Marine(String name) {
		this.name = name; // this <-- ����� �Ű����� ������ ���� �ҷ���������
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
		System.out.println("===== ����â (+" + this.name +"+) =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("================");
	}
	
//	// ������ ������ ���� �մϴ�.
//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + " �� ������ �����մϴ�.");
//		zealot.beAttacked(this.power);
//	}
//	
//	// ������ ���۸��� �����մϴ�.
//	public void attackZergling(Zergling zergling) {
//		System.out.println(this.name + " �� ���۸��� �����մϴ�.");
//	}
	
	// �޼��� �����ε��� �̿��� ���ô�.
	public void attack(Zealot zealot) {
		System.out.println(this.name + "�� " + zealot.getName() + " �� �����մϴ�");
		zealot.beAttacked(this.power);
	}
	
	public void attack(Zergling zergling) {
		System.out.println(this.name + "�� " + zergling.getName() + " �� �����մϴ�");
		zergling.beAttacked(this.power);
	}
	
	// ������ ������ ���մϴ�.
	public void beAttacked(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + " �� ����Ͽ����ϴ�.");
			this.hp = 0;
		}
	}
}





















