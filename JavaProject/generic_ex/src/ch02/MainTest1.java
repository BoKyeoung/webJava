package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrint1 dPrinter1 = new ThreeDPrint1();
		
		// 재료 셋팅
		dPrinter1.setMaterial(powder);
		
		// 재료를 꺼내서 확인
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
		// 재료셋팅
		dPrinter3.setMaterial(powder);
		
		// 자료를 꺼내보기
		Powder tempPowder2 = (Powder)dPrinter3.getMaterial(); // 다운캐스팅
		System.out.println(tempPowder2.toString());
		
		
	}

}





















