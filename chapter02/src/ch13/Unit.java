package ch13;

// new 키워드를 사용해서 메모리를 올릴 수 없다.
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
		System.out.println("===== 정보창 (+" + this.name +"+) =====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("================");
	}	
	
	public void attack(Unit unit) {
		System.out.println(this.name + "이 " + unit.getName() + " 을 공격합니다");
		unit.beAttacked(this.power);
	}
	
	public void beAttacked(int power) {
		// ex) hp- 12 --> 마이너스로 내려가는 경우
		
		if (this.hp <= 0) {
			System.out.println(this.name + "이미 사망하였습니다.");
		}else if(this.hp > 0){
			this.hp -= power;
		}else {
			
		}
	} 
	
	
}
