package ch02;

// �۾��ڵ��� �ڿ�(������)�� �����ϴ� ��Ȳ�� �� ó���ϴ� ���
class BankAccount {

	int money = 100_000;

	// getter
	public int getMoney() {
		return this.money;
	}

	// setter
	public void setMoney(int money) {
		this.money = money;
	}

	// �Ա� ���
	public void saveMoney(int money) {

		
		synchronized (this) {
			// 10���� ����
			int currentMoney = getMoney();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(currentMoney + money);
			System.out.println("�Ա� �� ���� �ܾ� : " + getMoney());

		}

	}

	// ��� ���
	public synchronized void widthdrawMoney(int money) {
		// 10���� ����
		int currentMoney = getMoney();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ����� �ڵ�
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("��� �� ���� �ܾ� : " + getMoney());
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}
} // end of class

// �ƹ���
class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// �Ա��ϱ�
		account.saveMoney(10_000);
	}
}

// ��Ӵ�
class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// ����ϱ�
		account.widthdrawMoney(5_000);
	}

}

public class SharedResource {

	public static void main(String[] args) {
		// ���� 10������ ���ݵǾ��ִ� ���·� ��ü����
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);

		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ��Ӵϰ� ����ϴ� ����
		mother.start();
		// ����ó�� �ݾ� : 10���� + 1���� - 5õ�� = 10��5õ��
		// ����� : 11���� ?? (�ǵ�ġ���� ��� �߻�)
		// �Ӱ� ���� �̵� ���� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		// �ٸ� �۾��ڰ� ������� ���ϵ��� lock�� �ɾ��ش�.

		// lock�� �ϴ� ��� => ����ȭ ó���� �Ѵ�. (synchronization)
		// 1. synchronized �޼��带 ����ϴ� ��� -> ��ü���� ����
		// 2. synchronized ���� ����ϴ� ���    -> �����ϰ� ������ ��

	}

}
