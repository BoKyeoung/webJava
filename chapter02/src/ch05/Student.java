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
	// 국어 성적 셋팅
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// 수학 성적 셋팅
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
//	// 국어 성적
//	int koreanScore;
//	// 수학 성적
//	int mathScore;
//	// 수강하는 과목 이름 1
//	String korean;
//	// 수강하는 과목 이름 2
//	String math;
	
	// 참조 타입으로 선언할 경우 주의점.
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("학생의 이름은 : " + name);
		System.out.println("학생의 총점은 : " + total);
		System.out.println("학생의 평균은 : " + total/2);
	}
	
}
