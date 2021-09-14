package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		// try()
		// fileOutStre
		// A ~ Z
		// fos.write(bs, 2, 10); �迭�� 2���� ��ġ���� 10�� ����Ʈ ����ϱ�

		FileOutputStream fos = new FileOutputStream("putput2.txt",false);
		
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
			
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
