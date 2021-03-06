package ch11;

public class ArrayMainTest {

	public static void main(String[] args) {
		
		// 배열
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
		// 변수가 하나의 데이터를 저장하기위한 것이라면, 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것
		
		int neumber = 10;
		
		// 선언 방법 (공간 만들기)
		int[] arr1 = new int[3]; // 실무에서 선호하는 타입.
		int arr2[] = new int[10];
		
		// 초기화 하는 방법 (값을 넣는 방법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// 배열 선언과 동시에 초기화 하기
		int[] numbers1 = new int[] {11, 20, 33};
		int[] numbers2 = {10, 20, 100}; // 간소화
		
		// 출력 방법
		System.out.println(numbers1[0]); // <-- 출력하라
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		
		// 문자열 배열
		String[] strArr = new String[10];
		strArr[0] = "야스오";
		strArr[1] = "아크샨";
		strArr[2] = "스웨인";
		strArr[3] = "자이라";
		
		// 문제 1 strArr 0,1,2,3 화면에 출력 ! 단, for문 쓰지마세요!
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		// 모든 프로그래밍 언어에서는 index 0부터 시작합니다.
		// 배열을 사용할때 보통 for문과 관계해서 많이 사용합니다.
		
//		System.out.println(strArr.length);// <-- .length는 배열의 크기
//		System.out.println(strArr[10]); 
		// ▲ 오류의 이유 : 0부터 시작되기때문에 실제 공간번호는 0 ~ 9
		// index의 크기는 n - 1 개 이다.
		// new int[22];  인덱스의 크기는 0 ~ 21
		// new int[74];  인덱스의 크기는 0 ~ 73
		// new int[283]; 인덱스의 크기는 0 ~ 282
				
		System.out.println("==================");
		
		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i] == null) {
//				continue;
//			}else{
//				System.out.println(strArr[i]);
//			} ▼ 코드 줄이기
			if(strArr[i] != null) {
				System.out.println(strArr[i]);
			}
		}// end of for - i
		

	}

}




















