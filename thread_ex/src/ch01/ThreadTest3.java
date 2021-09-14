package ch01;

class MyThread3 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + " : " + Thread.currentThread());
		}
	}
}


public class ThreadTest3 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		// 문제
		// 쓰레드 3개 생성 
		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();
		MyThread3 th3 = new MyThread3();
		
		// 쓰레드 start() 호출
		th1.start();
		th2.start();
		th3.start();
		
		

	}

}
