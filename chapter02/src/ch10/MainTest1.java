package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
//		// ���� ����
//		Zealot zealot1 = new Zealot("����1");
////		zealot1.showInfo();
//		// ���� ����
//		Marine marine1 = new Marine("����1");
//		Marine marine2 = new Marine("����2");
//		
////		marine1.showInfo();
//		// ���۸� ����
//		Zergling zergling1 = new Zergling("���۸�1");
////		zergling.showInfo();
//		
//		============= ��ü 3�� ���� =============
//		
//		zealot1.attackMarine(marine1);
//		zealot1.attackMarine(marine1);
////		marine1.showInfo();
//		zealot1.attackMarine(marine2);
////		marine2.showInfo();
//		
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		zealot1.attackMarine(marine2);
//		
//		System.out.println(marine2.getHp());
//		if(marine2.getHp() < 0) {
//			marine2 = null; // <-- �ּҰ� ���� (����� ���� = �������÷���)
//		}
//		
//		// 1. ������ ���� ����
//		marine1.attackZealot(zealot1);
//		
//		// 2. ���۸��� ���� ����
//		zergling1.attackZealot(zealot1);
//		
//		// 3. ������ ���۸� ����
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		zealot1.attackZergling(zergling1);
//		
//		// �����
//		zealot1.showInfo();
//		zergling1.showInfo();
//		marine1.showInfo();
//		marine2.showInfo();
		
		// �޼��� �����ε��̶�!
		
		Zealot zealot1 = new Zealot("����1");
		Zealot zealot2 = new Zealot("����2");
		Zealot zealot3 = new Zealot("����3");
		
		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");
		Marine marine3 = new Marine("����3");
		
		Zergling zergling1 = new Zergling("���۸�1");
		Zergling zergling2 = new Zergling("���۸�2");
		Zergling zergling3 = new Zergling("���۸�3");
		
		// �޼��� �����ε� (oop)
		// ��ü�������� �ڵ带 ������ �� �ִ�.
		marine1.attack(zealot1);
		marine1.attack(zergling1);
		
		System.out.println("�ȳ��ϼ���.");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
		
	}

}






















