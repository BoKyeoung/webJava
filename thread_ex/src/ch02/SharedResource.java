package ch02;

// 작업자들이 자원(데이터)을 공유하는 상황일 때 처리하는 방법
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

	// 입금 기능
	public void saveMoney(int money) {

		
		synchronized (this) {
			// 10만원 상태
			int currentMoney = getMoney();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(currentMoney + money);
			System.out.println("입금 후 계좌 잔액 : " + getMoney());

		}

	}

	// 출금 기능
	public synchronized void widthdrawMoney(int money) {
		// 10만원 상태
		int currentMoney = getMoney();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 방어적 코드
		if (currentMoney >= money) {
			setMoney(currentMoney - money);
			System.out.println("출금 후 계좌 잔액 : " + getMoney());
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
} // end of class

// 아버지
class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 입금하기
		account.saveMoney(10_000);
	}
}

// 어머니
class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 출금하기
		account.widthdrawMoney(5_000);
	}

}

public class SharedResource {

	public static void main(String[] args) {
		// 현재 10만원이 저금되어있는 상태로 객체생성
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);

		// 아버지가 입금하는 동작
		father.start();
		// 어머니가 출금하는 동작
		mother.start();
		// 정상처리 금액 : 10만원 + 1만원 - 5천원 = 10만5천원
		// 결과값 : 11만원 ?? (의도치않은 결과 발생)
		// 임계 영역 이될 때는 (작업자간에 자원을 공유하는 상태)
		// 다른 작업자가 사용하지 못하도록 lock을 걸어준다.

		// lock을 하는 방법 => 동기화 처리를 한다. (synchronization)
		// 1. synchronized 메서드를 사용하는 방법 -> 전체적인 범위
		// 2. synchronized 블럭을 사용하는 방법    -> 세세하게 지정할 때

	}

}
