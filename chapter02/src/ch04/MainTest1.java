package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ����, ������ü 2�� ����, ����ö ��ü 2�� ����
		// �л� 2�� ����
		
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
		Bus bus3 = new Bus(3);
		Bus bus4 = new Bus(4);
		
		Subway subway1 = new Subway(2);
		Subway subway2 = new Subway(4);
		Subway subway3 = new Subway(5);
		
		Student student1 = new Student("Ƽ��", 10000);
		Student student2 = new Student("�ֽ�", 15000);
		Student student3 = new Student("Ʈ��", 20000);
		
		student1.takeBus(bus1);
		student1.showInfo();
		
		bus1.showInfo();
		System.out.println("===================");
		
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		
		// ��ü�� ��ü ���̿� ��ȣ�ۿ뿡 ���ؼ� ���α׷����� �� �� �ִ�.
		
		student1.takeBus(bus3);
		student1.showInfo();
		
		bus3.showInfo();
		System.out.println("===================");

		student2.takeSubway(subway2);
		student2.showInfo();
		subway2.showInfo();
	}

}
