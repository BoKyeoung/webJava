package ch01;

public class FunctionTest3 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;

		add(100, 50);

	} // end of main

	public static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	} // end of add

	// ���� 1. ���ϰ� int, �Ű����� n1, n2, n3, �̸��� intadd
	public static int add(int n1, int n2, int n3) {
		int result;
		result = n1 + n2 + n3;
		return result;
	} // end of intAdd

	// ���� 2. ���ϰ� double, �Ű����� d1, d2, �̸��� doubleAdd
	public static double doubleAdd(double d1, double d2) {
		double result;
		result = d1 + d2;
		return result;
	} // end of doubleAdd

	// ���� 3. ���ϰ� void, �Ű����� (String article) �̸��� printArticle
	public static void printArticle(String article) {
		System.out.println("[" + article + "]");
	} // end of printArticle
}
