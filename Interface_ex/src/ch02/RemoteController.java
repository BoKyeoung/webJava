package ch02;

public interface RemoteController {
	
	// �������̽�
	// 1. ������ ���� �ƹ��͵� ���� �ر׸��� �ִ� �⺻ ���赵
	// 2. �������, �Ϲ� �޼��带 ���� �� ����, ���� �߻�޼���� ������� ����� ���� �� �ִ�.
	// 3. �߻�Ŭ�������� �߻�ȭ�� �� ����
	// 4. �������̽��� ǥ��, ���, ��Ģ�̴�.
	
	// �������̽��� ����ϴ� ���� (�������̽��� �ϴ� ��)
	// 1. Ŭ������ ���α׷��� �����ϴ� ����� ���������� ����.
	// 2. ������ Ŭ���̾�Ʈ�� �ڵ���� ����̸� Ŭ������ ���α׷��� �����ϴ� ����
	// 3. Ŭ���̾�Ʈ ���α׷��� �������̽��� ����� �޼��� ������ ���� �̸� ���� ���ٽɡ�
	// 4. � ��ü�� �ϳ��� �������̽� Ÿ���̶�� ���� �� �������̽��� �����ϴ� ��� �޼��带 �����ߴٴ� �ǹ�.
	// 5. ������ ����
	
	// ���� ����.
	// ��� ��� ������ ������� �Ѵ�.
	public static final int SERIAL_NUMBER = 100;
	
	// ��� �޼���� �߻� �޼��忩�� �Ѵ�. ��, public abstact Ű����� ������ ����
	public abstract void turnOn(); // ���� �ۼ��� ��� - �߻�޼���
	void turnOff(); // puvlic abstract Ű���� ������ ��� - �߻� �޼���
	
	// ������ - �� (����, ��ü, ����)
	
	// �� ǥ�� ���� ��	
}