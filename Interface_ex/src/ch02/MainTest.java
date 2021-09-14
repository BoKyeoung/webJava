package ch02;

public class MainTest {

	public static void main(String[] args) {
		
		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyRobot = new ToyRobot();
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("================");
		
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("================");
		
		toyRobot.turnOn();
		toyRobot.turnOff();
		System.out.println("================");

		// �迭���� ũ��� 3�� 0, 1, 2 �ν��Ͻ� ���� �־��ֱ�.
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyRobot;
		
		// ���� 1. Ȯ�� for���� �̿��ؼ� turnOn() �޼��� ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		System.out.println("================");
		
		// ���� 2. Ȯ�� for���� �̿��ؼ� turnOff() �޼��� ȣ��
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		System.out.println("================");
	
		// ���� 3. for���� �̿��ؼ� Ŭ����Ÿ���� ToyRobot �̸� name�� ȭ�鿡 ���.
		// instanceof ������, �ٿ�ĳ����
	
		// ���� & ���� (����� �ȳ� �� ���)
		// 1. for�� �����
		// 2. ���� ToyRobot => true{}
		// 3. (int) 0.8
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot) remote[i]).name; // <= �ٿ�ĳ����
				System.out.println(name);
			}
		}
		
		// �䱸 ���� �߰� !! �������̽� �߰�
		// ����� ���� �������� ��ε� �Ҹ��� ���� �϶�.
		// �峭�� �κ��� �����Ⱑ ���� ������ ��ε� �Ҹ��� ���� �϶�.
		
		// �������̽� ����.
		// 1. ǥ��ȭ�� �����ϴ� (ex, turnOn, turnOff)
		// 2. ���� ������� Ŭ�����鿡�� ���踦 �ξ���.
		// 3. Ŭ�������� ���յ��� ���缭 ������ �ڵ带 ������ �� �ִ�.
		
		// �������̽� ����
		// 1. ��ü���� �з������� �ٽ�
		// 2. ��ü�� ��ü���� ��ȣ�����ؼ� �ڵ带 �����س����� (����, ����ö, �л�, ��Ÿũ����Ʈ)
		// 3. ��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������ (���, ���԰���, �߻�Ŭ����, �������̽�)
		// 4. ������(Ŭ������ �پ��� ���·� �ٶ󺻴�)  ��OOP(��ü������)������ �ٽɡ�
	
	
	
	
	
	}
	
	
	
	
	
	

}
