package ch01;

public class Variable {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {

		// 변수를 사용하는 방법
		int age; // 변수를 선언
		int count; // 변수를 선언

		// 초기화 (값을넣다)
		age = 10;
		count = 100;
		// System.out.println 은 문자열도 출력하고 변수에 값도 화면에 출력할 수 있다.
		System.out.println(age);
		System.out.println(count);

		age = 300;
		System.out.println(age);

		count = 500;
		System.out.println(count);

		// 변수의 선언과 초기화를 동시에
		int age2 = 20;
		int count2 = 77;

		// 변수의 이름을 만들때 규칙
		// 1. 대소문자가 구별되며, 길이에 제한이 없다.
		int name = 100;
		int Name = 20; // 단, 변수명을 처음부터 대문자로 표기하지는 않습니다.

		// 2. 자바에서는 JDK가 미리 정해놓은 예약어를 사용할 수 없다.
//		int if;
//		int for;
//		int while;
		
		// 3. 변수는 숫자로 시작할 수 없다.
//		int 7name;
//		int 55age;
		int name_3;
		int na8me;
		
		// 4. 특수문자는 _ , $ 만 사용가능하다.
		int _age;
		int $name;
		int a_ge;
		int name$e;
		int age$;
		
		// 핵심 : 변수는 값을 저장할 수 있는 메모리 공간을 의미합니다.
		// 이름에서 알 수 있듯이 변하는 수, 변할수 있는 수 입니다.
		int id = 101; // 선언과 초기화를 동시에 처리
		// 1. int <-- 데이터 자료형
		// 2. id  <-- 변수
		// 3. 101 <-- 값 (데이터 : 수치)
		
		// 문제 1. id 값을 500으로 변경해봅시다.
		System.out.println("-----------------");
		id = 500;
		System.out.println(id);
		

	} // end of main

} // end of class











