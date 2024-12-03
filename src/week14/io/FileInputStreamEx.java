package week14.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			int data;
			while ((data = fis.read()) != -1) { // 한 바이트씩 읽기
				System.out.print((char) data); // 문자로 변환하여 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
