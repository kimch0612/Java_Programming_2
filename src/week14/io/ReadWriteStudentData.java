package week14.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteStudentData {
	public static void main(String[] args) {
		Student student = new Student(1, "Alice", 95.5);

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
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
