package ch02;

public class HeroMainTest {

	public static void main(String[] args) {
		// ������, ��ó, ���ڵ� ��ȯ�ؼ� ����
		
		Warrior warrior = new Warrior("����1", 100);
		Archer archer = new Archer("�ü�1", 100);
		Wizard wizard = new Wizard("������1", 100);
		
		warrior.attack();
		warrior.comboAttack();
		
		archer.attack();
		archer.fireArrow();
		
		wizard.attack();
		wizard.freezing();

	}

}
