package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		// static�� �¾� -> ��ü ������ ������� �̸� �Ҵ�Ǿ��ִ�.
		System.out.println(NumberPrinter.waitNumber);
		
		NumberPrinter numberprinter1 = new NumberPrinter(1);
		NumberPrinter numberprinter2 = new NumberPrinter(2);

		// ���� ���
		// 1. ��ȣǥ�� ����
		numberprinter1.printWaitNumber();
		// 2. ...
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();
		numberprinter1.printWaitNumber();

		System.out.println();
		
		// �����ʱ�� ���
		// 2. ��ȣǥ�� ����
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		numberprinter2.printWaitNumber();
		

	}

}