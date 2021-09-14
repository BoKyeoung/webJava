package ch07;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	
	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}
	
	// getter, setter
	// read only
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getPower() {
		return this.power;
	}
	
	//setter
	public void setPower(int power) {
		this.power = power;
	}
	
	// 문제 1. setName
	public void setName(String name) {
		this.name = name;
	}
	
	// 문제 2. setHp
	public void setHp(int hp) {
		if(hp < 0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.hp = hp;
		} // end of else
		
	}

}













