package ch02;

public class HeroMainTest {

	public static void main(String[] args) {
		// 워리어, 아처, 위자드 소환해서 실행
		
		Warrior warrior = new Warrior("전사1", 100);
		Archer archer = new Archer("궁수1", 100);
		Wizard wizard = new Wizard("마법사1", 100);
		
		warrior.attack();
		warrior.comboAttack();
		
		archer.attack();
		archer.fireArrow();
		
		wizard.attack();
		wizard.freezing();

	}

}
