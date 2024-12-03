package week14.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteStudentData {
	public static void main(String[] args) throws IOException{
		Student student = new Student(1, "Alice", 95.5);
// // 1. File 객체 생성 ("student.dat")
// 		File file = new File("/nas/std.dat");
// // 2. FileOutputStream 객체 생성
// 		FileOutputStream fos = new FileOutputStream(file);
// // 3. DataOutputStream 객체 생성
// 		DataOutputStream dos = new DataOutputStream(fos);

		try (DataOutputStream dos // 위 세 줄과 아래 새 줄은 같은 내용임
				= new DataOutputStream
				(new FileOutputStream("student.dat"))) {
			dos.writeInt(student.id);
			dos.writeUTF(student.name);
			dos.writeDouble(student.grade);
			System.out.println("학생 데이터 저장 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"))) {
			int id = dis.readInt();
			String name = dis.readUTF();
			double grade = dis.readDouble();

			System.out.println("읽은 학생 정보:");
			System.out.println("ID: " + id);
			System.out.println("이름: " + name);
			System.out.println("성적: " + grade);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
