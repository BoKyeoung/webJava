package ch04;

class Water{
	
	@Override
	public String toString() {
		
		return "���� ���Դϴ�.";
		
	}
}

public class TExtendsClass {

	public static void main(String[] args) {
	
		// <T extends Ŭ����> ����ϱ�
		// T�ڷ����� ������ ���� �� �� ���� ( �������������� �ڷ������� �ƹ� Ŭ������ �� �� �ִ�)
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());

		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder.toString());
		
		System.out.println("=====================");
		
		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		
		
	}

}