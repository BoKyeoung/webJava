package ch03;

public class CalculotorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		
		
		// showInfo
		
		// ��� 1, ����ȯ(�ٿ�ĳ����)�Ͽ� showInfo (int)0.11;
		((CompleteCalc)calc).showInfo(); 
		
		// ��� 2, �߻�޼��带 �θ�Ÿ�Կ� �����ϰ� �ؼ� �ٿ�ĳ���� ���� showInfo
		calc.showInfo();
	
	}

}
