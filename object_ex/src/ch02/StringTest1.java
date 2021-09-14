package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우 ( new => heap공간을 빌림 )
		String str1 = new String("ABC");
		
		// constant pool (Data, static) 에 주소를 참조하는 방식
		String str2 = "ABC";
		
		// 결론 : heap메모리는 생성될 때 마다 다른 주소 값을 가지지만, 상수 풀에 생성된 문자열은 모두 같은 주소값을 가지게 된다.
		// 관계 연산자 : == (같다)
		
		// str1과 주소값이 다름
		String str3 = new String("ABC");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		String str4 = "ABC";
		String str5 = "ABC";
		
		System.out.println(str4 == str5);
		
	}
	
}
