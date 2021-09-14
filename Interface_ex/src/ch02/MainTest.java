package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("================");
		
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("================");
		
		toyRobot.turnOn();
		toyRobot.turnOff();
		System.out.println("================");

		// 배열만들어서 크기는 3개 0, 1, 2 인스턴스 변수 넣어주기.
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		// 문제 1. 확장 for문을 이용해서 turnOn() 메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("================");
		
		// 문제 2. 확장 for문을 이용해서 turnOff() 메서드 호출
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("================");
	
		// 문제 3. for문을 이용해서 클래스타입이 ToyRobot 이면 name을 화면에 출력.
		// instanceof 연산자, 다운캐스팅
	
		// 분할 & 정복 (기억이 안날 때 사용)
		// 1. for문 만들기
		// 2. 만약 ToyRobot => true{}
		// 3. (int) 0.8
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot) remote[i]).name; // <= 다운캐스팅
				System.out.println(name);
			}
		}
		
		// 요구 사항 추가 !! 인터페이스 추가
		// 냉장고에 문이 열렸으면 멜로디 소리를 나게 하라.
		// 장난감 로봇에 건전기가 거의 없으면 멜로디 소리르 나게 하라.
		
		// 인터페이스 장점.
		// 1. 표준화가 가능하다 (ex, turnOn, turnOff)
		// 2. 서로 관계없는 클래스들에게 관계를 맺어줌.
		// 3. 클래스간의 결합도를 낮춰서 유연한 코드를 설계할 수 있다.
		
		// 인터페이스 정리
		// 1. 객체지향 패러다임의 핵심
		// 2. 객체와 객체간의 상호협력해서 코드를 설계해나간다 (버스, 지하철, 학생, 스타크래프트)
		// 3. 객체와 객체간의 관계를 정의하여 코드를 설계해 나간다 (상속, 포함관계, 추상클래스, 인터페이스)
		// 4. 다형성(클래스를 다양한 형태로 바라본다)  ★OOP(객체지향언어)개념의 핵심★
	
	
	
	
	
	}
	
	
	
	
	
	

}
