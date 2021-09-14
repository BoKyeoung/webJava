package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 문제 1.
		// Animal 타입으로 호랑이 생성,
		// Animal 타입으로 독수리 생성, 
		// Animal 타입으로 사람 생성,
		
		// 다형성
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal person = new Person();
		
		// 문제 2.
		// Animal 타입으로 배열을 선언해보세요. (배열의 크기는 3)
		Animal[] animals = new Animal[3];
		// ▲ type을 받은 코드만 배열 안에 들어갈 수 있다.
		// int, String 등 의 다른 종류의 코드는 Animal을 상속받지 않으면 들어갈 수 없다.
		
		// 문제 3. 
		// 배열안에 값 넣기 (호랑이, 독수리, 사람)
		animals[0] = tiger;
		animals[1] = eagle;
		animals[2] = person;
		
		// (tiger, eagle, person) move, hunt 메서드 호출
		// for문을 이용해서 만들어봅시다.
		// animals	
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
			animals[i].hunt();
			// 컴파일 시점 -> hunt() => 코딩하는 시점
			// 런타임 시점 -> hunt() => 실행하는 시점(동작하게되는 타임)
			// 두개의 시점이 구분되어진다.
			
		}
		
	}

}


















