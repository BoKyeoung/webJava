package ch13;

public class MainTest2 {

	public static void main(String[] args) {
		
		GateWay gateWay = new GateWay(1);
		
		Unit zealot1 = gateWay.creatUnit();
		Unit zealot2 = gateWay.creatUnit();
		Unit zealot3 = gateWay.creatUnit();
		
		zealot1.attack(zealot3);
		
		System.out.println(GateWay.zealotCount);
		
	}

}
