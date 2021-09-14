package ch12;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "�帣�°���ó��", "�Ŀ���ڿ���");
		Book book2 = new Book(2, "�÷���UI����", "���ȣ");
		Book book3 = new Book(3, "����ȭ�����Ǿ����ϴ�", "������");
		Book book4 = new Book(4, "�������θ����϶�", "������");
		Book book5 = new Book(5, "���ǿ���", "�����϶�");
		
		// ArrayList
		// �����
		
		// �����͸� ���� ���� �����
		// !ArrayList �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book> shoppingCart = new ArrayList<Book>();
		 
		// �߰� ��� 1
		// ������ �߰��ϱ�(�� �ֱ�) 3���� �־�ô�.
		shoppingCart.add(book1); // [0]
		shoppingCart.add(book2); // [1]
		shoppingCart.add(book3); // [2]
		
		// �߰� ��� 2
		shoppingCart.add(0, book3); // �ڵ����� ������ �и���� �о���.
		
		// ȭ�鿡 ���
		for(int i = 0; i < shoppingCart.size(); i++) { 
			// size(); = length, 
			// size = �޼ҵ� ȣ�� �� ������� ����, length = ����������� ȣ��
			shoppingCart.get(i).showInfo();
		}
		
		// �����ϴ� ���
		shoppingCart.remove(3);      // �ϳ��� ����� ���
		// ����
		System.out.println("===============");
		// ������ ���ϱ�
		int mySize = shoppingCart.size();
		System.out.println("MySize : " + mySize);
		// ArrayList�� ũ��� : 3
		// ArrayList�� �ε��� ũ��� : 2 , [0, 1, 2] n-1;
		// shoppingCart.remove(mySize); <= ����
		// mySize�� ũ�� = 3, index�� ũ�� : 2, �� - 1 �� �����
//		shoppingCart.remove(mySize - 1);
		// �� �ڵ� ���� �� = �ѹ��� �˸�Ǵ� ���̱� ������ �ѹ��� �ۼ�
//		shoppingCart.remove(shoppingCart.size() - 1);
		
		
		
		// shoppingCart.removeAll(); // ��� ����� ���
		System.out.println("===============");
		
		// ȭ�鿡 ���
		for(int i = 0; i < shoppingCart.size(); i++) { 
			shoppingCart.get(i).showInfo();
		}
		
		// �����ϱ� set
		shoppingCart.set(1, book4);
		// => 1�� index�� �����϶�
		
		System.out.println("==================");
		
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		// C R U D
		// create, read, update, delete
		
		
	} // end of main

} // end of class















