package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class DataSturcuteTest1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1); // �ߺ� ��
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// ������ Ȯ��
		System.out.println(set1.size());
		
		// ����
		set1.remove(1);
		System.out.println(set1);
//		set1.clear(); // ��ü ����
//		System.out.println(set1);
		
		System.out.println(set1.isEmpty()); // <= �� ����ִ�.
		
		// for�� ����
		for (int i = 0; i < set1.size(); i++) {
			System.out.println("set1 �� Ȯ�� : " + i);
		}
		
		for (Integer integer : set1) {
			System.out.println(integer);
		}
		
		// while ��� ���
		// ��� ��ȭ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��Ҹ� �ϳ��� ���ʷ� �����ϴ� ��
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ�� : " + iter.next());
		} 
		
		
//		public static int getRandomNumber() {
//			Random random = new Random();
//			int value = random.nextInt(45)+1;
//			return value;
//		}
		
		
		
		
		
		
		
		
		
	}

}
