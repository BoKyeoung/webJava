package ch07;

public class BankMainTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(10000);
		bank.showInfo();
		bank.withdraw(5000);
		bank.showInfo();
		
		// ���� �����ڰ� �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������.
		
//		bank.balance = 1000000;
		bank.showInfo();
		
		// ���� ���� ������
		// 4����
		// public - ������ ������ ����Ѵ�.
		// default - ���� ��Ű�� �������� ������ ����Ѵ�.
		// protected - ��Ӱ��迡�� ������ ����Ѵ�.
		// private - ���� Ŭ���� �������� ������ ����Ѵ�.
		
	}

}