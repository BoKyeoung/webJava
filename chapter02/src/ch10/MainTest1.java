package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
//		// 질럿 생성
//		Zealot zealot1 = new Zealot("질럿1");
////		zealot1.showInfo();
//		// 마린 생성
//		Marine marine1 = new Marine("마린1");
//		Marine marine2 = new Marine("마린2");
//		
////		marine1.showInfo();
//		// 저글링 생성
//		Zergling zergling1 = new Zergling("저글링1");
////		zergling.showInfo();
//		
//		============= 객체 3개 생성 =============
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
//			marine2 = null; // <-- 주소값 삭제 (대상을 없앰 = 가비지컬렉터)
//		}
//		
//		// 1. 마린이 질럿 공격
//		marine1.attackZealot(zealot1);
//		
//		// 2. 저글링이 질럿 공격
//		zergling1.attackZealot(zealot1);
//		
//		// 3. 질럿이 저글링 공격
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
//		// 결과값
//		zealot1.showInfo();
//		zergling1.showInfo();
//		marine1.showInfo();
//		marine2.showInfo();
		
		// 메서드 오버로딩이란!
		
		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Zealot zealot3 = new Zealot("질럿3");
		
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		Marine marine3 = new Marine("마린3");
		
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");
		Zergling zergling3 = new Zergling("저글링3");
		
		// 메서드 오버로딩 (oop)
		// 객체지향으로 코드를 설계할 수 있다.
		marine1.attack(zealot1);
		marine1.attack(zergling1);
		
		System.out.println("안녕하세요.");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
		
	}

}























