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
		System.out.println("사람의 정보 ");
		System.out.println("키 : " + this.height);
		System.out.println("몸무게 : "+ this.weight);
		System.out.println("성별 : "+ this.maleFmale);
		System.out.println("이름 : "+ this.name);
		System.out.println("나이 : "+ this.age);
	}

	// 메인 함수
	public static void main(String[] args) {
		Person person = new Person(180, 78, "남성", "Tomas", 37);
		person.showInfo();
		
		// 생성해서 사용!!
	} // end of main
	

}
