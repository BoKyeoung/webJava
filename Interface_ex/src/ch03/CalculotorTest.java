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
		
		// 방법 1, 형변환(다운캐스팅)하여 showInfo (int)0.11;
		((CompleteCalc)calc).showInfo(); 
		
		// 방법 2, 추상메서드를 부모타입에 존재하게 해서 다운캐스팅 없이 showInfo
		calc.showInfo();
	
	}

}
