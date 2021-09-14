package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
}

public class DataStructureTest3 {

	public static void main(String[] args) {
		
		List list0;
		
		// 순서가 있고(인덱스), 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// 값 추가 방법
		list.add(3); 	// index 0
		list.add(null); // index 1
		list.add(1, 10);// index 1에 10을 삽입 (null 인덱스 2번으로 밀려 남)
		System.out.println("값 추가확인 : " + list);
		
		// 값 삭제 방법
		list.remove(2);
		// list.clear();
		System.out.println("값 삭제확인 remove : " + list);
		System.out.println(list.size());
		
		// 값 출력 방법
		System.out.println(list.get(1));
		
		for (Integer i : list) {
			System.out.println("for 사용법 : " + i);
		}
		
		// while 사용방법
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
		// 문제 1.
		Iterator <Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while 사용법 : " + iter.next());
		}
	
		// ArrayList 값 검색
		
		System.out.println(list.contains(1));
		
		

	}

}

















