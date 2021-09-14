package ch01;

public class Wrapper_Ex1 {

	public static void main(String[] args) {
		
		Integer num = new Integer(20); // 박싱 (기본 클래스를 래퍼클래스에 담음)
		Number n1 = 10;
		
		int n = num.intValue(); // 언박싱
		System.out.println(n);
		

	}

}
