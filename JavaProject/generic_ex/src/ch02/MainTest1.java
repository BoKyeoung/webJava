package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// ���
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrint1 dPrinter1 = new ThreeDPrint1();
		
		// ��� ����
		dPrinter1.setMaterial(powder);
		
		// ��Ḧ ������ Ȯ��
		Powder tempPowder = dPrinter1.getMaterial();
		System.out.println(tempPowder.toString());
		
		System.out.println("==============");
		
		////////////////
		ThreeDPrint2 dPrinter2 = new ThreeDPrint2();
		dPrinter2.setMaterial(plastic);
		Plastic plastic2 = dPrinter2.getMaterial();
		System.out.println(plastic2);
		
		System.out.println("==============");
		
		////////////////
		ThreeDPrint3 dPrinter3 = new ThreeDPrint3();
		// ������
		dPrinter3.setMaterial(powder);
		
		// �ڷḦ ��������
		Powder tempPowder2 = (Powder)dPrinter3.getMaterial(); // �ٿ�ĳ����
		System.out.println(tempPowder2.toString());
		
		
	}

}





















