package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("putput2.txt",false);
		
		// java 9���� �����Ǵ� ���
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			// ���� 1
			// for�� ���
			// ���� 26���� �ݺ��ؼ� A - Z ���Ͽ� �ۼ��� ���ô�.
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
			
		}catch (IOException e) {
			
		}

	}

}
