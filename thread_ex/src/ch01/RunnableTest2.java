package ch01;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame {

	int grade = 10;

	// ���� �͸� ��ü�� ������ ��Ƽ� ����ϴ� ���.
	Runnable runable = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public MyRunnable2() {
		runable.run();
	}

}

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunnable2 runnable2 = new MyRunnable2();
		// �ܺο��� ���� ���� ����
		runnable2.runable.run();
	}

}






















