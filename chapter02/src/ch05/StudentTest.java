package ch05;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studetLee = new Student(10, "Lee");
		studetLee.setKoreaSubject("국어", 100);
		studetLee.setMathSubject("수학", 80);
		
		// error -> null point
		studetLee.showStudentScore();
		
		System.out.println("====================");
		
		// 문제 1.
		// 학생 studentKim 생성
		// 국어 셋팅
		// 수학 셋팅
		// 총점 출력
		
		Student studentKim = new Student(11, "Kim");
		studentKim.setKoreaSubject("국어", 40);
		studentKim.setMathSubject("수학", 80);
		studentKim.showStudentScore();

	}

}
