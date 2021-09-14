package ch02;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 한번 생성된 String은 불변(immutable)
		
		// String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("Android");
		
		// String 변수의 주소값을 확인하고 싶다면
		System.out.println(java); // <= 입력값 나옴
		System.out.println(System.identityHashCode(java)); // <= 주소값 확인 가능
		System.out.println(android);
		
		System.out.println("============================");
		// java = java + android;
		java = java.concat(android); // .concat => 더하란 뜻.
		System.out.println(java);
		System.out.println(System.identityHashCode(java)); // <= 주소값 변경
		
		
	}
}
