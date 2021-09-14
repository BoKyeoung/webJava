package ch03;

public abstract class Car {
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public abstract void wiper();
	
	public abstract void drive();
	
	public abstract void stop();
	
	// ��ũ(hook) �޼���
	// �ʿ��ϸ� ����ϴ� Ŭ�������� ���� �����ؼ� ����϶�
	public void washCar() {
		
	}
	
	// ���ø� �޼����� �ٽ� !!
	// final -> ���� Ŭ�������� ������ �� �� ���� ��.
	// ��, override �Ұ� 
	final public void run() {
		// �޼����� ���� (���ø��� ������ �� �ִ�)
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
