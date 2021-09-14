package ch01;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// ���� 1. toString �޼��带 ������
	// �й� : 1233, �̸� ȫ�浿
	
	@Override
	public String toString() {
		return "�й� : " + studentId + ", " + "�̸� : " + studentName;
	}
	
	// ���� 2. equals �޼��带 ������
	// ���������� �й��� �̸��� ���ٸ� ���� ��ü��� ������
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentId == std.studentId && this.studentName == std.studentName) {
				return true;
			}else {
				return false;
			}
		}
		return super.equals(obj);
	}
}