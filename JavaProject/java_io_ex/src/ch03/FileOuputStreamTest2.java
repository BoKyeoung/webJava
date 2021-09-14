package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("putput2.txt",false);
		
		// java 9부터 제공되는 기능
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			// 문제 1
			// for문 사용
			// 길이 26까지 반복해서 A - Z 파일에 작성해 봅시다.
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
			
		}catch (IOException e) {
			
		}

	}

}
