package ch05;

public class ForMainTest2 {

	public static void main(String[] args) {
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} // end of for - j
			System.out.println();
		} // end of for - i

	} // end of main

}
