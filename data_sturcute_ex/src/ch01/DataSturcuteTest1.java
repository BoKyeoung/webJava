package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class DataSturcuteTest1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1); // 중복 값
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// 사이즈 확인
		System.out.println(set1.size());
		
		// 삭제
		set1.remove(1);
		System.out.println(set1);
//		set1.clear(); // 전체 삭제
//		System.out.println(set1);
		
		System.out.println(set1.isEmpty()); // <= 다 비어있다.
		
		// for문 사용법
		for (int i = 0; i < set1.size(); i++) {
			System.out.println("set1 값 확인 : " + i);
		}
		
		for (Integer integer : set1) {
			System.out.println(integer);
		}
		
		// while 사용 방법
		// 요소 순화(반복자) 컬렉션 프레임워크에 저장된 요소를 하나씩 차례로 참조하는 것
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		} 
		
		
//		public static int getRandomNumber() {
//			Random random = new Random();
//			int value = random.nextInt(45)+1;
//			return value;
//		}
		
		
		
		
		
		
		
		
		
	}

}
