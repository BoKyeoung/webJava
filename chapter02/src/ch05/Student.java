package ch05;

public class Student {

	int studentId;
	String name;
	Subject korea;
	Subject math;
	
	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		korea = new Subject();
		math = new Subject();
	}
	// ���� ���� ����
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// ���� ���� ����
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
//	// ���� ����
//	int koreanScore;
//	// ���� ����
//	int mathScore;
//	// �����ϴ� ���� �̸� 1
//	String korean;
//	// �����ϴ� ���� �̸� 2
//	String math;
	
	// ���� Ÿ������ ������ ��� ������.
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("�л��� �̸��� : " + name);
		System.out.println("�л��� ������ : " + total);
		System.out.println("�л��� ����� : " + total/2);
	}
	
}
