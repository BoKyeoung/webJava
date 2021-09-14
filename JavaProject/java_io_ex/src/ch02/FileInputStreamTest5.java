package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")) {
			
			byte[] bs = new byte[10];
//			fis.read(bs, 0, 5);
//			
//			for(byte b : bs) {
//				System.out.println((char) b);
//			}
			int i;
			while((i = fis.read(bs, 0, 5)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.print((char) bs [k]);
				}
				System.out.println(" : " + i + " 바이트 읽음");
			}
			
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
