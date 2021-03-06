package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		// static은 태양 -> 객체 생성과 상관없이 미리 할당되어있다.
		System.out.println(NumberPrinter.waitNumber);
		
		NumberPrinter numberprinter1 = new NumberPrinter(1);
		NumberPrinter numberprinter2 = new NumberPrinter(2);

		// 왼쪽 기계
		// 1. 번호표를 뽑음
		numberprinter1.printWaitNumber();
		// 2. ...
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();

		System.out.println();
		
		// 오른쪽기계 기계
		// 2. 번호표를 뽑음
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		

	}

}
