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
		
		// ������ �ְ�(�ε���), �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Student> members = new ArrayList<Student>();
		
		// �� �߰� ���
		list.add(3); 	// index 0
		list.add(null); // index 1
		list.add(1, 10);// index 1�� 10�� ���� (null �ε��� 2������ �з� ��)
		System.out.println("�� �߰�Ȯ�� : " + list);
		
		// �� ���� ���
		list.remove(2);
		// list.clear();
		System.out.println("�� ����Ȯ�� remove : " + list);
		System.out.println(list.size());
		
		// �� ��� ���
		System.out.println(list.get(1));
		
		for (Integer i : list) {
			System.out.println("for ���� : " + i);
		}
		
		// while �����
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ� ��
		// ���� 1.
		Iterator <Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while ���� : " + iter.next());
		}
	
		// ArrayList �� �˻�
		
		System.out.println(list.contains(1));
		
		

	}

}

















