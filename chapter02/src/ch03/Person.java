package ch03;

public class Person {
	
	int height;
	int weight;
	String maleFmale;
	String name;
	int age;
	
	
	
	public Person(int height, int weight, String maleFmale, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.maleFmale = maleFmale;
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.println("����� ���� ");
		System.out.println("Ű : " + this.height);
		System.out.println("������ : "+ this.weight);
		System.out.println("���� : "+ this.maleFmale);
		System.out.println("�̸� : "+ this.name);
		System.out.println("���� : "+ this.age);
	}

	// ���� �Լ�
	public static void main(String[] args) {
		Person person = new Person(180, 78, "����", "Tomas", 37);
		person.showInfo();
		
		// �����ؼ� ���!!
	} // end of main
	

}