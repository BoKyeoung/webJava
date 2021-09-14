package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// return; // 심지어 리턴문이 있어도 finally가 실행됨.
			// 결과값 반환, 실행 반남, 		
		} catch(Exception e) {
			e.printStackTrace();                     
		} finally {
			// try문이 실행되면 반드시 실행 됨.
			System.out.println("여기도 실행이 되나요?");
		}
		
	}

}
