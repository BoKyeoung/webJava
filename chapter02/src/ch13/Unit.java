package ch13;

// new Ű���带 ����ؼ� �޸𸮸� �ø� �� ����.
public abstract class Unit {

	protected String name;
	protected int power;
	protected int hp;
	
	public String getName() {
		return name;
	}
	public int getPower() {
		return power;
	}
	public int getHp() {
		return hp;
	}
	
	public void showInfo() {
		System.out.println("===== ����â (+" + this.name +"+) =====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("================");
	}	
	
	public void attack(Unit unit) {
		System.out.println(this.name + "�� " + unit.getName() + " �� �����մϴ�");
		unit.beAttacked(this.power);
	}
	
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
