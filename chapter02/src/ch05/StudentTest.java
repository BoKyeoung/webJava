package ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studetLee = new Student(10, "Lee");
		studetLee.setKoreaSubject("����", 100);
		studetLee.setMathSubject("����", 80);
		
		// error -> null point
		studetLee.showStudentScore();
		
		System.out.println("====================");
		
		// ���� 1.
		// �л� studentKim ����
		// ���� ����
		// ���� ����
		// ���� ���
		
		Student studentKim = new Student(11, "Kim");
		studentKim.setKoreaSubject("����", 40);
		studentKim.setMathSubject("����", 80);
		studentKim.showStudentScore();

	}

}