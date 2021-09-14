package ch01;

class A {
	
	int number1;
	int number2;
	int number3;
	
}

class B {

	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
	
}

class C extends A { // => C class는 A class를 상속하겠다.
	
	int number4;
	int number5;
	
}

// public class는 하나의 .java파일 안에서는 하나만 존재할 수 있다.
// class는 반복적으로 생성 가능.
public class MainTest1 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.number1 = 1;
		c1.number2 = 2;
		c1.number5 = 5;
		System.out.println(c1.number1);
		System.out.println(c1.number2);
		System.out.println(c1.number5);

	}

}





















