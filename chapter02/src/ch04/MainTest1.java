package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 문제, 버스객체 2개 생성, 지하철 객체 2개 생성
		// 학생 2명 생성
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		Bus bus4 = new Bus(4);
		
		Subway subway1 = new Subway(2);
		Subway subway2 = new Subway(4);
		Subway subway3 = new Subway(5);
		
		Student student1 = new Student("티모", 10000);
		Student student2 = new Student("애쉬", 15000);
		Student student3 = new Student("트린", 20000);
		
		student1.takeBus(bus1);
		student1.showInfo();
		
		bus1.showInfo();
		System.out.println("===================");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		
		// 객체와 객체 사이에 상호작용에 의해서 프로그래밍을 할 수 있다.
		
		student1.takeBus(bus3);
		student1.showInfo();
		
		bus3.showInfo();
		System.out.println("===================");

		student2.takeSubway(subway2);
		student2.showInfo();
		subway2.showInfo();
	}

}
