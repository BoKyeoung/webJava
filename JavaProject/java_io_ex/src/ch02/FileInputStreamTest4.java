package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")){
			
			byte[] bs = new byte[10];
			int i;
			
			while((i = fis.read(bs)) != -1) {
//				for (byte b : bs) {
//					System.out.print((char) b );
//				}
				
				for(int j = 0; j <bs.length; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" : " + i + " 바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
