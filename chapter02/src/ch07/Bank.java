package ch07;

public class Bank {
	
	// ���� ���� (private)
	private int balance;
	
	// �Ա�
	public void deposit(int money) {
		this.balance += money;
	}
	// ���
	public void withdraw(int money) {
		this.balance -= money;
	}
	// ���� ���
	public void showInfo() {
		System.out.println("���� �ܾ��� : " + this.balance + "�Դϴ�.");
	}

}