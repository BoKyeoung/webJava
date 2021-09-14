package ch01;

public class FunctionTest {

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 함수 사용해보기
		int result1 = add(100, 50);
		System.out.println(result1);
		
		int result2 = add(200, 300);
		System.out.println(result2);
		
	} // end of main
	
	// add 함수 생성
	public static int add(int num1, int num2) {
		
		// 함수 안에 사용하는 변수는 지역변수라고 부른다.
		int result;
		result = num1 + num2;
		return result;
	}

} // end of class
