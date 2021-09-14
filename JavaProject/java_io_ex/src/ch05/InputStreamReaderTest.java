package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
//		try(FileInputStream fi = new FileInputStream("assets/input2.txt")){
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("assets/input2.txt"))){
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
