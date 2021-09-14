package ch12;

public class ArrayMainTest {

	// main �Լ�(�ڵ��� ������)
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�°���ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		// ����
		// �迭�� �̿��ؼ� shoppingCart ������ ��� ���ô�.
		// 1. �迭�� �����ϰ� ũ�⸦ 10���� �����ô�.
		Book[] shoppingCart = new Book[10];
		
		// 2. ������ å�� ��ٱ��Ͽ� ��ƺ��ô� (3��)
		shoppingCart[0] = book1;
		shoppingCart[1] = book3;
		shoppingCart[2] = book4;
		
		// 3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����ϼ���.
		for(int i = 0; i < shoppingCart.length; i++) {
			if(shoppingCart[i] != null) {
				shoppingCart[i].showInfo();
				
			}
		}
		
		// 4. 0��° �ε����� �������� ���� å�� �߰��ϰ� ������ �ִ�
		// [0], [1], [2] 
		shoppingCart[0] = book2;
		shoppingCart[1] = book1;
		shoppingCart[2] = book3;
		shoppingCart[3] = book4;
		
		System.out.println("=============");
		
		// Ȯ�� for��
		for (Book book : shoppingCart) {
			// ���࿡ null�� �ƴ϶�� ������ּ���.
			if(book != null) {
				book.showInfo();
			}
		}
		
		System.out.println("=============");
		
		// �ε��� 3���� ����������
		shoppingCart[3] = null;
		
		// Ȯ�� for��
		for(Book abg : shoppingCart) {
			// ����� �ڵ�
			if(abg != null) {
				abg.showInfo();
			}
		}
		

	} // end of main

} // end of class



















