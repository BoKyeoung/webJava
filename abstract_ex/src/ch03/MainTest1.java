package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		Car aiCar = new AiCar();
		aiCar.run();
		System.out.println("==================");
		
		Car manualCar = new MaunalCar();
		manualCar.run();

	}

}
