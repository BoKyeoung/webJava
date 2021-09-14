package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long milisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				) {

			milisecond = System.currentTimeMillis();

			int i;
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}

			milisecond = System.currentTimeMillis() - milisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는데 " + milisecond + " 소요되었습니다");

//		Socket socket = new Socket();
//		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		br.readLine();
	}

}



















