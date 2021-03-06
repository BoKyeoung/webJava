package ch10;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	// 생성자, 공격력 : 5, 체력 : 100
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
		System.out.println("===== 정보창 (+" + this.name + "+) =====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("================");
	}
	
	// 메서드 오버로딩을 이용해 봅시다.
	// 문제 1. 저글링
	// 문제 2. 마린
	
	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + " 을 공격합니다");
		marine.beAttacked(this.power);
	}
	
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + " 을 공격합니다");
		zealot.beAttacked(this.power);
	}
	

//	// 저글링이 질럿을 공격합니다.
//	public void attackZealot(Zealot zealot) {
//		System.out.println(this.name + " 이 질럿을 공격합니다.");
//		zealot.beAttacked(this.power);
//		}
//
//	// 저글링이 마린을 공격합니다.
//	public void attackMarine(Marine marine) {
//		System.out.println(this.name + " 이 마린을 공격합니다.");
//		marine.beAttacked(this.power);
//	}

	// 저글링이 공격을 당합니다.
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
