package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhoneNumber {
	
	private ArrayList<String> userName = new ArrayList<>(); 
	private ArrayList<String> telNumber = new ArrayList<>();
	public ArrayList<String> getUserName() {
		return userName;
	}
	public ArrayList<String> getTelNumber() {
		return telNumber;
	}
	public void savePhoneNumber() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		String number = "";
		
		do {
			
			System.out.println("중지 하려면 -1을 입력하세요");
			System.out.println("*** 이름을 입력하세요 ***\n");
			name = scanner.nextLine();
			
			if(! name.equals("-1") ) {
				System.out.println("*** 전화번호를 입력하세요 ***\n");
				number = scanner.nextLine();
				userName.add(name);
				telNumber.add(number);
			}
			
		}while( ! (name.equals("-1")) );
		
	}
	
	public void showInfo() {
		System.out.println("-----------------------------------------");
		for (int i = 0; i < userName.size(); i++) {
			System.out.print("[" + userName.get(i)+ "] : \t");
			System.out.println(telNumber.get(i));
		}
		System.out.println("-----------------------------------------");
	}
	public static void main(String[] args) {
//		inputPhohneNumber.savePhoneNumber();
//		inputPhohneNumber.showInfo();
	}


}
