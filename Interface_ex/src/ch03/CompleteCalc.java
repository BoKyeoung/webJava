package ch03;

public class CompleteCalc extends Calcultor{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return ERROR;
		}else {
			return num1 / num2;
		}	
	}

	@Override
	public void showInfo() {
		System.out.println("��� �����Ͽ����ϴ�.");
	}
	
	
//	public void showInfo() {
//		System.out.println("��� �����Ͽ����ϴ�.");
//	}

	

}