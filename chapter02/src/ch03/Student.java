package ch03;

public class Student {

	int number;
	String name;
	int grade;
	
	// ������ - constructor
	// ��ü�� ������ �� ������ ���� ������� ������ �����ϴ� ��.
	// ��ü�� ������ �� �������� �ο��ϴ� ��.
	
	// �⺻ ������
	// �����Ϸ��� �ڵ����� �������ش�.
	//public Student() {
	//}
	// Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����Ѵ�.
	// Ŭ������ �����ڰ� �ϳ��� ���°�� �����Ϸ��� ������ �ڵ带 �־���.
	// public Ŭ������() {}
	
	// ����� ���� ������ (�����ڰ� ���� ����)
	public Student(int n1, String n2, int n3) {
		number = n1;
		name = n2;
		grade = n3;
	}
}